package day18_test.test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    /*利用字节输出流一次写一个字节数组的方式向C盘的b.txt文件输出内容。 */

    public static void main(String[] args) throws IOException {
        File file=new File("d:\\test\\b.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write("hello,io流".getBytes());
        fileOutputStream.close();
    }
}
