package day18_demo.demo6;

import java.io.*;

public class Demo6 {

    private static final String SRC_PATH="D:\\软件\\数据库\\oracle\\win64_11gR2_database_2of2.zip";
    private static final String DIR_PATH="D:\\test\\win64_11gR2_database_2of2.zip";

    public static void main(String[] args) throws IOException {
       /* fun1();*/
        fun2();


    }

    public static void fun1() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream  fis=new FileInputStream(SRC_PATH);
        FileOutputStream fos=new FileOutputStream(DIR_PATH);
        int len=0;
        byte[] bys=new byte[1024];
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("字节数组耗时："+(end-start));
    }

    public static void fun2() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream  fis=new FileInputStream(SRC_PATH);
        BufferedInputStream bid=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream(DIR_PATH);
        BufferedOutputStream bis=new BufferedOutputStream(fos);
        int len=0;
        byte[] bys=new byte[1024];
        while((len=bid.read(bys))!=-1){
            bis.write(bys,0,len);
        }

        bis.close();

        fos.close();
        bid.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("字节数组耗时："+(end-start));
    }
}
