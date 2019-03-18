package com.example.mert.stoktakip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class TouchInterceptorLayout extends FrameLayout {
    public TouchInterceptorLayout(Context context) {
        super(context);
    }

    public TouchInterceptorLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchInterceptorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }
}