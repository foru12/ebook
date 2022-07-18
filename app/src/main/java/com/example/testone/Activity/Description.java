package com.example.testone.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.testone.GetInfo.Similar;
import com.example.testone.R;
import com.example.testone.model.DataBest;
import com.squareup.picasso.Picasso;

public class Description extends AppCompatActivity {
    ImageView image;
    TextView name,autor,price,rate;
    RelativeLayout btnBack;
    String[] listIntent = new String[]{"name","autor","price","rate","imageUrl"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Similar similar = new Similar();
        similar.getInfoRetrofitSimilar(this);

        name = findViewById(R.id.nameDesc);
        autor = findViewById(R.id.autorDesc);
        price = findViewById(R.id.priceDesc);
        rate = findViewById(R.id.rateDesc);
        image = findViewById(R.id.imageDesc);
        btnBack = findViewById(R.id.btnBack);

        String nametxt = getIntent().getStringExtra(listIntent[0]);
        String autortxt = getIntent().getStringExtra(listIntent[1]);
        String pricetxt = getIntent().getStringExtra(listIntent[2]);
        String ratetxt = getIntent().getStringExtra(listIntent[3]);
        String imageUrltxt = getIntent().getStringExtra(listIntent[4]);

        name.setText(nametxt);
        autor.setText(autortxt);
        price.setText(pricetxt);
        rate.setText(ratetxt);
        Picasso.get().load(imageUrltxt).into((image));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Description.this,MainActivity.class));
                finish();
            }
        });











    }
}