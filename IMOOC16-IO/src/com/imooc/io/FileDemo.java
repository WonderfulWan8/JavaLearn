package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
//        File file = new File("c:/b.txt");//win系统c盘报错
//        新建文件对象 参数为文件地址
        File file = new File("d:/b.txt");
        File dir = new File("d:/电影/华语/大陆");
        try {
            //        创建文件 如果存在 返回值为false
            boolean r1 = file.createNewFile();
            System.out.println(file.getPath()+" 文件创建 "+r1);
            System.out.println("是否存在:"+file.exists());
            System.out.println("当前file对象是否是目录:"+file.isDirectory());
            System.out.println("当前file对象是否是文件"+file.isFile());
            System.out.println("大小(具体字节数量):"+file.length());
            System.out.println("文件名:"+file.getName());
            boolean r2 = file.delete();//删除不存在的文件会返回false
            System.out.println("文件删除:"+r2);
            boolean r3 = dir.mkdirs();//
            System.out.println("多级文件夹创建:"+r3);
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
