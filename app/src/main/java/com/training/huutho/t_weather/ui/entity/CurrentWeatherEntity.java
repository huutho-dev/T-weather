package com.training.huutho.t_weather.ui.entity;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;
import com.training.huutho.t_weather.base.entity.BaseEntity;
import com.training.huutho.t_weather.base.entity.CloudsBean;
import com.training.huutho.t_weather.base.entity.CoordBean;
import com.training.huutho.t_weather.base.entity.MainBean;
import com.training.huutho.t_weather.base.entity.RainBean;
import com.training.huutho.t_weather.base.entity.SysBean;
import com.training.huutho.t_weather.base.entity.WeatherBean;
import com.training.huutho.t_weather.base.entity.WindBean;

import java.util.List;

/**
 * Created by hnc on 14/03/2017.
 */

public class CurrentWeatherEntity extends BaseEntity {
    @SerializedName("coord")
    public CoordBean coord;
    @SerializedName("base")
    public String base;
    @SerializedName("main")
    public MainBean main;
    @SerializedName("wind")
    public WindBean wind;
    @SerializedName("rain")
    public RainBean rain;
    @SerializedName("clouds")
    public CloudsBean clouds;
    @SerializedName("dt")
    public int dt;
    @SerializedName("sys")
    public SysBean sys;
    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;
    @SerializedName("cod")
    public int cod;
    @SerializedName("weather")
    public List<WeatherBean> weather;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.coord, flags);
        dest.writeString(this.base);
        dest.writeParcelable(this.main, flags);
        dest.writeParcelable(this.wind, flags);
        dest.writeParcelable(this.rain, flags);
        dest.writeParcelable(this.clouds, flags);
        dest.writeInt(this.dt);
        dest.writeParcelable(this.sys, flags);
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.cod);
        dest.writeTypedList(this.weather);
    }


    protected CurrentWeatherEntity(Parcel in) {
        super(in);
        this.coord = in.readParcelable(CoordBean.class.getClassLoader());
        this.base = in.readString();
        this.main = in.readParcelable(MainBean.class.getClassLoader());
        this.wind = in.readParcelable(WindBean.class.getClassLoader());
        this.rain = in.readParcelable(RainBean.class.getClassLoader());
        this.clouds = in.readParcelable(CloudsBean.class.getClassLoader());
        this.dt = in.readInt();
        this.sys = in.readParcelable(SysBean.class.getClassLoader());
        this.id = in.readInt();
        this.name = in.readString();
        this.cod = in.readInt();
        this.weather = in.createTypedArrayList(WeatherBean.CREATOR);
    }

    public static final Creator<CurrentWeatherEntity> CREATOR = new Creator<CurrentWeatherEntity>() {
        @Override
        public CurrentWeatherEntity createFromParcel(Parcel source) {
            return new CurrentWeatherEntity(source);
        }

        @Override
        public CurrentWeatherEntity[] newArray(int size) {
            return new CurrentWeatherEntity[size];
        }
    };
}
