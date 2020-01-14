package day17_test.test18;

import java.io.File;
import java.util.Scanner;

public class Test18 {

    /*键盘录入一个文件夹路径，删除该路径下的文件夹。
        要求：文件夹中包含有子文件夹*/

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个文件夹路径");
        String next = scanner.next();
        File file=new File(next);
        deleteFile(file);
    }

    private static void deleteFile(File file) {

        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                file1.delete();
            } else {

                deleteFile(file1);
                file1.delete();

            }
        }

        if (file.length() == 0) {
            file.delete();
            System.out.println("删除成功");
        }

    }
}
