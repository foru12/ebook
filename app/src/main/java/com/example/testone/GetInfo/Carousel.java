package com.example.testone.GetInfo;

import static android.util.Log.e;

import android.content.Context;
import android.util.Log;

import com.example.testone.RetrofitClient;
import com.example.testone.model.DataBest;
import com.example.testone.model.DataRate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Carousel {

    public void getInfoRetrofitCarousel(Context activity){


        try{
            RetrofitClient.getInstance()
                    .getApi().createcarousel()
                    .enqueue(new Callback<List<DataBest>>() {
                        @Override
                        public void onResponse(Call<List<DataBest>> call, Response<List<DataBest>> response) {

                                List<DataBest> dataBests = response.body();

                            List<DataRate> dataRates = new ArrayList<>();

                            Log.e("LOOOG", dataBests.get(0).getImage());
                            Log.e("LOOOG", dataBests.get(1).getImage());
                            Log.e("LOOOG", dataBests.get(2).getImage());
                            //Log.e("LO00G", String.valueOf(dataBests.get(0).getRate()));
                           // Log.e("LOOOG", dataBests.get(3).getImage());



                        }

                        @Override
                        public void onFailure(Call<List<DataBest>> call, Throwable t) {
                            Log.e("LOOOG", t.getMessage());

                        }
                    });

        }
        catch (Exception e){
            e("er"," " + e);
        }





    }





}
