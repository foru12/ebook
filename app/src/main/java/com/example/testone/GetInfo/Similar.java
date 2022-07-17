package com.example.testone.GetInfo;

import static android.util.Log.e;

import android.content.Context;
import android.util.Log;

import com.example.testone.RetrofitClient;
import com.example.testone.model.DataBest;
import com.example.testone.model.DataRate;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Similar {
    public void getInfoRetrofitSimilar(Context activity){


        try{
            RetrofitClient.getInstance()
                    .getApi()
                    .createSimular()
                    .enqueue(new Callback<List<DataBest>>() {
                        @Override
                        public void onResponse(Call<List<DataBest>> call, Response<List<DataBest>> response) {
                            List<DataBest> dataBests = response.body();
                            Log.e("LOOOG", dataBests.get(0).getImage());
                            Log.e("LOOOG", dataBests.get(1).getImage());
                            Log.e("LOOOG", dataBests.get(2).getImage());
                            Log.e("LOOOG", dataBests.get(2).getImage());

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
