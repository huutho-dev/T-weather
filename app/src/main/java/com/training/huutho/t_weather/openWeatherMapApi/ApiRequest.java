package com.training.huutho.t_weather.openWeatherMapApi;

import com.training.huutho.t_weather.base.BaseEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by HuuTho on 3/13/2017.
 */

public interface ApiRequest<E extends BaseEntity> {

    /**
     * @param lat coordinates of the location of your interest
     * @param lon coordinates of the location of your interest
     * @param type type=like,accurate
     * @return
     */
    @GET(ApiConfig.API_CURRENT_WEATHER)
    Call<E> getCurrentWeather(@Query("lat") String lat, @Query("lon") String lon, @Query("type") String type);


    /**
     * Description:
     * JSON returns data from cities laid within definite circle that is specified by center point ('lat', 'lon')
     * and expected number of cities ('cnt') around this point. The default number of cities is 10, the maximum is 50.
     *
     * @param lat latitude
     * @param lon longitude
     * @param cnt number of cities around the point that should be returned
     * @param type type=like,accurate
     * @return
     */

    @GET(ApiConfig.API_CURRENT_CITIES_IN_CYCLE)
    Call<E> getCurrentWeatherInCycle(@Query("lat") String lat, @Query("lon") String lon,
                                     @Query("cnt") int cnt, @Query("type") String type);




    /**
     * @param lat coordinates of the location of your interest
     * @param lon coordinates of the location of your interest
     * @param type type=like,accurate
     * @return
     */
    @GET(ApiConfig.API_5_DAY_FORECAST)
    Call<E> get5DayForeCastWeather(@Query("lat") String lat, @Query("lon") String lon, @Query("type") String type);


    /**
     * @param lat coordinates of the location of your interest
     * @param lon coordinates of the location of your interest
     * @param type type=like,accurate
     * @return
     */
    @GET(ApiConfig.API_16_DAY_FORECAST)
    Call<E> get16DayForeCastWeather(@Query("lat") String lat, @Query("lon") String lon, @Query("type") String type);

}
