package com.training.huutho.t_weather.utils;

import android.content.Context;

import com.training.huutho.t_weather.R;

/**
 * Created by HuuTho on 3/13/2017.
 */

public class ConditionsUtils {
    public static String getStatusWeather(Context context, int codeId) {
        String status = "";
        switch (codeId) {

            //Group 2xx: Thunderstorm
            case 200:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.thunder_storm_200));

            case 201:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.thunder_storm_201));

            case 202:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.thunder_storm_202));

            case 210:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.thunder_storm_210));

            case 211:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.thunder_storm_211));

            case 212:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.thunder_storm_212));

            case 221:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.thunder_storm_221));

            case 230:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.thunder_storm_230));

            case 231:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.thunder_storm_231));

            case 232:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.thunder_storm_232));


            //Group 3xx: Drizzle
            case 300:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.drizzle_300));

            case 301:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.drizzle_301));

            case 302:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.drizzle_302));

            case 310:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.drizzle_310));

            case 311:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.drizzle_311));

            case 312:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.drizzle_312));

            case 313:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.drizzle_313));

            case 314:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.drizzle_314));

            case 321:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.drizzle_321));


            //Group 5xx: Rain
            case 500:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.rain_500));

            case 501:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.rain_501));

            case 502:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.rain_502));

            case 503:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.rain_503));

            case 504:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.rain_504));

            case 511:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.rain_511));

            case 520:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.rain_520));

            case 521:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.rain_521));

            case 522:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.rain_522));

            case 531:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.rain_531));


            //Group 6xx: Snow
            case 600:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.snow_600));

            case 601:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.snow_601));

            case 602:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.snow_602));

            case 611:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.snow_611));

            case 612:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.snow_612));

            case 615:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.snow_615));

            case 616:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.snow_616));

            case 620:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.snow_620));

            case 621:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.snow_621));

            case 622:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.snow_622));


            //Group 7xx: Atmosphere
            case 701:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.atmosphere_701));

            case 711:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.atmosphere_711));

            case 721:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.atmosphere_721));

            case 731:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.atmosphere_731));

            case 741:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.atmosphere_741));

            case 751:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.atmosphere_751));

            case 761:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.atmosphere_761));

            case 762:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.atmosphere_762));

            case 771:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.atmosphere_771));

            case 781:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.atmosphere_781));


            //Group 800: Clear
            case 800:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.clear_800));


            // Group 80x: Clouds
            case 801:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.clouds_801));

            case 802:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.clouds_802));

            case 803:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.clouds_803));

            case 804:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.clouds_804));


            //Group 90x: Extreme
            case 900:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.extreme_900));

            case 901:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.extreme_901));

            case 902:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.extreme_902));

            case 903:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.extreme_903));

            case 904:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.extreme_904));

            case 905:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.extreme_905));

            case 906:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.extreme_906));


            //Group 9xx: Additional
            case 951:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_951));

            case 952:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_952));

            case 953:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_953));

            case 954:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_954));

            case 955:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_955));

            case 956:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_956));

            case 957:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_957));

            case 958:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_958));

            case 959:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_959));

            case 960:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_960));

            case 961:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_961));

            case 962:
                return StringUtils.upperFirstChar(context.getResources().getString(R.string.additional_962));

            default:
                return StringUtils.upperFirstChar("unknow");

        }
    }
}
