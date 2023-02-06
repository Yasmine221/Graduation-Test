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


public class SweetsFragment extends Fragment {

    RecyclerView recyclerView;
    MeniItemAdapter meniItemAdapter;
    ArrayList <MenuItemData> data = new ArrayList<>();



    public SweetsFragment() {
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sweets, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setUpRecyclerView(view);
    }

    private void setUpRecyclerView (View view) {

        data.add(new MenuItemData(R.drawable.sweets1,"Chocolate Cake","40"));
        data.add(new MenuItemData(R.drawable.sweets2, "Molten Cake", "50"));
        data.add(new MenuItemData(R.drawable.sweets3, "Brownies", "50"));
        data.add(new MenuItemData(R.drawable.sweets4, "Mousse Cake", "55"));
        data.add(new MenuItemData(R.drawable.sweets5, "Strawberry Cake", "45"));
        data.add(new MenuItemData(R.drawable.sweets6, "Red Velvet","45"));
        data.add(new MenuItemData(R.drawable.sweets7, "Cookies", "35"));
        data.add(new MenuItemData(R.drawable.sweets8, "Pancake", "50"));
        data.add(new MenuItemData(R.drawable.sweets9, "Cheesecake","40"));
        data.add(new MenuItemData(R.drawable.sweets10, "Religieuse","40"));

        recyclerView = view.findViewById(R.id.sweetsRecycler);
        MeniItemAdapter meniItemAdapter = new MeniItemAdapter(data);
        recyclerView.setAdapter(meniItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));


    }
}
