package com.training.huutho.t_weather.base.entity;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hnc on 14/03/2017.
 */

public class SysBean extends BaseEntity {
    @SerializedName("message")
    public double message;
    @SerializedName("country")
    public String country;
    @SerializedName("sunrise")
    public int sunrise;
    @SerializedName("sunset")
    public int sunset;

    @Override
    public String toString() {
        return "SysBean{" +
                "message=" + message +
                ", country='" + country + '\'' +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeDouble(this.message);
        dest.writeString(this.country);
        dest.writeInt(this.sunrise);
        dest.writeInt(this.sunset);
    }


    protected SysBean(Parcel in) {
        super(in);
        this.message = in.readDouble();
        this.country = in.readString();
        this.sunrise = in.readInt();
        this.sunset = in.readInt();
    }

    public static final Creator<SysBean> CREATOR = new Creator<SysBean>() {
        @Override
        public SysBean createFromParcel(Parcel source) {
            return new SysBean(source);
        }

        @Override
        public SysBean[] newArray(int size) {
            return new SysBean[size];
        }
    };
}
