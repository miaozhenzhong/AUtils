package com.gaoyuan4122.autils.bitmap;

/**
 * 图片处理工具类
 * @author GAOYUAN
 *
 */
public class ImageUtil {
//    public static String saveView2Bitmap(Context context,View view,String fileName) {
//        Bitmap bitmap = null;
//
//        if(context == null || view == null || TextUtils.isEmpty(fileName)){
//            return null;
//        }
//
//        view.setDrawingCacheEnabled(true);
////        view.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED), View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
//        view.buildDrawingCache();
//        bitmap = view.getDrawingCache();
//
//        if(bitmap == null){
//            Toast.makeText(context,context.getString(R.string.wallpaper_failed_to_crop),Toast.LENGTH_SHORT).show();
//            return null;
//        }
//
//
//        String ret = null;
//        OutputStream fos = null;
//        try {
//
//            Bitmap resizeBitmap = zoomBitmap(bitmap,0.5f,0.5f);
//            bitmap.recycle();
//            Uri uri =  Uri.fromFile(new File(WallpaperSettingUtils.getTempSaveDir() + fileName));
//            File file = new File(uri.getPath());
//            if (!file.exists()) {
//                try {
//                    file.createNewFile();
//                } catch (IOException e) {
//                    Toast.makeText(context,context.getString(R.string.wallpaper_failed_to_crop),Toast.LENGTH_SHORT).show();
//                    return null;
//                }
//            }
//            fos = context.getContentResolver().openOutputStream(uri);
//            // 这里也可以是 Bitmap.CompressFormat.PNG, 可以保持透明背景
//            resizeBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fos);
//            ret = WallpaperSettingUtils.getTempSaveDir() + fileName;
//        } catch (Exception e) {
//            Toast.makeText(context,context.getString(R.string.wallpaper_failed_to_crop),Toast.LENGTH_SHORT).show();
//        }finally {
//            Util.closeSilently(fos);
//            view.setDrawingCacheEnabled(false);
//        }
//        return ret;
//    }
//
//    /**
//     * 将图片按指定比例缩放
//     */
//    public static Bitmap zoomBitmap(Bitmap bitmap, float scaleWidth, float scaleHeight) {
//        int width = bitmap.getWidth();
//        int height = bitmap.getHeight();
//        Matrix matrix = new Matrix();
////        float scaleWidth = ((float) w / width);
////        float scaleHeight = ((float) h / height);
//        matrix.postScale(scaleWidth, scaleHeight);
//        Bitmap newBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
//        return newBitmap;
//    }
//
//    public static Bitmap convertViewToBitmap(View view){
//        view.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED), View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
//        view.buildDrawingCache();
//        Bitmap bitmap = view.getDrawingCache();
//        return bitmap;
//    }
//
////---------------------
//    public static String saveView2BitmapWithoutZoom(Context context,View view,String fileName) {
//        Bitmap bitmap = null;
//        if(context == null || view == null || TextUtils.isEmpty(fileName)){
//            return null;
//        }
//        view.setDrawingCacheEnabled(true);
//        view.buildDrawingCache();
//        bitmap = view.getDrawingCache();
//        if(bitmap == null){
//            Toast.makeText(context,context.getString(R.string.wallpaper_failed_to_crop),Toast.LENGTH_SHORT).show();
//            return null;
//        }
//        String ret = null;
//        OutputStream fos = null;
//        try {
//            Uri uri =  Uri.fromFile(new File(WallpaperSettingUtils.getTempSaveDir() + fileName));
//            File file = new File(uri.getPath());
//            if (!file.exists()) {
//                try {
//                    file.createNewFile();
//                } catch (IOException e) {
//                    Toast.makeText(context,context.getString(R.string.wallpaper_failed_to_crop),Toast.LENGTH_SHORT).show();
//                    return null;
//                }
//            }
//            fos = context.getContentResolver().openOutputStream(uri);
//            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
//            ret = WallpaperSettingUtils.getTempSaveDir() + fileName;
//        } catch (Exception e) {
//            Toast.makeText(context,context.getString(R.string.wallpaper_failed_to_crop),Toast.LENGTH_SHORT).show();
//        }finally {
//            Util.closeSilently(fos);
//            view.destroyDrawingCache();
//            view.setDrawingCacheEnabled(false);
//            bitmap.recycle();
//        }
//        return ret;
//    }

    public static void zoomBitmap() {

    }
}
