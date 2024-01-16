package com.example.drivedealz2.Fragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.exemple.DriveDealz.R;


public class CarDetailsFragment extends Fragment {



    public CarDetailsFragment() {
        // Required empty public constructor
    }

        // Andere bestaande code voor het fragment

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_car_details, container, false);

        // Hier initialiseren we de views met findViewById
        TextView brandModelText = view.findViewById(R.id.brandModelText);
        TextView yearText = view.findViewById(R.id.yearText);
        TextView priceText = view.findViewById(R.id.priceText);
        TextView fuelConsumptionText = view.findViewById(R.id.fuelConsumptionText);
        ImageView carImage = view.findViewById(R.id.carImage);

        // Haal de gegevens uit de bundel
        Bundle arguments = getArguments();
        if (arguments != null) {
            String brand = arguments.getString("brand", "");
            String model = arguments.getString("model", "");
            String year = arguments.getString("year", "");
            String price = arguments.getString("price", "");

            // Log de ontvangen gegevens
            Log.d("CarDetailsFragment", "Received brand: " + brand);
            Log.d("CarDetailsFragment", "Received model: " + model);
            Log.d("CarDetailsFragment", "Received year: " + year);
            Log.d("CarDetailsFragment", "Received price: " + price);

            // Vul de views met de gegevens
            brandModelText.setText(brand + " " + model);
            yearText.setText(year);
            priceText.setText(price);
            // Voeg andere views toe en vul ze met gegevens indien nodig
        }

        // Hier kun je de views gebruiken zoals nodig

        return view;
    }

}
