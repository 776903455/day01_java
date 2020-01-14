package day17_test.test12;

import day16_test.test10.Person;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Test12 {

    /*
    * 键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
        如果是文件，则输出文件的大小
        如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。*/
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入文件路径格式为：d:\\xxx\\xxx");
        String next = scanner.next();
        File file=new File(next);
        long len=0;
        if(file.isFile()){
            System.out.println(file.length());
            System.out.println("该文件的长度为："+file.length());
        }else if (file.isDirectory()){
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isFile();
                }
            });

            for (File file1:files){
                len+=file1.length();
            }
           /* for (File file1:files){
                if(file1.isFile()){
                   len+=file1.length();
                }
            }*/
            System.out.println("该文件夹下的文件长度之和为："+len);
        }else{
            System.out.println("文件不存在或格式错误");
        }

    }
}
