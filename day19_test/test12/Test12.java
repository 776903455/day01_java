package day19_test.test12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Test12 {

    public static void main(String[] args) throws IOException {

/*        File file=new File("d:\\test\\s.txt");*/
        Path path= Paths.get("d:\\test","s.txt");
        Path path1= Paths.get("d:\\test","z.txt");
        /*Files.copy(path,path1);*/
        FileInputStream fileInputStream=new FileInputStream("d:\\test\\z.txt");
       byte[] bys=new byte[1024];
       int len=0;
        while ((len=fileInputStream.read(bys))!=-1){
            System.out.println(new String(bys,0,bys.length));
        }

        fileInputStream.close();
    }
}
