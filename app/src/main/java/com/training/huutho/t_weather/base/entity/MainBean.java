package com.training.huutho.t_weather.base.entity;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hnc on 14/03/2017.
 */

public class MainBean extends BaseEntity {

    @SerializedName("temp")
    public double temp;
    @SerializedName("pressure")
    public double pressure;
    @SerializedName("temp_min")
    public double temp_min;
    @SerializedName("temp_max")
    public double temp_max;
    @SerializedName("sea_level")
    public double sea_level;
    @SerializedName("grnd_level")
    public double grnd_level;
    @SerializedName("humidity")
    private int humidity;
    @SerializedName("temp_kf")
    private double temp_kf;


    @Override
    public String toString() {
        return "MainBean{" +
                "temp=" + temp +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", temp_min=" + temp_min +
                ", temp_max=" + temp_max +
                ", sea_level=" + sea_level +
                ", grnd_level=" + grnd_level +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.humidity);
        dest.writeDouble(this.temp);
        dest.writeDouble(this.pressure);
        dest.writeDouble(this.temp_min);
        dest.writeDouble(this.temp_max);
        dest.writeDouble(this.sea_level);
        dest.writeDouble(this.grnd_level);
        dest.writeInt(this.humidity);
        dest.writeDouble(this.temp_kf);
    }

    protected MainBean(Parcel in) {
        super(in);
        this.humidity = in.readInt();
        this.temp = in.readDouble();
        this.pressure = in.readDouble();
        this.temp_min = in.readDouble();
        this.temp_max = in.readDouble();
        this.sea_level = in.readDouble();
        this.grnd_level = in.readDouble();
        this.humidity = in.readInt();
        this.temp_kf = in.readDouble();
    }

    public static final Creator<MainBean> CREATOR = new Creator<MainBean>() {
        @Override
        public MainBean createFromParcel(Parcel source) {
            return new MainBean(source);
        }

        @Override
        public MainBean[] newArray(int size) {
            return new MainBean[size];
        }
    };
}
