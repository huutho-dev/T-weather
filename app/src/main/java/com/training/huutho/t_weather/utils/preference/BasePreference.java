package com.training.huutho.t_weather.utils.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.content.SharedPreferencesCompat;

import com.training.huutho.t_weather.app.AppController;

/**
 * Created by HuuTho on 3/13/2017.
 */

public class BasePreference {
    private String mNamePreference;
    private SharedPreferences sharePreference;

    public BasePreference(String namePrefer) {
        this.mNamePreference = namePrefer;

        sharePreference = AppController.getInstace()
                .getSharedPreferences(mNamePreference, Context.MODE_PRIVATE);

    }

    public SharedPreferences getPreference() {
        return sharePreference;
    }

    public SharedPreferences.Editor getEditor() {
        return sharePreference.edit();
    }
}
