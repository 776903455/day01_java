package day18_test.test5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {

    /*利用字节输入流读取C盘文件b.txt的内容，使用循环读取，
    一次读取一个字节数组，直到读取到文件末尾，
    将读取 到的字节数组转换成字符串输出到控制台。 */
    public static void main(String[] args) throws IOException {
        FileInputStream fs=new FileInputStream("d:\\test\\b.txt");
        byte[] bys=new byte[1024];
        int len=0;
        while ((len=fs.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }

    }
}
