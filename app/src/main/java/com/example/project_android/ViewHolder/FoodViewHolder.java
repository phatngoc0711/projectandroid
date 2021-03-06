package com.example.project_android.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_android.Interface.ItemClickListener;
import com.example.project_android.R;

public class FoodViewHolder  extends RecyclerView.ViewHolder
        implements View.OnClickListener{

    public TextView food_name;
    public TextView food_price;
    public ImageView food_image, quick_cart;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    private ItemClickListener itemClickListener;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        food_name = (TextView) itemView.findViewById(R.id.food_name);
        food_image = (ImageView) itemView.findViewById(R.id.food_image);
        food_price = (TextView) itemView.findViewById(R.id.food_price);
        quick_cart = (ImageView)itemView.findViewById(R.id.btn_quickcart);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);

    }
}
