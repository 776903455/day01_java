package day17_test.test15;

import java.io.File;
import java.util.Scanner;

public class Test15 {

    /*键盘录入一个文件夹路径，删除该路径下的文件夹。
        要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
        提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。*/

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入文件夹路径格式为d:\\xxx\\xxx");
        String next = scanner.next();

        File file1=new File(next);

        if(file1.length()==0){
            file1.delete();
            System.out.println("删除成功");
        }else {
            File[] files = file1.listFiles();
            for(File file11:files){
                file11.delete();

            }
            file1.delete();
            System.out.println("删除成功");
        }

    }
}
