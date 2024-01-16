package com.example.drivedealz2.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.exemple.DriveDealz.R;
import com.exemple.DriveDealz.databinding.ActivityCarDetailsBinding;

public class CarDetailsActivity extends AppCompatActivity {

    ActivityCarDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String brand = getIntent().getStringExtra("brand");
        String model = getIntent().getStringExtra("model");
        String year = getIntent().getStringExtra("year");
        String price = getIntent().getStringExtra("price");
        binding.brandModelText.setText(brand);
        binding.yearText.setText(year);
        binding.priceText.setText(price);
        binding.ModelTextView.setText(model);


    }
}
