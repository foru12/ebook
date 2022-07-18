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

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<DataBest> dataBests;
    Context activity;

    public Adapter(Context context, List<DataBest> dataBests) {
        this.dataBests = dataBests;
        this.inflater = LayoutInflater.from(context);
        this.activity = context;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        DataBest dataBest = dataBests.get(position);
        holder.autor.setText(dataBest.getAuthor());
        holder.name.setText(dataBest.getTitle());
        Picasso.get().load(dataBest.getImage()).into((holder.image));
        holder.price.setText(dataBest.getPrice().toString());
        holder.rate.setText(dataBest.getRate().getScore().toString() + " " + "(" + dataBest.getRate().getAmount().toString()  +")");
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, Description.class);
                intent.putExtra("imageUrl",dataBest.getImage());
                intent.putExtra("name",dataBest.getTitle());
                intent.putExtra("autor",dataBest.getAuthor());
                intent.putExtra("rate",dataBest.getRate().getScore().toString() + " " + "(" + dataBest.getRate().getAmount().toString()  +")");
                intent.putExtra("price",dataBest.getPrice().toString());
                activity.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return dataBests.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ConstraintLayout item;
        ImageView image;
        TextView name,autor,price,rate;
        ViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.name);
            autor = view.findViewById(R.id.autor);
            price = view.findViewById(R.id.price);
            rate = view.findViewById(R.id.rate);
            image = view.findViewById(R.id.image);
            item = view.findViewById(R.id.itemImage);

        }
    }
}
