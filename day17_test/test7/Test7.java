package day17_test.test7;

import java.io.File;

public class Test7 {

    /*1.判断File对象是否文件,是文件则输出：xxx是一个文件，否则输出：xxx是不是一个文件。
     2.判断File对象是否文 件夹,是文件夹则输出 ：xxx是一个文件夹，否则输出：xxx是不是一个文件夹。
     (xxx是文件名或文件夹名) */
    public static void main(String[] args) {
        File file=new File("d:\\text\\a.txt");
        File file1=new File("d:\\test");
        if(file.isFile()){
            System.out.println(file.getName()+"是文件");
        }else {
            System.out.println(file.getName()+"不是文件");
        }

        if(file1.isDirectory()){
            System.out.println(file1.getName()+"是文件夹");
        }else {
            System.out.println(file1.getName()+"不是文件夹");
        }

    }

}
