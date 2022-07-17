package com.example.testone;

import com.example.testone.model.DataBest;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    @GET("best")
    Call<List<DataBest>> createBase();


    @GET("similar")
    Call<List<DataBest>> createSimular();


    @GET("carousel")
    Call<List<DataBest>> createcarousel();




}
