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


public class SandwichFragment extends Fragment {

    RecyclerView recyclerView;
    MeniItemAdapter meniItemAdapter;
    ArrayList<MenuItemData> data = new ArrayList<>();

    public SandwichFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sandwich, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setUpRecyclerView(view);
    }

    private void setUpRecyclerView(View view) {

        data.add(new MenuItemData(R.drawable.sandwich1, "Hotdog Sandwich", "25"));
        data.add(new MenuItemData(R.drawable.sandwich2, "Chicken Sandwich", "35"));
        data.add(new MenuItemData(R.drawable.sandwich3, "Faheta Sandwich", "40"));
        data.add(new MenuItemData(R.drawable.sandwich4, "Chicken Shawrma Sandwich", "35"));
        data.add(new MenuItemData(R.drawable.sandwich5, "Kofta Sandwich", "30"));
        data.add(new MenuItemData(R.drawable.sandwich6, "Cheese Burger Sandwich","40"));


        recyclerView = view.findViewById(R.id.sandwichRecycler);
        MeniItemAdapter meniItemAdapter = new MeniItemAdapter(data);
        recyclerView.setAdapter(meniItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}