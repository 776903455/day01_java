package day18_test.test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    /*利用字节输入流读取C盘文件a.txt的内容，使用循环读取，
    一次读取一个字节，直到读取到文件末尾。将读取的字 节输出到控制台*/
    public static void main(String[] args) throws IOException{
        FileInputStream fs=new FileInputStream("d:\\test\\a.txt");

        int len=0;
        while((len=fs.read())!=-1){
            System.out.print((char) len);
        }

    }
}
