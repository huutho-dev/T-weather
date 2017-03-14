package com.training.huutho.t_weather.base.entity;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hnc on 14/03/2017.
 */

public class SnowBean extends BaseEntity {

    @SerializedName("3h")
    private double _$3h;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeDouble(this._$3h);
    }


    protected SnowBean(Parcel in) {
        super(in);
        this._$3h = in.readDouble();
    }

    public static final Creator<SnowBean> CREATOR = new Creator<SnowBean>() {
        @Override
        public SnowBean createFromParcel(Parcel source) {
            return new SnowBean(source);
        }

        @Override
        public SnowBean[] newArray(int size) {
            return new SnowBean[size];
        }
    };
}
