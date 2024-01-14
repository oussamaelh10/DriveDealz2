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
import com.example.drivedealz2.View.CarViewModel;
import com.exemple.DriveDealz.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class CarListFragment extends Fragment {

    private CarListAdapter carListAdapter;

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
        // Hier kun je de views gebruiken zoals nodig
        RecyclerView recyclerView = view.findViewById(R.id.RecyclerViewCarList);
        carListAdapter = new CarListAdapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);  // Hier wordt de layoutManager ingesteld
        recyclerView.setAdapter(carListAdapter);
        fab = view.findViewById(R.id.floatingActionButton);
        fab.setOnClickListener( (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               replaceFragment(new New_Car_Fragment());
            }
        }));
        CarViewModel carViewModel = new ViewModelProvider(getActivity()).get(CarViewModel.class);
        carViewModel.getAllCars().observe(getViewLifecycleOwner(), cars -> {
            carListAdapter.AddItems(cars);
            carListAdapter.notifyDataSetChanged();
        });

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }




}
