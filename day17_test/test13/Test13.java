package day17_test.test13;

import java.io.File;

public class Test13 {
    /*递归遍历将指定文件夹的所有文件(包括所有子文件夹的文件)的全路径输出在控制台。*/
    public static void main(String[] args) {
        File file=new File("d:\\test");
        getPath(file);
    }

    private static void getPath(File file) {

        File[] files = file.listFiles();
        for(File file1:files){
            if(file1.isFile()){
                System.out.println("文件："+file1.getAbsolutePath());
            }else {
                System.out.println("目录："+file1.getAbsolutePath());
                getPath(file1);
            }
        }

    }
}
