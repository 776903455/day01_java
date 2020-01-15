package day18_demo.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("d:\\a");
        FileOutputStream fileOutputStream=new FileOutputStream("d:\\b");

        int len=0;
        byte[] bys=new byte[1024];
        while ((len=fileInputStream.read(bys))!=-1){
            fileOutputStream.write(bys,0,len);
        }

        fileInputStream.close();;
        fileOutputStream.close();
    }
}
