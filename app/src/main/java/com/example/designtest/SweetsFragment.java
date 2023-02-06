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

        data.add(new MenuItemData(R.drawable.donut,"dount","40","jsjkdxklkskx"));
        data.add(new MenuItemData(R.drawable.donut,"dount","40","jsjkdxklkskx"));
        data.add(new MenuItemData(R.drawable.donut,"dount","40","jsjkdxklkskx"));
        data.add(new MenuItemData(R.drawable.donut,"dount","40","jsjkdxklkskx"));
        data.add(new MenuItemData(R.drawable.donut,"dount","40","jsjkdxklkskx"));
        data.add(new MenuItemData(R.drawable.donut,"dount","40","jsjkdxklkskx"));
        data.add(new MenuItemData(R.drawable.donut,"dount","40","jsjkdxklkskx"));
        data.add(new MenuItemData(R.drawable.donut,"dount","40","jsjkdxklkskx"));
        data.add(new MenuItemData(R.drawable.donut,"dount","40","jsjkdxklkskx"));

        recyclerView = view.findViewById(R.id.sweetsRecycler);
        recyclerView.setAdapter(meniItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));


    }
}
