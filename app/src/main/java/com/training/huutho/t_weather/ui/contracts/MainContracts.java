package com.training.huutho.t_weather.ui.contracts;

import com.training.huutho.t_weather.base.contracts.BaseContracts;

/**
 * Created by hnc on 14/03/2017.
 */

public class MainContracts {

    public interface MainPresenter  extends BaseContracts.BasePresenter{
        void getCurrentWeather();
    }

    public interface MainView extends BaseContracts.BaseView {

    }

}
