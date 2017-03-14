package com.training.huutho.t_weather.base.contracts;

import retrofit2.Response;

/**
 * Created by hnc on 14/03/2017.
 */

public class BaseContracts {
    public interface BasePresenter {

    }

    public interface BaseView {
        void onResponse(Response  response);

        void onFail(Throwable t);
    }
}
