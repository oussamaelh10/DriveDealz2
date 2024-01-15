package com.example.drivedealz2.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drivedealz2.Fragment.CarDetailsFragment;
import com.example.drivedealz2.Model.Car;
import com.exemple.DriveDealz.R;
import java.util.ArrayList;
import java.util.List;

public class CarListAdapter extends RecyclerView.Adapter<CarListAdapter.CarItemViewHolder> {

    private List<Car> carList;
    private Context context;

    public CarListAdapter(Context context) {
        this.context = context;
        this.carList = new ArrayList<>();
    }

    @NonNull
    @Override
    public CarItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item, parent, false);
        return new CarItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CarItemViewHolder holder, int position) {
        Car currentCar = carList.get(position);

        // Zet de gegevens in het item
        holder.textViewBrand.setText(currentCar.getBrand());
        holder.textViewModel.setText(currentCar.getModel());
        holder.textViewYear.setText(currentCar.getYear());
        holder.textViewPrice.setText(currentCar.getPrice());

        // Voeg een click event listener toe
        holder.buttonDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hier voeg je de code toe om naar CarDetailsFragment te navigeren
                openCarDetailsFragment(currentCar);
                // Handle button click, you can navigate to details fragment or perform other actions
            }


            // Voeg deze methode toe aan je adapter om naar CarDetailsFragment te navigeren
            private void openCarDetailsFragment(Car car) {
                // Creëer een nieuw CarDetailsFragment
                CarDetailsFragment carDetailsFragment = new CarDetailsFragment();

                // Stel het bundelobject in om gegevens naar CarDetailsFragment te verzenden
                Bundle bundle = new Bundle();
                bundle.putString("brand", car.getBrand());
                bundle.putString("model", car.getModel());
                bundle.putString("year", car.getYear());
                bundle.putString("price", car.getPrice());
                carDetailsFragment.setArguments(bundle);

                // Navigeer naar CarDetailsFragment
                FragmentTransaction transaction = ((FragmentActivity) context).getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, carDetailsFragment);
                transaction.addToBackStack(null);
                transaction.commit();


                // Verberg de lijstcontainer
                View carListContainer = ((FragmentActivity) context).findViewById(R.id.fragment_container);
                carListContainer.setVisibility(View.GONE);

            }
        });
        }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    public void setCarList(List<Car> cars) {
        this.carList.clear();
        this.carList.addAll(cars);
        notifyDataSetChanged(); // Notify the adapter that the dataset has changed
    }

    // ViewHolder class
    public static class CarItemViewHolder extends RecyclerView.ViewHolder {
        private ImageView carImageView;
        private TextView textViewBrand;
        private TextView textViewModel;
        private TextView textViewYear;
        private TextView textViewPrice;
        private Button buttonDetails;

        public CarItemViewHolder(View itemView) {
            super(itemView);
            carImageView = itemView.findViewById(R.id.imageView);
            textViewBrand = itemView.findViewById(R.id.TextViewBrand);
            textViewModel = itemView.findViewById(R.id.textViewModel);
            textViewYear = itemView.findViewById(R.id.textViewYear);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            buttonDetails = itemView.findViewById(R.id.ButtonDetails);
        }
    }
}
