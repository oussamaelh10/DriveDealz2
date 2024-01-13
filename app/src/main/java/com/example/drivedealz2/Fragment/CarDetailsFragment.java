package com.example.drivedealz2.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

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
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_car_details, container, false);

            // Hier initialiseren we de views met findViewById
            TextView brandModelText = view.findViewById(R.id.brandModelText);
            TextView yearText = view.findViewById(R.id.yearText);
            TextView priceText = view.findViewById(R.id.priceText);
            TextView fuelConsumptionText = view.findViewById(R.id.fuelConsumptionText);
            ImageView carImage = view.findViewById(R.id.carImage);

            // Hier kun je de views gebruiken zoals nodig

            return view;
        }
    }
