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


public class PizzaFragment extends Fragment {

    RecyclerView recyclerView;
    MeniItemAdapter meniItemAdapter;
    ArrayList<MenuItemData> data = new ArrayList<>();

    public PizzaFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pizza, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setUpRecyclerView(view);
    }

    private void setUpRecyclerView(View view) {

        data.add(new MenuItemData(R.drawable.pizza1, "Cheese Pizza", "25"));
        data.add(new MenuItemData(R.drawable.pizza2, "Veggie Pizza", "35"));
        data.add(new MenuItemData(R.drawable.pizza3, "Pepperoni Pizza", "40"));
        data.add(new MenuItemData(R.drawable.pizza4, "Meat Pizza", "35"));
        data.add(new MenuItemData(R.drawable.pizza5, "Margherita Pizza", "30"));
        data.add(new MenuItemData(R.drawable.pizza6, "Buffalo Pizza","40"));
        data.add(new MenuItemData(R.drawable.pizza7, "Syperme Pizza", "45"));
        data.add(new MenuItemData(R.drawable.pizza8, "BBQ Pizza", "45"));
        data.add(new MenuItemData(R.drawable.pizza9, "Checkin Pizza","50"));


        recyclerView = view.findViewById(R.id.pizzaRecycler);
        MeniItemAdapter meniItemAdapter = new MeniItemAdapter(data);
        recyclerView.setAdapter(meniItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}