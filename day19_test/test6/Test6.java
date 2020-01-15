package day19_test.test6;

import java.io.*;

public class Test6 {

    /*利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，
    并打印在控制台上。要求：不能出现乱码的情况。 */

    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("d:\\test\\g.txt"),"GBK");

        int len =0;
        while ((len=isr.read())!=-1){
            System.out.print((char) len);
        }
        isr.close();
    }
}
