package day19_test.test2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    /*利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java” */
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d:\\test\\e.txt"));
        bos.write("i love you".getBytes());
        bos.close();
    }
}
