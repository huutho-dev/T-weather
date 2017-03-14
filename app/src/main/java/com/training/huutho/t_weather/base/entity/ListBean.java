package com.training.huutho.t_weather.base.entity;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hnc on 14/03/2017.
 */

public class ListBean extends BaseEntity {
    @SerializedName("dt")
    private int dt;
    @SerializedName("main")
    private MainBean main;
    @SerializedName("clouds")
    private CloudsBean clouds;
    @SerializedName("wind")
    private WindBean wind;
    @SerializedName("sys")
    private SysBean sys;
    @SerializedName("dt_txt")
    private String dt_txt;
    @SerializedName("rain")
    private RainBean rain;
    @SerializedName("snow")
    private SnowBean snow;
    @SerializedName("weather")
    private List<WeatherBean> weather;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.dt);
        dest.writeParcelable(this.main, flags);
        dest.writeParcelable(this.clouds, flags);
        dest.writeParcelable(this.wind, flags);
        dest.writeParcelable(this.sys, flags);
        dest.writeString(this.dt_txt);
        dest.writeParcelable(this.rain, flags);
        dest.writeParcelable(this.snow, flags);
        dest.writeTypedList(this.weather);
    }


    protected ListBean(Parcel in) {
        super(in);
        this.dt = in.readInt();
        this.main = in.readParcelable(MainBean.class.getClassLoader());
        this.clouds = in.readParcelable(CloudsBean.class.getClassLoader());
        this.wind = in.readParcelable(WindBean.class.getClassLoader());
        this.sys = in.readParcelable(SysBean.class.getClassLoader());
        this.dt_txt = in.readString();
        this.rain = in.readParcelable(RainBean.class.getClassLoader());
        this.snow = in.readParcelable(SnowBean.class.getClassLoader());
        this.weather = in.createTypedArrayList(WeatherBean.CREATOR);
    }

    public static final Creator<ListBean> CREATOR = new Creator<ListBean>() {
        @Override
        public ListBean createFromParcel(Parcel source) {
            return new ListBean(source);
        }

        @Override
        public ListBean[] newArray(int size) {
            return new ListBean[size];
        }
    };
}

