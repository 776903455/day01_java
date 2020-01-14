package day17_test.test5;

import java.io.File;

public class Test5 {
    /*将C盘下a.txt文件删除 将C盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。*/
    public static void main(String[] args) {
        File file =new File("c:\\a.txt");
        if (!file.exists()){
            System.out.println("文件不存在或已经删除");
        }else {
            file.delete();
        }

        File file1 =new File("c:\\aaa");
        if (file1.exists()){
            file1.delete();
            System.out.println("删除成功");
        }else {
            System.out.println("文件不存在或已经删除");
        }
    }
}
