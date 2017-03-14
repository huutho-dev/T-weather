package com.training.huutho.t_weather.base.entity;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hnc on 14/03/2017.
 */

public class CoordBean extends BaseEntity {
    @SerializedName("lon")
    public double lon;

    @SerializedName("lat")
    public double lat;

    @Override
    public String toString() {
        return "CoordBean{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeDouble(this.lon);
        dest.writeDouble(this.lat);
    }


    protected CoordBean(Parcel in) {
        super(in);
        this.lon = in.readDouble();
        this.lat = in.readDouble();
    }

    public static final Creator<CoordBean> CREATOR = new Creator<CoordBean>() {
        @Override
        public CoordBean createFromParcel(Parcel source) {
            return new CoordBean(source);
        }

        @Override
        public CoordBean[] newArray(int size) {
            return new CoordBean[size];
        }
    };
}
