package com.training.huutho.t_weather.base.entity;

import android.os.Parcel;

/**
 * Created by hnc on 14/03/2017.
 */

public class CloudsBean extends BaseEntity {
    public int all;

    @Override
    public String toString() {
        return "CloudsBean{" +
                "all=" + all +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.all);
    }


    protected CloudsBean(Parcel in) {
        super(in);
        this.all = in.readInt();
    }

    public static final Creator<CloudsBean> CREATOR = new Creator<CloudsBean>() {
        @Override
        public CloudsBean createFromParcel(Parcel source) {
            return new CloudsBean(source);
        }

        @Override
        public CloudsBean[] newArray(int size) {
            return new CloudsBean[size];
        }
    };
}
