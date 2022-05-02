package com.haijiao12138.demo.leetcode.code2021.mongoDb.fileUtils;



import java.io.*;

/**
 * @ClassName IOHandle
 * @Author houyuanbo
 * @Date 2021/9/28 13:58
 * @Description TODO
 * @Version
 **/
public class IOHandle {

    public static void main(String[] args) {
        String path = "D:/新建文件夹/中国.txt";
        String content = "中国-北京-天安门,我爱北京天安门，天安门上太阳升";
        createFileTwo(path, content);
        readFileOne(path);
    }



    public static boolean createFileTwo(String path,String Str){
        File file = new File(String.valueOf(path));
        try {

            if (file.isDirectory()){
                if (!file.exists()){
                    file.mkdirs();
                }
            }else {
                String p = file.getParent();
                File mkdir = new File(p);
                mkdir.mkdirs();
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file, true);//文件的写入类
            BufferedWriter bwriter = new BufferedWriter(writer);//文件写入缓冲区
            bwriter.write(Str);//写入文件
            bwriter.flush();
            bwriter.close();
        }catch (IOException e){
            return false;
        }
        return true;
    }

    //读取文件内容
    public static void readFileOne(String path){
        File file = new File(path);
        if (file.exists()){
            try {
                FileInputStream in = new FileInputStream(file);
                byte[] buffer = new byte[1024];
                int c;
                while ((c = in.read(buffer))!=-1){
                    String ss = new String(buffer, 0, c);
                    System.out.println(ss);
                }
                in.close();
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }else {
            System.out.println("文件不存在");
        }
    }



    public static boolean createFileOne(String path,String content){
        try {
            File file = new File(path);
            if (file.isDirectory()){
                if (!file.exists()){
                    file.mkdirs();//没有文件 创建文件
                }
            }else {
                String p = file.getParent();
                File mkdir = new File(p);
                mkdir.mkdirs();
                file.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(path, false);
            out.write(content.getBytes("utf-8"));
            out.flush();
            out.close();
        }catch (FileNotFoundException e){
            return false;
        }catch (IOException e){
            return false;
        }
        return true;
    }

    //复制文件
    private static void copyFile(String src,String dest){
        try {
            FileInputStream in = new FileInputStream(src);
            File file = new File(dest);
            if (!file.exists()){
                file.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(file);
            int c;
            byte[] buffer = new byte[1024];
            while ((c=in.read(buffer))!=-1){
                for (int i = 0; i < c; i++) {
                    out.write(buffer[i]);
                }
            }
            in.close();
            out.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 删除特定目录下所有文件夹和文件
     *
     * @param path
     */
    public static void delDir(String path) {
        File file = new File(path);
        File files[] = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            File f = files[i];
            if (f.isDirectory()) {
                delDir(f.getAbsolutePath());
            } else {
                f.delete();
            }
        }
    }

    /**
     * 输出特定目录下所有文件夹和文件名
     *
     * @param path
     */
    public static void selectDir(String path) {
        File file = new File(path);
        File files[] = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                System.out.println(files[i].getParent());
                selectDir(files[i].getAbsolutePath());
            } else {
                System.out.println(files[i].getName());
            }
        }
    }


}
