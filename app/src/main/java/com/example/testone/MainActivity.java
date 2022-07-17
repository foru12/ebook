package com.example.testone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.testone.GetInfo.Best;
import com.example.testone.GetInfo.Carousel;
import com.example.testone.GetInfo.Similar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Carousel carousel = new Carousel();
        carousel.getInfoRetrofitCarousel(this);
        Similar similar = new Similar();
        similar.getInfoRetrofitSimilar(this);

        Best best = new Best();
        best.getInfoRetrofitBest(this);

    }
}