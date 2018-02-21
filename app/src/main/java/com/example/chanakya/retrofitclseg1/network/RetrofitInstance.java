package com.example.chanakya.retrofitclseg1.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chanakya on 2/21/18.
 */

public class RetrofitInstance {

    public static String BASE_URL = "http://navjacinth9.000webhostapp.com/json/";

    static Retrofit retrofit = null;


    public static Retrofit getRetrofitInstance(){
        retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }



}
