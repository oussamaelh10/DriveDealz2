package com.example.drivedealz2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.drivedealz2.Fragment.CarListFragment;
import com.example.drivedealz2.Fragment.HomeFragment;
import com.example.drivedealz2.View.CarViewModel;
import com.exemple.DriveDealz.R;
import com.exemple.DriveDealz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private AppBarConfiguration appBarConfiguration;

    private NavController navController;

    private CarViewModel carViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carViewModel = new ViewModelProvider(this).get(CarViewModel.class);

        Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        button = findViewById(R.id.buttonCarList);


        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container_view);
        navController = navHostFragment.getNavController();

        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        }

        public void navigateToCarList(View view) {

            navController.navigate(R.id.fragment_car_list);

        }




}