package com.training.huutho.t_weather.base.entity;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hnc on 14/03/2017.
 */

public class RainBean extends BaseEntity {
    @SerializedName("3h")
    public double _$3h;

    @Override
    public String toString() {
        return "RainBean{" +
                "_$3h=" + _$3h +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeDouble(this._$3h);
    }


    protected RainBean(Parcel in) {
        super(in);
        this._$3h = in.readDouble();
    }

    public static final Creator<RainBean> CREATOR = new Creator<RainBean>() {
        @Override
        public RainBean createFromParcel(Parcel source) {
            return new RainBean(source);
        }

        @Override
        public RainBean[] newArray(int size) {
            return new RainBean[size];
        }
    };
}
