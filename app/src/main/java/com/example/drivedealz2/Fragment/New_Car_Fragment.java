package com.example.drivedealz2.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

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
        View rootView = inflater.inflate(R.layout.fragment_new__car_, container, false);



        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        carViewModel = new ViewModelProvider(this).get(CarViewModel.class);

        brand = view.findViewById(R.id.editTextBrand);
        model = view.findViewById(R.id.editTextModel);
        year = view.findViewById(R.id.editTextYear);
        price = view.findViewById(R.id.editTextPrice);
        button = view.findViewById(R.id.buttonAddCar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Controleer op null voordat je de insertCar-methode aanroept

                String brandString = brand.getText().toString();
                String modelString = model.getText().toString();
                String yearString = year.getText().toString();
                String priceString = price.getText().toString();
                Car toSave = new Car(brandString, modelString, yearString, priceString);
                toSave.setBrand(brandString);
                toSave.setModel(modelString);
                toSave.setYear(yearString);
                toSave.setPrice(priceString);
                carViewModel.insertCar(toSave);

                Navigation.findNavController(v).navigate(R.id.action_fragment_new_car_to_fragment_car_list);

            }

        });
    }
}
