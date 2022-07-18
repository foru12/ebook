package com.example.testone.GetInfo;

import static android.util.Log.e;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testone.Adapters.Adapter;
import com.example.testone.Adapters.AdapterAlso;
import com.example.testone.R;
import com.example.testone.Retrofit.RetrofitClient;
import com.example.testone.model.DataBest;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Similar {
    AdapterAlso adapter;
    RecyclerView rcView;
    List<DataBest> list;

    public void getInfoRetrofitSimilar(Context activity){
        try{
            RetrofitClient.getInstance()
                    .getApi()
                    .createSimular()
                    .enqueue(new Callback<List<DataBest>>() {
                        @SuppressLint("NotifyDataSetChanged")
                        @Override
                        public void onResponse(Call<List<DataBest>> call, Response<List<DataBest>> response) {
                            list = response.body();
                            //List<DataBest> dataBests = response.body();
                            Log.e("LOOOG", list.get(0).getImage());
                            Log.e("LOOOG", list.get(1).getImage());
                            Log.e("LOOOG", list.get(2).getImage());
                            Log.e("LOOOG", list.get(2).getImage());
                            rcView = ((Activity) activity).findViewById(R.id.rcAlso);
                            LinearLayoutManager llm = new LinearLayoutManager(activity);
                            llm.setOrientation(LinearLayoutManager.HORIZONTAL);
                            rcView.setLayoutManager(llm);
                            adapter = new AdapterAlso(activity,list);
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
