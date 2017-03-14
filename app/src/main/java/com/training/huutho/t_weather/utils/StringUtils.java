package com.training.huutho.t_weather.utils;

/**
 * Created by HuuTho on 3/13/2017.
 */

public class StringUtils {

    public static String upperFirstChar(String oldString) {
        return Character.toUpperCase(oldString.charAt(0)) + oldString.substring(1);
    }

}
