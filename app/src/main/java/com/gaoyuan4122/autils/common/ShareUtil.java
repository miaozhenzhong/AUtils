package com.gaoyuan4122.autils.common;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

import com.gaoyuan4122.autils.AUtils;

import java.io.File;

/**
 * Created by GAOYUAN on 2015/5/23.
 */
public class ShareUtil {
    /**
     * 分享功能
     *
     * @param activityTitle Activity的名字
     * @param msgTitle      消息标题
     * @param msgText       消息内容
     * @param imgPath       图片路径，不分享图片则传null
     */
    public static void shareMsg(String activityTitle, String msgTitle, String msgText, String imgPath) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        if (imgPath == null || imgPath.equals("")) {
            intent.setType("text/plain"); // 纯文本
        } else {
            File f = new File(imgPath);
            if (f != null && f.exists() && f.isFile()) {
                intent.setType("image/png");
                Uri u = Uri.fromFile(f);
                intent.putExtra(Intent.EXTRA_STREAM, u);
            }
        }
        intent.putExtra(Intent.EXTRA_SUBJECT, msgTitle);
        intent.putExtra(Intent.EXTRA_TEXT, msgText);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        // TODO 在子线程中启动Activity的问题
        AUtils.getContext().startActivity(Intent.createChooser(intent, activityTitle));
    }

    // TODO 分享图片功能
    public static void shareImage(String imgPath) {
        if (TextUtils.isEmpty(imgPath)) {
            return;
        }
        Intent intent = new Intent(Intent.ACTION_SEND);

        File f = new File(imgPath);
        if (f != null && f.exists() && f.isFile()) {
            intent.setType("image/jpg");
            Uri u = Uri.fromFile(f);
            intent.putExtra(Intent.EXTRA_STREAM, u);
//            try{
//                boolean isCommonPackageName = CommonPackageName.isCommonPackageName(mImName,this);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                if(isCommonPackageName){
//                    intent.setPackage(mImName);
//                    startActivity(intent);
//                }else{
//                    startActivity(Intent.createChooser(intent,"Share"));
//                }
//            }catch(Exception e){
//            }
        } else {
        }
    }
}
