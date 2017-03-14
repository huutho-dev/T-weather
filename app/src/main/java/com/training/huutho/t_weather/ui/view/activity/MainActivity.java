package com.training.huutho.t_weather.ui.view.activity;

import android.widget.TextView;

import com.training.huutho.t_weather.R;
import com.training.huutho.t_weather.base.activity.BaseActivity;
import com.training.huutho.t_weather.ui.contracts.MainContracts;
import com.training.huutho.t_weather.ui.entity.CurrentWeatherEntity;
import com.training.huutho.t_weather.ui.presenter.MainPresenters;
import com.training.huutho.t_weather.utils.ConditionsUtils;
import com.training.huutho.t_weather.utils.LogUtils;

import retrofit2.Response;

public class MainActivity extends BaseActivity<MainPresenters, MainContracts.MainView> implements MainContracts.MainView {

    private TextView mTextView;

    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void setBindView() {
        mTextView = (TextView) findViewById(R.id.textview);
    }

    @Override
    public MainPresenters setPresenter(MainContracts.MainView view) {
        return new MainPresenters(view);
    }

    @Override
    public void onActivityCreated() {
        mPresenter.getCurrentWeather();
    }

    @Override
    public void onResponse(Response response) {
        if (response.body() instanceof CurrentWeatherEntity) {
            CurrentWeatherEntity weather = (CurrentWeatherEntity) response.body();
            int conditionCode = weather.weather.get(0).id;
            String currentWeather = ConditionsUtils.getStatusWeather(this, conditionCode);
            LogUtils.showLog(currentWeather);
        }
    }

    @Override
    public void onFail(Throwable t) {
        super.onFail(t);
    }
}
