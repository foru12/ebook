package com.example.testone.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testone.R;
import com.example.testone.model.DataBest;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterUpScrol extends RecyclerView.Adapter<AdapterUpScrol.MyViewHolder>{

    private final LayoutInflater inflater;
    private final List<DataBest> dataBests;

    public AdapterUpScrol(Context context, List<DataBest> dataBests) {
        this.dataBests = dataBests;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public AdapterUpScrol.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item_up_scrol, parent, false);
        return new AdapterUpScrol.MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull AdapterUpScrol.MyViewHolder holder, int position) {
        DataBest dataBest = dataBests.get(position);
        Log.e("AdapterUpScrol", dataBest.getImage());
        Picasso.get().load(dataBest.getImage()).into((holder.image));

    }

    @Override
    public int getItemCount() {
        return dataBests.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        MyViewHolder(View view){
            super(view);
            image = view.findViewById(R.id.imageUpScrol);

        }
    }
}
