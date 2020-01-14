package day18_test.test7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
    /*用字节流将C盘下的a.png图片复制到D盘下(文件名保存一致)
    要求：一次读写一个字节数组的方式进行复制*/

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
        byte[] bys=new byte[1024];
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }
}
