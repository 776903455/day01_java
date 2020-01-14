package test7_demo;

import org.junit.Test;

import java.io.*;
import java.util.Map;

public class Demo1 {


    public static void main(String[] args) {

        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        String line;
        while(true){
            try {
                if (((line=bufferedReader.readLine())!=null)){
                    System.out.println(line);
                    if(line.equals("886")){break;}
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    @Test
    public void fun1(){
        FileInputStream fis;
        FileOutputStream fos;
        BufferedInputStream bis;
        BufferedOutputStream bos;
        try {
            File file =new File("D:\\UpupooResource\\1800010625\\preview.jpg");
            fis= new FileInputStream(file);
            fos=new FileOutputStream("d:\\test\\b.png");
            bis=new BufferedInputStream(new FileInputStream(file));
            bos=new BufferedOutputStream(new FileOutputStream("d:\\test\\d.png"));

            double start=System.currentTimeMillis();
               /* test1(fis,fos);*/
              /*test2(fis,fos);*/
          /*  test3(bis,bos);*/
                test4(bis,bos);
            double end=System.currentTimeMillis();
            System.out.println(end-start);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void test3(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        int i=0;
        while((i=bis.read())!=-1){
            bos.write(i);
        }
        bos.close();

    }

    private void test4(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        int i=0;
        byte[] bys=new byte[1024];
        while((i=bis.read(bys))!=-1){
            bos.write(bys,0,bys.length);
        }
        bos.close();

    }

    private void test1(FileInputStream fis, FileOutputStream fos) throws IOException {

        int i=0;
        while((i=fis.read())!=-1){
            fos.write(i);

        }
        fos.close();

    }

    private void test2(FileInputStream fis, FileOutputStream fos) throws IOException {
        int i=0;
        byte[] bys=new byte[1024];
        while((i=fis.read(bys))!=-1){
            fos.write(bys,0,bys.length);

        }
        fos.close();

    }
}


