package com.gaoyuan4122.autils.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

import com.gaoyuan4122.autils.AUtils;

/**
 * 简化 SharedPreference 操作, 默认创建名为 config 的 SharedPreference.
 * 
 * @author GAOYUAN
 * 
 */
public class PreferenceUtil {
    private static SharedPreferences sp = AUtils.getContext().getSharedPreferences("config",
            Context.MODE_PRIVATE);

    /**
     * 获取 name 为 "config" 的 SharedPreferences
     * 
     * @return name 为 "config" 的 SharedPreferences
     */
    public static SharedPreferences getShadredPreferences() {
        return sp;
    }

    /**
     * 获得 PreferenceActivity 的 SharedPreferences
     * 
     * @return
     */
    public static SharedPreferences getDefaultSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(AUtils.getContext());
    }

    public static String getString(String key, String defultValue) {

        return sp.getString(key, defultValue);
    }

    public static Boolean getBoolean(String key, Boolean defultValue) {
        return sp.getBoolean(key, defultValue);
    }

    public static int getInteger(String key, int defultValue) {
        return sp.getInt(key, defultValue);
    }

    public static long getLong(String key, long defultValue) {
        return sp.getLong(key, defultValue);
    }

    public static float getFloat(String key, float defultValue) {
        return sp.getFloat(key, defultValue);
    }

    public static void setValue(String key, Object value) {
        Editor edit = sp.edit();
        if (value instanceof Boolean) {
            edit.putBoolean(key, (Boolean) value);
        } else if (value instanceof Integer || value instanceof Byte) {
            edit.putInt(key, (Integer) value);
        } else if (value instanceof Long) {
            edit.putLong(key, (Long) value);
        } else if (value instanceof Float) {
            edit.putFloat(key, (Float) value);
        } else if (value instanceof String) {
            edit.putString(key, (String) value);
        } else {
            edit.putString(key, value.toString());
        }
        edit.commit();
    }
}
