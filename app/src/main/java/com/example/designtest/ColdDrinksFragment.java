package com.example.designtest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ColdDrinksFragment extends Fragment {

    RecyclerView recyclerView;
    MeniItemAdapter meniItemAdapter;
    ArrayList<MenuItemData> data = new ArrayList<>();

    public ColdDrinksFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_cold_drinks, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setUpRecyclerView(view);
    }

    private void setUpRecyclerView(View view) {

        data.add(new MenuItemData(R.drawable.cold1, "Soft Drinks ", "15"));
        data.add(new MenuItemData(R.drawable.cold2, "Ice Tea", "40"));
        data.add(new MenuItemData(R.drawable.cold3, "Ice Mocha", "50"));
        data.add(new MenuItemData(R.drawable.cold4, "Ice Coffee", "50"));
        data.add(new MenuItemData(R.drawable.cold5, "Avocado Juice", "45"));
        data.add(new MenuItemData(R.drawable.cold6, "Lemon","30"));
        data.add(new MenuItemData(R.drawable.cold7, "Watermelon Juice", "35"));
        data.add(new MenuItemData(R.drawable.cold8, "Strawbarrey", "35"));
        data.add(new MenuItemData(R.drawable.cold9, "Orange", "30"));
        data.add(new MenuItemData(R.drawable.cold10, "Pineapple","40"));
        data.add(new MenuItemData(R.drawable.cold11, "Smoothie", "45"));

        recyclerView = view.findViewById(R.id.coldDrinkRecycler);
        MeniItemAdapter meniItemAdapter = new MeniItemAdapter(data);
        recyclerView.setAdapter(meniItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}