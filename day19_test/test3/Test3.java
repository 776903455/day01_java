package day19_test.test3;

import java.io.*;

public class Test3 {
    /*利用高效字节输入流和高效字节输出流完成文件的复制。
        要求：
        1.将C盘下的c.png文件复制到D盘下
        2.一次读写一个字节数组方式复制 */
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\test\\a.png"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d:\\test1\\a.png"));
        byte[] bys =new byte[1024];
        int len=0;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,bys.length);
        }

        bos.close();
        bis.close();
    }
}
