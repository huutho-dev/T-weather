package com.training.huutho.t_weather.base;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by HuuTho on 3/13/2017.
 */

public class BaseEntity implements Parcelable {
    protected BaseEntity(Parcel in) {
    }

    public static final Creator<BaseEntity> CREATOR = new Creator<BaseEntity>() {
        @Override
        public BaseEntity createFromParcel(Parcel in) {
            return new BaseEntity(in);
        }

        @Override
        public BaseEntity[] newArray(int size) {
            return new BaseEntity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
