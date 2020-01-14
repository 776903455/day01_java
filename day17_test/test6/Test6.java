package day17_test.test6;

import java.io.File;

public class Test6 {

    /*获取C盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。*/
    public static void main(String[] args) {
        File file=new File("D:\\test\\a.txt");
        System.out.println("文件名:"+file.getName());

        System.out.println("文件大小:"+file.length());

        System.out.println("文件的绝对路径:"+file.getAbsolutePath());


        System.out.println("父路径:"+file.getParent());

    }
}
