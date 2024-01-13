package com.example.drivedealz2.View;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.drivedealz2.Model.Car;
import com.example.drivedealz2.Model.DriveDealzDatabase;

public class CarViewModel extends AndroidViewModel {

    private ExecutorService mExecutorService;
    private DriveDealzDatabase mDataBass;

        public CarViewModel(@NonNull Application application) {
        super(application);
        mExecutorService = Executors.newFixedThreadPool(2);
        mDataBass = DriveDealzDatabase.getInstance(application);
    }

    public void insertCar (Car car){
        mExecutorService.execute(() -> mDataBass.CarDao().insertCar(car));
    }

    public LiveData<List<Car>> getAllCars () {
        return mDataBass.CarDao().getAllCars();
    }

    public LiveData<List<Car>> getCarsByBrand (String brand){
        return mDataBass.CarDao().getCarsByBrand(brand);
    }

    public void updateCar (Car car){
        mExecutorService.execute(() -> mDataBass.CarDao().updateCar(car));
    }

    public void deleteCar (Car car){
        mExecutorService.execute(() -> mDataBass.CarDao().deleteCar(car));
    }
}


