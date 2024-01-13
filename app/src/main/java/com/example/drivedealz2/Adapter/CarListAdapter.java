package com.example.drivedealz2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drivedealz2.Fragment.CarDetailsFragment;
import com.example.drivedealz2.Model.Car;
import com.exemple.DriveDealz.R;

import java.util.ArrayList;
import java.util.List;


public class CarListAdapter extends RecyclerView.Adapter<CarListAdapter.CarItemViewHolder> {

    private List<Car> carList;
    private Context context;

    public class CarItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView carImageView;
        public TextView brandTextView;

        public CarItemViewHolder(View itemView) {
            super(itemView);
            carImageView = itemView.findViewById(R.id.imageView);
            brandTextView = itemView.findViewById(R.id.TextViewBrand);
        }
    }

    // Andere methoden voor de adapter

    @Override
    public void onBindViewHolder(@NonNull CarItemViewHolder holder, int position) {
        Car currentCar = carList.get(position);

        // Zet de gegevens in het item
        holder.brandTextView.setText(currentCar.getBrand() + " " + currentCar.getModel());

        // Voeg een click event listener toe


    }
    @NonNull
    @Override
    public CarItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item, parent, false);
        CarItemViewHolder evh = new CarItemViewHolder(v);
        return evh;
    }
    @Override
    public int getItemCount() {
        return carList.size();
    }
    public void AddItems(List<Car> cars){
        this.carList = new ArrayList<Car>();
        this.carList.addAll(cars);
    }

    // Andere methoden voor de adapter





}

