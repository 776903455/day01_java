package day18_test.test10;

import java.io.*;

public class Test10 {
    /*在C盘下创建一个目录d1,在目录d1下创建创建若干个文本文件，
    并在每一个文本文件中添加若干内容。利用字节流
    将该目录下的所有文件复制到C盘下的d2目录下。 */
    public static void main(String[] args) throws IOException {

        /*数据源*/
        File srcFile=new File("d:\\d1");

        File[] srcfiles = srcFile.listFiles();
        for (File file:srcfiles){
            File dirFile=new File("d:\\d2\\"+file.getName());
            copyFile(file,dirFile);
        }



    }

    private static void copyFile(File file, File dirFile) throws IOException {
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(dirFile);

        int len=0;
        byte[] bys=new byte[1024];
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();

    }
}
