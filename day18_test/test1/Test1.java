package day18_test.test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

    /*利用字节输出流一次写一个字节的方式向C盘的a.txt文件输出内容。*/

    public static void main(String[] args) throws IOException {

        File file=new File("d:\\test\\a.txt");
        FileOutputStream  fos = null;
        try {
         fos=new FileOutputStream(file);


            fos.write(97);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fos.close();
        }
    }
}
