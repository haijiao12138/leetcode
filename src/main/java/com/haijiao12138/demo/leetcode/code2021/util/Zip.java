package com.haijiao12138.demo.leetcode.code2021.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * @ClassName Zip
 * @Author houyuanbo
 * @Date 2021/10/15 16:24
 * @Description TODO
 * @Version
 **/

public class Zip {
    public static void main(String[] args) {
        String zipFilePath = "C:\\Users\\houyuanbo\\Desktop\\1011zip.zip";
        String desDirectory = "C:\\Users\\houyuanbo\\Desktop\\111";
        int unzip = unzip(zipFilePath, desDirectory);
        System.out.println("最终的结果是："+unzip);
    }

        private Zip mZip;

        public static final int UNZIP_ZIP_FILE_PATH_ERROR = 0;

        private Zip(){}

        public Zip getInstatnce() {
            if(mZip == null) {
                mZip = new Zip();
            }
            return mZip;
        }

        public static int unzip(String zipFilePath, String toDir) {
            ZipFile file = null;
            try {
                file = new ZipFile(zipFilePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return 0;
        }
    }

