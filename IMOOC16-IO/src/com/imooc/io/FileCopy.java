package com.imooc.io;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
//        File source = new File("d:/demo.txt");
//        读取文件目标地址
        File source = new File("d:/1.jpg");
//        写入文件目标地址
        File target = new File("e:/1.jpg");
//        在外面创建是因为需要在后面 关闭
//        创建读取文件流对象
        InputStream fis = null;
//        创建写入文件流对象
        OutputStream fos = null;
        try {
//            读取文件
            fis = new FileInputStream(source);
//            写入文件
            fos = new FileOutputStream(target);
//            专用于保存字节信息的数组
            byte[] bs = new byte[1024];//每次只读1k数据 读完就往另一个文件夹写1k
            int len = 0;
//          fis 一次性去读取最多1024字节的变量 填充到bs数组里面
//          将本次读取的长度赋值给len != -1 代表还没读完
            while ((len = fis.read(bs)) != -1) {
                System.out.println("len:" + len);
//               每读取1024字节 像目标文件写入1024字节，
//               参数：读写的数组，起始点，本次写入长度
                fos.write(bs, 0, len);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
//                  关闭写入文件流 一般先关闭输出流
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fis != null) {
                try {
//                    关闭读取文件流
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
