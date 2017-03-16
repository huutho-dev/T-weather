package com.training.huutho.t_weather.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.training.huutho.t_weather.R;

import java.lang.reflect.Field;

/**
 * Created by hnc on 15/03/2017.
 */

public class SwipeRefreshWeather extends SwipeRefreshLayout {
    private static final String IMAGE_REFRESH = "mCircleView";

    private Context mContext;
    private ImageView mRefreshIcon;

    private int mIdResource = R.mipmap.ic_launcher_round;
    private float mAnimDuration = 5000;
    private float mFromDegree = 0.0f, mToDegree = 720.0f;

    private RotateAnimation rotateAnimation;
    private IRefreshListener listener;


    public SwipeRefreshWeather(Context context) {
        super(context);
        initSwipeLayout(context);
    }

    public SwipeRefreshWeather(Context context, AttributeSet attrs) {
        super(context, attrs);
        getAttrs(context,attrs);
        initSwipeLayout(context);

    }

    private void initSwipeLayout(Context context) {
        this.mContext = context;
        mRefreshIcon = getImageRefresh();

        rotateAnimation = new RotateAnimation(mFromDegree, mToDegree, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration((long) mAnimDuration);
        rotateAnimation.setRepeatCount(Animation.REVERSE);
        mRefreshIcon.setImageResource(mIdResource);

        this.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                mRefreshIcon.setAnimation(rotateAnimation);
                if(listener != null) listener.onRefresh();
            }
        });
    }


    private void getAttrs(Context context, AttributeSet attrs) {
        TypedArray ta = context.getTheme().obtainStyledAttributes(attrs, R.styleable.SwipeRefreshWeather,0,0);
        mIdResource = ta.getResourceId(R.styleable.SwipeRefreshWeather_thonh_setImage, R.mipmap.ic_launcher_round);
        mAnimDuration = ta.getInteger(R.styleable.SwipeRefreshWeather_thonh_rotate_duration, (int) mAnimDuration);
        mFromDegree = ta.getFloat(R.styleable.SwipeRefreshWeather_thonh_from_degree, mFromDegree);
        mToDegree = ta.getFloat(R.styleable.SwipeRefreshWeather_thonh_from_degree, mToDegree);
        ta.recycle();
    }


    private ImageView getImageRefresh() {
        try {
            Field f = SwipeRefreshLayout.class.getDeclaredField(IMAGE_REFRESH);
            f.setAccessible(true);
            return (ImageView) f.get(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ImageView(mContext);
    }

    public void setOnRefreshListener(IRefreshListener listener) {
        this.listener = listener;
    }

    public interface IRefreshListener{

        void onRefresh();
    }

}
