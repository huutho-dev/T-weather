package com.training.huutho.t_weather.base.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by HuuTho on 3/13/2017.
 */

public class BaseEntity implements Parcelable {
    protected BaseEntity(Parcel in) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
