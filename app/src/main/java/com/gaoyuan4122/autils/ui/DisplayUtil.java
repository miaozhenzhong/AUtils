package com.gaoyuan4122.autils.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

import com.gaoyuan4122.autils.AUtils;

/**
 * Created by GAOYUAN on 2015/5/5.
 */
public class DisplayUtil {
    private static int sScreenWidth;
    private static int sScreenHeight;

    public static int dip2px(float dipValue) {
        final float scale = AUtils.getContext().getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    public static int px2dip(float pxValue) {
        final float scale = AUtils.getContext().getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    public static int getScreenWidth() {
        if (0 == sScreenWidth) {
            DisplayMetrics metrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) AUtils.getContext().getSystemService(Context.WINDOW_SERVICE);
            windowManager.getDefaultDisplay().getMetrics(metrics);
            sScreenWidth = metrics.widthPixels;
        }
        return sScreenWidth;
    }

    public static int getScreenHeight() {
        if (0 == sScreenHeight) {
            DisplayMetrics metrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) AUtils.getContext().getSystemService(Context.WINDOW_SERVICE);
            windowManager.getDefaultDisplay().getMetrics(metrics);
            sScreenHeight = metrics.heightPixels;
        }
        return sScreenHeight;
    }

    /**
     * 获取状态栏高度
     * @param v
     * @return
     */
    public static int getStatusBarHeight(View v) {
        if (v == null) {
            return 0;
        }
        Rect frame = new Rect();
        v.getWindowVisibleDisplayFrame(frame);
        return frame.top;
    }
}
