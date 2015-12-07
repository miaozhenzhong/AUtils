package com.gaoyuan4122.autils.common;

/**
 * Created by GAOYUAN on 2015/5/11.
 */
public class DateTimeUtil {
    /**
     * 将毫秒值转化为 xxh xxm xxs
     *
     * @param mss
     * @return
     */
    public static String formatTime(long mss) {
        long hours = (mss % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (mss % (1000 * 60 * 60)) / (1000 * 60);
        long seconds = (mss % (1000 * 60)) / 1000;
//        String sHours = hours >= 10 ? hours + "" : "0" + hours;
//        String sMinutes = minutes >= 10 ? hours + "" : "0" + minutes;
//        String sSeconds = seconds >= 10 ? seconds + "" : "0" + seconds;
//        if ("00".equals(sHours)) {
//            return sMinutes + sSeconds;
//        } else {
//            return sHours + sMinutes + seconds;
//        }
        if (0 == hours) {
            if (0 == minutes) {
                return seconds + "s";
            } else {
                return minutes + "m" + seconds + "s";
            }
        } else {
            return hours + "h " + minutes + "m " + seconds + "s ";
        }
    }

    public static void dateFormat() {
        // 把毫秒值输出为 xxxx年-xx月-xx日
//        Long time =  1333161614
//        java.text.DateFormat shortDateFormat = DateFormat.getDateFormat(context);
//        mHhmmss = shortDateFormat.format(time*1000L);
//        输出的mHhmmss = 2012-4-24
//        DateFormat.format("", 1);
    }
}
