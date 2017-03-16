package com.training.huutho.t_weather.customview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;


/**
 * Created by hnc on 16/03/2017.
 */

public class TextViewWeather extends AppCompatTextView {
    public TextViewWeather(Context context) {
        super(context);
        initTextView(context,null);
    }

    public TextViewWeather(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initTextView(context,attrs);
    }

    public TextViewWeather(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTextView(context,attrs);
    }

    private void initTextView(Context context, AttributeSet attrs) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Stilu-Regular.otf");
        setTypeface(typeface);
    }
}
