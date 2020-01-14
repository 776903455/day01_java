package day18_test.test6;

import java.io.*;

public class Test6 {
    /*利用字节流将C盘下的a.png图片复制到D盘下(文件名保存一致)
        要求：
        1.一次读写一个字节的方式 */

    public static void main(String[] args) throws IOException {

       File file=new File("d:\\test1\\a.png");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdir();
        }
        /*输入源*/
        FileInputStream fis=new FileInputStream("d:\\test\\a.png");
        /*输出源*/
        FileOutputStream fos=new FileOutputStream(file);


        int len=0;
        while((len=fis.read())!=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
}
