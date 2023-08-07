package com.imooc.io;

import java.io.*;

public class TextFileDemo {
    /*
    读取文件
     */
    public void readTextFile() {
        Reader reader = null;

        try {
            File file = new File("d:/test.txt");
            if (!file.exists()) {
                return;
            }
            reader = new FileReader(file);
            int ch = 0;
//          ch是读取每一个字符的uft字符集编码
            while ((ch = reader.read()) != -1) {
//               int强制转换为char就是字符
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    /*
    写入文件
     */
    public void wirteTextFile() {
        Writer write = null;
        try {
            File file = new File("d:/test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            write = new FileWriter(file);
            write.write("这是一个新文件new");//会覆盖原有文件
            write.append("append");//追加内容
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (write != null) {
                try {
                    write.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readBuffer() {
        Reader reader = null;
        BufferedReader br = null;
        try {
            File file = new File("e:/FileDemo.java");
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        TextFileDemo textFileDemo = new TextFileDemo();
//        textFileDemo.wirteTextFile();
//        textFileDemo.readTextFile();
        textFileDemo.readBuffer();
    }

}
