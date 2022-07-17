package com.example.testone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testone.model.DataBest;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<DataBest> dataBests;

    Adapter(Context context, List<DataBest> dataBests) {
        this.dataBests = dataBests;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataBests.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(View view){
            super(view);

        }
    }
}
