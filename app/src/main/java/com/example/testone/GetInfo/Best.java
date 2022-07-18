package com.example.testone.GetInfo;

import static android.util.Log.e;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testone.Adapters.Adapter;
import com.example.testone.R;
import com.example.testone.Retrofit.RetrofitClient;
import com.example.testone.model.DataBest;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Best {
    Adapter adapter;
    RecyclerView rcView;
    List<DataBest> list;
    public void getInfoRetrofitBest(Context activity){


        try{
            RetrofitClient.getInstance()
                    .getApi()
                    .createBase()
                    .enqueue(new Callback<List<DataBest>>() {
                        @SuppressLint("NotifyDataSetChanged")
                        @Override
                        public void onResponse(Call<List<DataBest>> call, Response<List<DataBest>> response) {
                            //List<DataBest> dataBests = response.body();
                            list = response.body();
                            // List<DataRate> dataRates = new ArrayList(Arrays.asList(dataBests.get(0))
                            Log.e("Best",list.get(0).getTitle());
                            Log.e("Best",list.get(0).getAuthor());
                            Log.e("Best", String.valueOf(list.get(0).getPrice()));
                            Log.e("Best",list.get(0).getImage());
                            Log.e("Best",list.get(0).getImage());
                            Log.e("Best",list.get(0).getImage());
                            Log.e("Best",list.get(0).getImage());
                            Log.e("Best",list.get(0).getImage());
                            Log.e("Best",list.get(0).getImage());

                            Log.e("Best 1", String.valueOf(list.get(0).getRate().getScore()));
                            Log.e("Best 1", String.valueOf(list.get(0).getRate().getAmount()));

                            rcView = ((Activity) activity).findViewById(R.id.rcView);
                            rcView.setLayoutManager(new LinearLayoutManager(activity));
                            adapter = new Adapter(activity,list);
                            rcView.setAdapter(adapter);
                            adapter.notifyDataSetChanged();




                        }

                        @Override
                        public void onFailure(Call<List<DataBest>> call, Throwable t) {
                            Log.e("ERROR",t.getMessage());

                        }
                    });

        }
        catch (Exception e){
            e("er"," " + e);
        }





    }

}
