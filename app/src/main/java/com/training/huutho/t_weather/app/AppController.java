package com.training.huutho.t_weather.app;

import android.app.Application;

/**
 * Created by HuuTho on 3/13/2017.
 */

public class AppController  extends Application{
    private static AppController mInstance ;

    private AppController (){
        mInstance = this;
    }

    public static final synchronized AppController getInstace(){
        if (mInstance == null){
            mInstance = new AppController();
        }
        return mInstance;
    }
}
