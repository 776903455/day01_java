package day17_test.test20;

import java.io.File;
import java.util.Scanner;

public class Test20 {
    /*从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印 例如:
        aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有ﬀf.
        txt和ggg.txt,打印出层级来
          aaa

         bbb.txt
          ccc.txt
          ddd.txt

         eee
          ﬀf.txt
          ggg.txt*/

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入文件夹路径");
        String path = scanner.next();
        File file=new File(path);
        System.out.println(file.getName());
        getAllFile(file);


    }

    private static void getAllFile(File file) {


        File[] files = file.listFiles();
        for(File file1:files){
            if (file1.isFile()){

                System.out.println(file1.getName());
            }else {
                System.out.println(file1.getName());
                getAllFile(file1);
            }
        }
    }


}
