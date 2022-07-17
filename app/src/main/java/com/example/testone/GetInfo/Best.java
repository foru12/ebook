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

public class Best {
    public void getInfoRetrofitBest(Context activity){


        try{
            RetrofitClient.getInstance()
                    .getApi()
                    .createBase()
                    .enqueue(new Callback<List<DataBest>>() {
                        @Override
                        public void onResponse(Call<List<DataBest>> call, Response<List<DataBest>> response) {
                            List<DataBest> dataBests = response.body();
                           // List<DataRate> dataRates = new ArrayList(Arrays.asList(dataBests.get(0)));
                            Log.e("Best",dataBests.get(0).getTitle());
                            Log.e("Best",dataBests.get(0).getAuthor());
                            Log.e("Best", String.valueOf(dataBests.get(0).getPrice()));
                            Log.e("Best",dataBests.get(0).getImage());
                            Log.e("Best 1", String.valueOf(dataBests.get(0).getRate().getScore()));
                            Log.e("Best 1", String.valueOf(dataBests.get(0).getRate().getAmount()));




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
