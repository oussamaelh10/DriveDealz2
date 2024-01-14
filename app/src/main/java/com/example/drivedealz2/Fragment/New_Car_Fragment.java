package com.example.drivedealz2.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.drivedealz2.Model.Car;
import com.example.drivedealz2.View.CarViewModel;
import com.exemple.DriveDealz.R;


public class New_Car_Fragment extends Fragment {


   private CarViewModel carViewModel;
   private Button button;
   private EditText brand;
    private EditText model;
    private EditText year;
    private EditText price;

    public New_Car_Fragment() {

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new__car_, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       brand = view.findViewById(R.id.editTextBrand);
       model = view.findViewById(R.id.editTextModel);
       year = view.findViewById(R.id.editTextYear);
       price = view.findViewById(R.id.editTextPrice);
       button = view.findViewById(R.id.buttonAddCar);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String brandString = brand.getText().toString();
               String modelString = model.getText().toString();
               String yearString = year.getText().toString();
               String priceString = price.getText().toString();
               Car toSave = new Car(brandString,modelString,yearString,priceString);
               toSave.setBrand(brandString);
                toSave.setModel(modelString);
                toSave.setYear(yearString);
                toSave.setPrice(priceString);
                carViewModel.insertCar(toSave);
               FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,new CarListFragment()).commit();
               brand.setVisibility(View.GONE);
                model.setVisibility(View.GONE);
                year.setVisibility(View.GONE);
                price.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
           }
       });
    }
}