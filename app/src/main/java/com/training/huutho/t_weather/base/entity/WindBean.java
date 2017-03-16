package com.training.huutho.t_weather.base.entity;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hnc on 14/03/2017.
 */

public class WindBean extends BaseEntity {
    @SerializedName("speed")
    public double speed;
    @SerializedName("deg")
    public double deg;

    @Override
    public String toString() {
        return "WindBean{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeDouble(this.speed);
        dest.writeDouble(this.deg);
    }


    protected WindBean(Parcel in) {
        super(in);
        this.speed = in.readDouble();
        this.deg = in.readDouble();
    }

    public static final Creator<WindBean> CREATOR = new Creator<WindBean>() {
        @Override
        public WindBean createFromParcel(Parcel source) {
            return new WindBean(source);
        }

        @Override
        public WindBean[] newArray(int size) {
            return new WindBean[size];
        }
    };
}
