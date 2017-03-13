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
                context.getResources().getString(R.string.thunder_storm_200);
                break;
            case 201:
                context.getResources().getString(R.string.thunder_storm_201);
                break;
            case 202:
                context.getResources().getString(R.string.thunder_storm_202);
                break;
            case 210:
                context.getResources().getString(R.string.thunder_storm_210);
                break;
            case 211:
                context.getResources().getString(R.string.thunder_storm_211);
                break;
            case 212:
                context.getResources().getString(R.string.thunder_storm_212);
                break;
            case 221:
                context.getResources().getString(R.string.thunder_storm_221);
                break;
            case 230:
                context.getResources().getString(R.string.thunder_storm_230);
                break;
            case 231:
                context.getResources().getString(R.string.thunder_storm_231);
                break;
            case 232:
                context.getResources().getString(R.string.thunder_storm_232);
                break;

            //Group 3xx: Drizzle
            case 300:
                context.getResources().getString(R.string.drizzle_300);
                break;
            case 301:
                context.getResources().getString(R.string.drizzle_301);
                break;
            case 302:
                context.getResources().getString(R.string.drizzle_302);
                break;
            case 310:
                context.getResources().getString(R.string.drizzle_310);
                break;
            case 311:
                context.getResources().getString(R.string.drizzle_311);
                break;
            case 312:
                context.getResources().getString(R.string.drizzle_312);
                break;
            case 313:
                context.getResources().getString(R.string.drizzle_313);
                break;
            case 314:
                context.getResources().getString(R.string.drizzle_314);
                break;
            case 321:
                context.getResources().getString(R.string.drizzle_321);
                break;

            //Group 5xx: Rain
            case 500:
                context.getResources().getString(R.string.rain_500);
                break;
            case 501:
                context.getResources().getString(R.string.rain_501);
                break;
            case 502:
                context.getResources().getString(R.string.rain_502);
                break;
            case 503:
                context.getResources().getString(R.string.rain_503);
                break;
            case 504:
                context.getResources().getString(R.string.rain_504);
                break;
            case 511:
                context.getResources().getString(R.string.rain_511);
                break;
            case 520:
                context.getResources().getString(R.string.rain_520);
                break;
            case 521:
                context.getResources().getString(R.string.rain_521);
                break;
            case 522:
                context.getResources().getString(R.string.rain_522);
                break;
            case 531:
                context.getResources().getString(R.string.rain_531);
                break;

            //Group 6xx: Snow
            case 600:
                context.getResources().getString(R.string.snow_600);
                break;
            case 601:
                context.getResources().getString(R.string.snow_601);
                break;
            case 602:
                context.getResources().getString(R.string.snow_602);
                break;
            case 611:
                context.getResources().getString(R.string.snow_611);
                break;
            case 612:
                context.getResources().getString(R.string.snow_612);
                break;
            case 615:
                context.getResources().getString(R.string.snow_615);
                break;
            case 616:
                context.getResources().getString(R.string.snow_616);
                break;
            case 620:
                context.getResources().getString(R.string.snow_620);
                break;
            case 621:
                context.getResources().getString(R.string.snow_621);
                break;
            case 622:
                context.getResources().getString(R.string.snow_622);
                break;

            //Group 7xx: Atmosphere
            case 701:
                context.getResources().getString(R.string.atmosphere_701);
                break;
            case 711:
                context.getResources().getString(R.string.atmosphere_711);
                break;
            case 721:
                context.getResources().getString(R.string.atmosphere_721);
                break;
            case 731:
                context.getResources().getString(R.string.atmosphere_731);
                break;
            case 741:
                context.getResources().getString(R.string.atmosphere_741);
                break;
            case 751:
                context.getResources().getString(R.string.atmosphere_751);
                break;
            case 761:
                context.getResources().getString(R.string.atmosphere_761);
                break;
            case 762:
                context.getResources().getString(R.string.atmosphere_762);
                break;
            case 771:
                context.getResources().getString(R.string.atmosphere_771);
                break;
            case 781:
                context.getResources().getString(R.string.atmosphere_781);
                break;

            //Group 800: Clear
            case 800:
                context.getResources().getString(R.string.clear_800);
                break;

            // Group 80x: Clouds
            case 801:
                context.getResources().getString(R.string.clouds_801);
                break;
            case 802:
                context.getResources().getString(R.string.clouds_802);
                break;
            case 803:
                context.getResources().getString(R.string.clouds_803);
                break;
            case 804:
                context.getResources().getString(R.string.clouds_804);
                break;

            //Group 90x: Extreme
            case 900:
                context.getResources().getString(R.string.extreme_900);
                break;
            case 901:
                context.getResources().getString(R.string.extreme_901);
                break;
            case 902:
                context.getResources().getString(R.string.extreme_902);
                break;
            case 903:
                context.getResources().getString(R.string.extreme_903);
                break;
            case 904:
                context.getResources().getString(R.string.extreme_904);
                break;
            case 905:
                context.getResources().getString(R.string.extreme_905);
                break;
            case 906:
                context.getResources().getString(R.string.extreme_906);
                break;

            //Group 9xx: Additional
            case 951:
                context.getResources().getString(R.string.additional_951);
                break;
            case 952:
                context.getResources().getString(R.string.additional_952);
                break;
            case 953:
                context.getResources().getString(R.string.additional_953);
                break;
            case 954:
                context.getResources().getString(R.string.additional_954);
                break;
            case 955:
                context.getResources().getString(R.string.additional_955);
                break;
            case 956:
                context.getResources().getString(R.string.additional_956);
                break;
            case 957:
                context.getResources().getString(R.string.additional_957);
                break;
            case 958:
                context.getResources().getString(R.string.additional_958);
                break;
            case 959:
                context.getResources().getString(R.string.additional_959);
                break;
            case 960:
                context.getResources().getString(R.string.additional_960);
                break;
            case 961:
                context.getResources().getString(R.string.additional_961);
                break;
            case 962:
                context.getResources().getString(R.string.additional_962);
                break;

        }
        return status;
    }
}
