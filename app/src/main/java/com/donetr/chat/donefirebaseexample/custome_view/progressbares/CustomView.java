package com.donetr.chat.donefirebaseexample.custome_view.progressbares;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class CustomView extends RelativeLayout {


    public static String MATERIALDESIGNXML = "http://schemas.android.com/apk/res-auto";
    public final static String ANDROIDXML = "http://schemas.android.com/apk/res/android";

    // Indicate if user touched this view the last time
    public boolean isLastTouch = false;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
