
package com.gaoyuan4122.autils;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

/**
 * AUtils 的另一种用法, 使用 AUtils 的项目, 需要继承 BaseApplication Created by GAOYUAN on
 * 2015/5/11.
 */
public class BaseApplication extends Application {

    private static BaseApplication sApplicationContext;

    private static Thread sMainThread;

    private static long sMainThreadId;

    private static Looper sMainLooper;

    private static Handler sMainThreadHandler;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplicationContext = this;
        sMainThread = Thread.currentThread();
        sMainThreadId = sMainThread.getId();
        sMainLooper = getMainLooper();
        sMainThreadHandler = new Handler();
        AUtils.setContext(sApplicationContext);
    }

    public static BaseApplication getContext() {
        return sApplicationContext;
    }

    public static Thread getMainThread() {
        return sMainThread;
    }

    public static Handler getMainThreadHandler() {
        return sMainThreadHandler;
    }
}
