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

        data.add(new MenuItemData(R.drawable.alferedo, "Alfredo ", "50"));
        data.add(new MenuItemData(R.drawable.pasta1, "Tagliolini", "70"));
        data.add(new MenuItemData(R.drawable.pasta2, "Spaghetii", "60"));
        data.add(new MenuItemData(R.drawable.pasta3, "Chicken Pasta", "55"));
        data.add(new MenuItemData(R.drawable.pasta4, "Lasagna Pasta", "60"));
        data.add(new MenuItemData(R.drawable.pasta5, "Negresco Pasta","60"));


        recyclerView = view.findViewById(R.id.coldDrinkRecycler);
        recyclerView.setAdapter(meniItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}