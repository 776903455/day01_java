package day17_test.test14;

import java.io.File;
import java.io.FileFilter;

public class Test14 {
    /*获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台 */

    public static void main(String[] args) {

        File file=new File("d:\\test");
        File[] files=file.listFiles((f)->{
            return f.isFile()&&f.getName().endsWith(".java");
        });
        /*File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile()&&pathname.getName().endsWith(".java");
            }
        });*/

        for(File file1:files){
            System.out.println(file1.getName());
        }
    }
}
