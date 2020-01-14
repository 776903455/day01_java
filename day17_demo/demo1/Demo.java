package day17_demo.demo1;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Demo {

    @Test
    public void fun1() {
        File file = new File("D:\\test");
        File[] files = file.listFiles();
        for(File file1:files){
           /* System.out.println(file1.getName());*/
          /*  System.out.println(file1.getPath());*/
           /* System.out.println(file1.getAbsolutePath());*/
            System.out.println(file1.length());
        }
    }


    @Test
    public void fun2() {
        File file = new File("D:\\test");
        boolean exists = file.exists();
        boolean directory = file.isDirectory();
        boolean file1 = file.isFile();
        System.out.println(exists);
        System.out.println(directory);
        System.out.println(file1);
    }

    @Test
    public void fun3() throws IOException {
        File file = new File("D:\\test\\a\\b\\c");
       /* file.createNewFile();
        file.delete();*/
       file.mkdirs();

    }
}
