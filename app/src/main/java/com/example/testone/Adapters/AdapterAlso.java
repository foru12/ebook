package com.example.testone.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testone.Activity.Description;
import com.example.testone.R;
import com.example.testone.model.DataBest;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterAlso  extends RecyclerView.Adapter<AdapterAlso.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<DataBest> dataBests;
    Context activity;

    public AdapterAlso(Context context, List<DataBest> dataBests) {
        this.dataBests = dataBests;
        this.inflater = LayoutInflater.from(context);
        this.activity = context;
    }


    @NonNull
    @Override
    public AdapterAlso.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_also, parent, false);
        return new AdapterAlso.ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull AdapterAlso.ViewHolder holder, int position) {
        DataBest dataBest = dataBests.get(position);
        Picasso.get().load(dataBest.getImage()).into((holder.image));
    }

    @Override
    public int getItemCount() {
        return dataBests.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        ViewHolder(View view){
            super(view);
            image = view.findViewById(R.id.imageAlso);


        }
    }
}
