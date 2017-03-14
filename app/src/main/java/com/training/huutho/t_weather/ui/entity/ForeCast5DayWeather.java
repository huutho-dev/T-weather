package com.training.huutho.t_weather.ui.entity;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;
import com.training.huutho.t_weather.base.entity.BaseEntity;
import com.training.huutho.t_weather.base.entity.CityBean;
import com.training.huutho.t_weather.base.entity.ListBean;

import java.util.List;

/**
 * Created by hnc on 14/03/2017.
 */

public class ForeCast5DayWeather extends BaseEntity {
    @SerializedName("cod")
    private String cod;
    @SerializedName("message")
    private double message;
    @SerializedName("cnt")
    private int cnt;
    @SerializedName("city")
    private CityBean city;
    @SerializedName("list")
    private List<ListBean> list;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.cod);
        dest.writeDouble(this.message);
        dest.writeInt(this.cnt);
        dest.writeParcelable(this.city, flags);
        dest.writeTypedList(this.list);
    }



    protected ForeCast5DayWeather(Parcel in) {
        super(in);
        this.cod = in.readString();
        this.message = in.readDouble();
        this.cnt = in.readInt();
        this.city = in.readParcelable(CityBean.class.getClassLoader());
        this.list = in.createTypedArrayList(ListBean.CREATOR);
    }

    public static final Creator<ForeCast5DayWeather> CREATOR = new Creator<ForeCast5DayWeather>() {
        @Override
        public ForeCast5DayWeather createFromParcel(Parcel source) {
            return new ForeCast5DayWeather(source);
        }

        @Override
        public ForeCast5DayWeather[] newArray(int size) {
            return new ForeCast5DayWeather[size];
        }
    };
}