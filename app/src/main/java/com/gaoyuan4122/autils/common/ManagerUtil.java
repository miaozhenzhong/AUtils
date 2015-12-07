package com.gaoyuan4122.autils.common;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.admin.DeviceAdminReceiver;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import com.gaoyuan4122.autils.AUtils;

/**
 * 获取各种 Manager
 *
 * @author GAOYUAN
 */
public class ManagerUtil {

    public static DevicePolicyManager getDevicePolicyManager() {
        return (DevicePolicyManager) AUtils.getContext().getSystemService(Context
                .DEVICE_POLICY_SERVICE);
    }

    public static void registerAdminDevice(Context context, Class<? extends DeviceAdminReceiver>
            admin) {
        DevicePolicyManager manager = getDevicePolicyManager();
        ComponentName adminName = new ComponentName(context, admin);
        // is exist admin active ?
        if (!manager.isAdminActive(adminName)) {
            Intent intent = new Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN);
            intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, adminName);
            context.startActivity(intent);
        }
    }

    public static KeyguardManager getKeyguardManager() {
        return (KeyguardManager) AUtils.getContext().getSystemService(Context.KEYGUARD_SERVICE);
    }


    public static LocationManager getLocationManager() {
        return (LocationManager) AUtils.getContext().getSystemService(Context.LOCATION_SERVICE);
    }

    public static WindowManager getWindowManager() {
        return (WindowManager) AUtils.getContext().getSystemService(Context.WINDOW_SERVICE);
    }

    public static ActivityManager getActivityManager() {
        return (ActivityManager) AUtils.getContext().getSystemService(Context.ACTIVITY_SERVICE);
    }

    public static NotificationManager getNotificationManager() {
        return (NotificationManager) AUtils.getContext().getSystemService(Context
                .NOTIFICATION_SERVICE);
    }

    public static PackageManager getPackManager() {
        return AUtils.getContext().getPackageManager();
    }

    public static Bundle getMetaData() {
        try {
            return getPackManager().getApplicationInfo(AUtils.getContext().getPackageName(),
                    PackageManager.GET_META_DATA).metaData;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ConnectivityManager getConnectivtyManager() {
        return (ConnectivityManager) AUtils.getContext().getSystemService(Context
                .CONNECTIVITY_SERVICE);
    }

    public static PowerManager getPowerManager() {
        return (PowerManager) AUtils.getContext().getSystemService(Context.POWER_SERVICE);
    }

    public static TelephonyManager getTelephonyManager() {
        return (TelephonyManager) AUtils.getContext().getSystemService(Context.TELEPHONY_SERVICE);
    }

    public static WifiManager getWifiManger() {
        return (WifiManager) AUtils.getContext().getSystemService(Context.WIFI_SERVICE);
    }

    public static LayoutInflater getInflater() {
        return (LayoutInflater) AUtils.getContext().getSystemService(Context
                .LAYOUT_INFLATER_SERVICE);
    }

    public static InputMethodManager getInputMethodManager() {
        return ((InputMethodManager) AUtils.getContext().getSystemService(Context
                .INPUT_METHOD_SERVICE));
    }
}
