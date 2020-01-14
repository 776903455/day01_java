package day17_test.test17;

import java.io.File;
import java.io.FileFilter;

public class Test17 {

    /*使用文件过滤器筛选将指定文件夹下的小于200K的小文件获取并打印(包括所有子文件夹的文件)。*/
    public static void main(String[] args) {
        File file=new File("d:\\test");
        getSize(file);
    }

    private static void getSize(File file) {
       File[] files= file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isFile()){
                    return pathname.length()<200*1024;
                }else {
                    return true;
                }


            }
        });

       for (File file1:files){

           if (file1.isFile()){
               System.out.println(file1.getName());
           }else {

               getSize(file1);
           }
       }

    }
}
