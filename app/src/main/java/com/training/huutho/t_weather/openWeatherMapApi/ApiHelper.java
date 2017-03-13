package com.training.huutho.t_weather.openWeatherMapApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HuuTho on 3/13/2017.
 */

public class ApiHelper {
    public static Retrofit getRetrofit(){
        return  new Retrofit.Builder()
                .baseUrl(ApiConfig.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
