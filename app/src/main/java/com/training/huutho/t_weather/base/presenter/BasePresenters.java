package com.training.huutho.t_weather.base.presenter;

import com.training.huutho.t_weather.base.contracts.BaseContracts;

/**
 * Created by hnc on 14/03/2017.
 */

public abstract class BasePresenters<VIEW extends BaseContracts.BaseView> implements BaseContracts.BasePresenter {

    public VIEW mView;

    public BasePresenters(VIEW view) {
        this.mView = view;
    }
}
