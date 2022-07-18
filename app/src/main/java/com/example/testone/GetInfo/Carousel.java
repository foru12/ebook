package com.example.testone.GetInfo;

import static android.util.Log.e;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testone.Adapters.AdapterUpScrol;
import com.example.testone.R;
import com.example.testone.Retrofit.RetrofitClient;
import com.example.testone.model.DataBest;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Carousel {
    RecyclerView rcViewUpScrol;
    List<DataBest> list;
    public void getInfoRetrofitCarousel(Context activity){


        try{
            RetrofitClient.getInstance()
                    .getApi().createcarousel()
                    .enqueue(new Callback<List<DataBest>>() {
                        @SuppressLint("NotifyDataSetChanged")
                        @Override
                        public void onResponse(@NonNull Call<List<DataBest>> call, @NonNull Response<List<DataBest>> response) {

                            // List<DataBest> dataBests = response.body();
                            list = response.body();

                            Log.e("LOOOG", list.get(0).getImage());
                            Log.e("LOOOG", list.get(1).getImage());
                            Log.e("LOOOG", list.get(2).getImage());
                            //Log.e("LO00G", String.valueOf(dataBests.get(0).getRate()));
                            // Log.e("LOOOG", dataBests.get(3).getImage());
                            rcViewUpScrol = ((Activity) activity).findViewById(R.id.rcViewUpScrol);
                            LinearLayoutManager llm = new LinearLayoutManager(activity);
                            llm.setOrientation(LinearLayoutManager.HORIZONTAL);
                            rcViewUpScrol.setLayoutManager(llm);
                            AdapterUpScrol adapter = new AdapterUpScrol(activity,list);
                            rcViewUpScrol.setAdapter(adapter);
                            adapter.notifyDataSetChanged();


                        }

                        @Override
                        public void onFailure(@NonNull Call<List<DataBest>> call, @NonNull Throwable t) {
                            Log.e("LOOOG", t.getMessage());

                        }
                    });

        }
        catch (Exception e){
            e("er"," " + e);
        }





    }





}
