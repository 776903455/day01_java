package day18_test.test13;

import java.io.*;
import java.util.Scanner;

public class Test13 {

    /*从控制台获取输入的文件目录然后将该目录(包含子目录)
    下的.java文件复制到D:/java文件夹中,并统计java文件的个 数.

        提示:如果有相同的名称的文件,如果两个Test01.java,
        则拷贝到目标文件夹时只能有一个Test01.java,另一个 Test01.
        java要修改为另一个名称:该名称可随机生成,只要不重复即可.*/
    static  int sum=0;
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入文件夹路径：");
        String next = scanner.next();
        File srcfile=new File(next);
        getJavaFile(srcfile);

        System.out.println("java文件个数的次数"+sum);
    }
    public static void getJavaFile(File srcfile) throws IOException {

        File[] srcfile1=srcfile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });

        for(File file1:srcfile1){
            if(file1.isFile()){
                File dirfile=new File("d:\\test1\\"+file1.getName());
                copyFile(file1,dirfile);
                sum+=1;
            }else {
                getJavaFile(file1);
            }
        }

    }

        public static void copyFile(File srcfile,File dirFile) throws IOException {
            FileInputStream fis=new FileInputStream(srcfile);
            FileOutputStream fos=new FileOutputStream(dirFile);
            int len =0;
            byte[] bys=new byte[1024];
            while ((len=fis.read(bys))!=-1){
                fos.write(bys,0,len);
            }

            fos.close();
            fis.close();

        }
}
