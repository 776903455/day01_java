package day17_test.test16;

import java.io.File;
import java.util.Scanner;

public class Test16 {
    /*从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。*/
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个文件夹路径格式为d:\\xxx\\xxx");
        String next = scanner.next();
        File file=new File(next);
        System.out.println("长度为："+ getSize(file)) ;
    }

    private static long getSize(File file) {
        long len=0;
        long size=0;

        File[] files = file.listFiles();
        for(File file1:files){
            if (file1.isFile()){

                len+=file1.length();
            }else{

                 len+=getSize(file1);


            }
        }

        return len;
    }
}
