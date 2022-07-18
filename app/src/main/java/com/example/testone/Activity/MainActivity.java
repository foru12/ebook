package com.example.testone.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.testone.Adapters.Adapter;
import com.example.testone.GetInfo.Best;
import com.example.testone.GetInfo.Carousel;
import com.example.testone.GetInfo.Similar;
import com.example.testone.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Carousel carousel = new Carousel();
        carousel.getInfoRetrofitCarousel(this);

        Best best = new Best();
        best.getInfoRetrofitBest(this);




    }
}