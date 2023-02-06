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


public class HotDrinksFragment extends Fragment {

    RecyclerView recyclerView;
    MeniItemAdapter meniItemAdapter;
    ArrayList<MenuItemData> data = new ArrayList<>();

    public HotDrinksFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hot_drinks, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setUpRecyclerView(view);
    }


    private void setUpRecyclerView(View view) {

        data.add(new MenuItemData(R.drawable.hot1, "Turkish Coffee", "25"));
        data.add(new MenuItemData(R.drawable.hot2, "Frensh Coffee", "35"));
        data.add(new MenuItemData(R.drawable.hot3, "Cappichino", "40"));
        data.add(new MenuItemData(R.drawable.hot4, "Tea with milk", "35"));
        data.add(new MenuItemData(R.drawable.hot5, "Green tea", "30"));
        data.add(new MenuItemData(R.drawable.hot6, "Nescafe","40"));
        data.add(new MenuItemData(R.drawable.hot7, "Latte", "45"));
        data.add(new MenuItemData(R.drawable.hot8, "Mocha", "45"));
        data.add(new MenuItemData(R.drawable.hot9, "Americano","50"));
        data.add(new MenuItemData(R.drawable.hot10, "Tea","25"));


        recyclerView = view.findViewById(R.id.hotDrinkRecycler);
        MeniItemAdapter meniItemAdapter = new MeniItemAdapter(data);
        recyclerView.setAdapter(meniItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}