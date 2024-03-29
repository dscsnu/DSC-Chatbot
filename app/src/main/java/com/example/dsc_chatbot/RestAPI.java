package com.example.dsc_chatbot;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestAPI {
    static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    //Creating a retrofit object
    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(RestService.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson)) //Here we are using the GsonConverterFactory to directly convert json data to object
            .build();

    public static RestService getAppService(){
        return retrofit.create(RestService.class);
    }
}
