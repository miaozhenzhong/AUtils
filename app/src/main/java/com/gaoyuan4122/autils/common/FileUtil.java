package com.gaoyuan4122.autils.common;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * Created by GAOYUAN on 2015/5/11.
 */
public class FileUtil {

    /**
     * 文件改名
     * @param file
     * @param newName
     */
    public static void rename(File file, String newName) {
        file.renameTo(new File(file.getParentFile(), newName));
    }

    /**
     * 把字符串数据写入文件
     * @param content 需要写入的字符串
     * @param path    文件路径名称
     * @param append  是否以添加的模式写入
     * @return 是否写入成功
     */
    public static boolean writeString2File(byte[] content, String path, boolean append) {
        boolean res = false;
        File f = new File(path);
        RandomAccessFile raf = null;
        try {
            if (f.exists()) {
                if (!append) {
                    f.delete();
                    f.createNewFile();
                }
            } else {
                f.createNewFile();
            }
            if (f.canWrite()) {
                raf = new RandomAccessFile(f, "rw");
                raf.seek(raf.length());
                raf.write(content);
                res = true;
            }
        } catch (Exception e) {
            LogUtil.e(e);
        } finally {
            // TODO 使用 google 的 guava 关闭流
            //IOUtils.close(raf);
        }
        return res;
    }

    /**
     * 把字符串数据写入文件
     * @param content 需要写入的字符串
     * @param path    文件路径名称
     * @param append  是否以添加的模式写入
     * @return 是否写入成功
     */
    public static boolean writeString2File(String content, String path, boolean append) {
        return writeString2File(content.getBytes(), path, append);
    }
}
