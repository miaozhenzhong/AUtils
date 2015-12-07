package com.gaoyuan4122.autils.common;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;

import java.util.List;

/**
 * Created by GAOYUAN on 2015/12/7.
 * 关于四大组件的工具类
 */
public class ComponentUtil {
    public static boolean isServiceRunning(Context context, Class<? extends Service> serviceClass) {
        // ActivityManager相当于windows中的任务管理器
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> services = am.getRunningServices(100);
        for (ActivityManager.RunningServiceInfo sInfo : services) {
            String runningServiceName = sInfo.service.getClassName();
            if(serviceClass.getName().equals(runningServiceName)){
                return true;
            }
        }
        return false;
    }
}
