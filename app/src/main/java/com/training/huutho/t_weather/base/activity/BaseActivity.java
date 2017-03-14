package com.training.huutho.t_weather.base.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.training.huutho.t_weather.base.contracts.BaseContracts;
import com.training.huutho.t_weather.base.presenter.BasePresenters;

import retrofit2.Response;

/**
 * Created by hnc on 14/03/2017.
 */

public abstract class BaseActivity<PRESENTERS extends BasePresenters, VIEW extends BaseContracts.BaseView> extends AppCompatActivity implements BaseContracts.BaseView {
    public PRESENTERS mPresenter;
    private View mRootView;
    private Handler mHandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getBundleDatas(savedInstanceState);
        mRootView = LayoutInflater.from(this).inflate(setLayoutId(), null);
        mPresenter = setPresenter((VIEW) this);
        mHandler = new Handler();
        setContentView(mRootView);
        setBindView();

        onActivityCreated();
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void getBundleDatas(Bundle savedInstanceState) {

    }

    public abstract int setLayoutId();

    public abstract void setBindView();

    public abstract PRESENTERS setPresenter(VIEW view);

    public abstract void onActivityCreated();

    public Handler getHandler() {
        return mHandler;
    }

    public View getRootView() {
        return mRootView;
    }


    @Override
    public void onResponse(Response response) {

    }

    @Override
    public void onFail(Throwable t) {

    }
}
