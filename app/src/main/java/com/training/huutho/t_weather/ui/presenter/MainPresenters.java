package com.training.huutho.t_weather.ui.presenter;

import com.training.huutho.t_weather.base.presenter.BasePresenters;
import com.training.huutho.t_weather.openWeatherMapApi.ApiHelper;
import com.training.huutho.t_weather.openWeatherMapApi.ApiRequest;
import com.training.huutho.t_weather.ui.contracts.MainContracts;
import com.training.huutho.t_weather.ui.entity.CurrentWeatherEntity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by hnc on 14/03/2017.
 */

public class MainPresenters extends BasePresenters<MainContracts.MainView> implements MainContracts.MainPresenter {

    public MainPresenters(MainContracts.MainView view) {
        super(view);
    }


    @Override
    public void getCurrentWeather() {
        Retrofit retrofit = ApiHelper.getRetrofit();
        final ApiRequest request = retrofit.create(ApiRequest.class);
        Call<CurrentWeatherEntity> call = request.getCurrentWeather("21.041016", "105.801780", "accurate");

        call.enqueue(new Callback<CurrentWeatherEntity>() {
            @Override
            public void onResponse(Call<CurrentWeatherEntity> call, Response<CurrentWeatherEntity> response) {
                mView.onResponse(response);
            }

            @Override
            public void onFailure(Call<CurrentWeatherEntity> call, Throwable t) {
                mView.onFail(t);

            }
        });
    }
}
