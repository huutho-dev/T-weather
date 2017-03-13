package com.training.huutho.t_weather.utils;

import android.util.Log;

import com.training.huutho.t_weather.app.AppConfig;

/**
 * Created by HuuTho on 3/13/2017.
 */

public class LogUtils {
    public static final String TAG = "NguyenHuuTho";

    public static void showLog(String msg) {
        if (AppConfig.DEBUG) {

            StackTraceElement element = new Exception().getStackTrace()[1];

            StringBuilder builder = new StringBuilder();
            builder.append(TAG);
            builder.append(element.getClassName());
            builder.append(element.getMethodName());
            builder.append(element.getLineNumber());
            builder.append("----->");
            Log.e(builder.toString(), msg);
        }
    }
}
