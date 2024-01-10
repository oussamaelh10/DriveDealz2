package com.example.drivedealz2.DAO;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.drivedealz2.Model.Car;

import java.util.List;

@Dao
public interface CarDao {

    @Insert
    void insertCar(Car car);

    @Query("SELECT * FROM Car ORDER BY model")
    LiveData<List<Car>> getAllCars();

    @Query("SELECT * FROM Car WHERE brand LIKE :brand")
    LiveData<List<Car>> getCarsByBrand(String brand);

    // Andere query-methoden voor Car entity

    @Update
    void updateCar(Car car);

    @Delete
    void deleteCar(Car car);
}
