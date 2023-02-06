package com.example.designtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MeniItemAdapter extends RecyclerView.Adapter<MeniItemAdapter.MenuHolder> {

    private List <MenuItemData> data;

    public MeniItemAdapter(List<MenuItemData> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MenuHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.object_menu_item_layout,parent,false);
        return new MenuHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuHolder holder, int position) {

        MenuItemData menuItemData = data.get(position);

        holder.itemImg.setImageResource(menuItemData.getItemImage());
        holder.itemName.setText(menuItemData.getItemName());
        holder.itemPrice.setText(menuItemData.getItemPrice());
    }

    @Override
    public int getItemCount() {

        if ( data != null)
            return data.size();
        return 0;
    }

    class MenuHolder extends RecyclerView.ViewHolder {

        ImageView itemImg;
        TextView itemName, itemPrice;

        public MenuHolder(@NonNull View itemView) {
            super(itemView);

            itemImg= itemView.findViewById(R.id.itemImg);
            itemName = itemView.findViewById(R.id.itemName);
            itemPrice = itemView.findViewById(R.id.itemPrice);

        }
    }
}


