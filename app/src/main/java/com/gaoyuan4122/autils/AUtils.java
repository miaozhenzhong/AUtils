package com.gaoyuan4122.autils;

import android.content.Context;
import android.os.Handler;

/**
 * AUtils的入口类
 */
public class AUtils {

    private static Context mContext;

    private AUtils() {

    }

    /**
     * 这个方法已经在 BaseApplication 中被调用了, 所以如果用户使用了 BaseApplication, 则无需调用此方法.
     */
    public static void setContext(Context context) {
        mContext = context;
    }

    public static Context getContext() {
        if (mContext == null) {
            throw new RuntimeException("AUtils's Context can't be null");
        }
        return mContext;
    }

    public static Handler getMainThreadHandler() {
        return BaseApplication.getMainThreadHandler();
    }

    public static void post(Runnable runnable) {
        getMainThreadHandler().post(runnable);
    }

    public static void postDelayed(Runnable runnable, long delayMillis) {
        getMainThreadHandler().postDelayed(runnable, delayMillis);
    }

    public static boolean isRunInMainThread() {
        return Thread.currentThread() == BaseApplication.getMainThread();
         // return android.os.Process.myTid() == BaseApplication.getMainThread().getId();
    }

    public static void runInMainThread(Runnable runnable) {
        if (isRunInMainThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }
}