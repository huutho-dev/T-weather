package com.training.huutho.t_weather.ui.view.activity;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.training.huutho.t_weather.R;
import com.training.huutho.t_weather.base.activity.BaseActivity;
import com.training.huutho.t_weather.ui.contracts.MainContracts;
import com.training.huutho.t_weather.ui.presenter.MainPresenters;

import retrofit2.Response;

public class MainActivity extends BaseActivity<MainPresenters, MainContracts.MainView> implements MainContracts.MainView {

    ImageView imageView;

    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initUI() {
        imageView = (ImageView) findViewById(R.id.image);

        Picasso.with(this).load(R.drawable.rain).into(imageView);

    }

    @Override
    protected void initEvent() {


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

    }

    @Override
    public void onFail(Throwable t) {
        super.onFail(t);
    }
}
