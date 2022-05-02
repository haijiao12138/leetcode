package com.haijiao12138.demo.leetcode.code2021.mongoDb.fileUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @ClassName ZipOutputStreamDemo
 * @Author houyuanbo
 * @Date 2021/9/28 15:14
 * @Description TODO
 * @Version
 **/
public class ZipOutputStreamDemo {
    private static final Logger logger = LoggerFactory.getLogger(ZipOutputStreamDemo.class);
    public static void main(String[] args)  throws IOException {
        List list = new ArrayList();
        list.add("D:\\新建文件夹1\\"+"文档1.docx");//获取要打包的四个文件
        list.add("D:\\新建文件夹1\\"+"文档2.docx");

        list.add("D:\\新建文件夹1\\"+"中国.txt");
        list.add("D:\\新建文件夹1\\"+"美国.txt");

        //定义压缩文件夹的名称和相关的位置
        File zipFile = new File("D:\\新建文件夹1\\" + "country.zip");//将打包的文件的位置和名称标注好
        logger.info(""+zipFile);
        InputStream input = null;
        //定义压缩输出流
        ZipOutputStream zipOut = null;
        //实例化压缩输出流  并定制压缩文件的输出路径  就是D盘下【D:\新建文件夹\country.zip】的位置处
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        for (Object o : list) {
            File file = new File((String) o);

        //定义输入文件流
            input = new FileInputStream(file);
            zipOut.putNextEntry(new ZipEntry(file.getName()));
            //设置注释
            zipOut.setComment("www.demo.com");
            int temp = 0;
            while ((temp = input.read())!=-1){
                zipOut.write(temp);
            }
            input.close();
        }
        zipOut.close();
    }
}
