package com.training.huutho.t_weather.base.entity;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hnc on 14/03/2017.
 */

public class WeatherBean extends BaseEntity {
    @SerializedName("id")
    public int id;
    @SerializedName("main")
    public String main;
    @SerializedName("description")
    public String description;
    @SerializedName("icon")
    public String icon;

    @Override
    public String toString() {
        return "WeatherBean{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.id);
        dest.writeString(this.main);
        dest.writeString(this.description);
        dest.writeString(this.icon);
    }


    protected WeatherBean(Parcel in) {
        super(in);
        this.id = in.readInt();
        this.main = in.readString();
        this.description = in.readString();
        this.icon = in.readString();
    }

    public static final Creator<WeatherBean> CREATOR = new Creator<WeatherBean>() {
        @Override
        public WeatherBean createFromParcel(Parcel source) {
            return new WeatherBean(source);
        }

        @Override
        public WeatherBean[] newArray(int size) {
            return new WeatherBean[size];
        }
    };
}
