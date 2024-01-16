package com.example.drivedealz2.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.drivedealz2.Adapter.CarListAdapter;
import com.example.drivedealz2.Model.Car;
import com.example.drivedealz2.View.CarViewModel;
import com.exemple.DriveDealz.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class CarListFragment extends Fragment {

    private CarListAdapter carListAdapter;

    private List<Car> carList;

    private FloatingActionButton fab;

    public CarListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_car_list, container, false);


        // Laad de lijst met auto's en stel deze in op de adapter
        // carListAdapter.setCarList(loadCarList()); // Implementeer deze methode volgens jouw gegevensbron

        return rootView;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        carList = new ArrayList<>();
        // Hier kun je de views gebruiken zoals nodig
        RecyclerView recyclerView = view.findViewById(R.id.RecyclerViewCarList);
        carListAdapter = new CarListAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);  // Hier wordt de layoutManager ingesteld
        recyclerView.setAdapter(carListAdapter);
        fab = view.findViewById(R.id.floatingActionButton);

        CarViewModel carViewModel = new ViewModelProvider(this).get(CarViewModel.class);

        carViewModel.getAllCars().observe(getViewLifecycleOwner(), cars -> {
            carList.clear();
            carListAdapter.setCarList(cars);
            carList.addAll(cars);
            carListAdapter.notifyDataSetChanged();
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_fragment_car_list_to_new_car_fragment);
            }
        });

    }





}
