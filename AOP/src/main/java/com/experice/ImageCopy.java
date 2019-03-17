package com.experice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class ImageCopy {
//    打印日志
    private static final Logger logger= LoggerFactory.getLogger(ImageCopy.class);
    public void copyImage() throws IOException{
        logger.info("开始将图片从D盘复制到E盘");
        File srcFile=new File("D:/bg1.jpg");
        File destFile=new File("E:/bg1.jpg");
        InputStream in=new FileInputStream(srcFile);
        OutputStream out=new FileOutputStream(destFile);
        byte[] bytes=new byte[(int) srcFile.length()];
        int len;
        while((len=in.read(bytes))!=-1) {
            out.write(bytes, 0, len);
        }
//            关闭输入流和输出流
            in.close();
            out.close();

    }
}
