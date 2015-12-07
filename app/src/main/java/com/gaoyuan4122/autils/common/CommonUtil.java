package com.gaoyuan4122.autils.common;

import android.content.Intent;

import com.gaoyuan4122.autils.AUtils;

public class CommonUtil {

    //    private void createShortcutOnDesktop(Application app) {
    //        Intent i = new Intent();
    //        i.setClassName(this, "com.xxx.yyy.LauncherActivity");
    //        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    //        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    //        Intent shortcutIntent = new Intent();
    //        shortcutIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, i);
    //        shortcutIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, getString(R.string.app_name));
    //        shortcutIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, Intent
    // .ShortcutIconResource.fromContext(this, R.drawable.icon));
    //        shortcutIntent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
    //        this.sendBroadcast(shortcutIntent);
    //    }
    //        private void installShortcut() {
    //        Intent intent = new Intent();
    //        intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
    //        // 干什么事，叫什么名，长什么样
    //        Intent shortcutIntent = new Intent();
    //        intent.putExtra("duplicate", false);// 只允许一个快捷图标
    //        shortcutIntent.setAction("com.itcast.exam201503");
    //        shortcutIntent.addCategory(Intent.CATEGORY_DEFAULT);
    //        intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
    //        intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "私密短信快捷");
    //        intent.putExtra(Intent.EXTRA_SHORTCUT_ICON,
    //                BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher));
    //        sendBroadcast(intent);
    //    }
    public static void installShortcut(String packageName, String shortcutName, int iconId) {
        Intent intent = new Intent();
        intent.setClassName(AUtils.getContext(), packageName);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Intent shortcutIntent = new Intent();
        shortcutIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, intent);
        shortcutIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, shortcutName);
        shortcutIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, Intent.ShortcutIconResource
                .fromContext(AUtils.getContext(), iconId));
        shortcutIntent.putExtra("duplicate", false);
        shortcutIntent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        AUtils.getContext().sendBroadcast(shortcutIntent);
    }
}
