package test7_demo;

import java.io.*;

public class Demo5 {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        tets5();
       long end= System.currentTimeMillis();
    }

    private static void tets1() throws IOException {
        FileReader fr=new FileReader("d:\\test\\Test2.txt");
        FileWriter fw=new FileWriter("d:\\test\\2.txt");

         int i=0;
         while((i=fr.read())!=-1){
             fw.write(i);
             fw.flush();

         }
         fw.close();
         fr.close();
    }

    private static void tets2() throws IOException {
        FileReader fr=new FileReader("d:\\test\\Test2.txt");
        FileWriter fw=new FileWriter("d:\\test\\2.txt");

        int i=0;
        char[] ch=new char[1024];
        while((i=fr.read(ch))!=-1){
            fw.write(ch,0,ch.length);
            fw.flush();

        }
        fw.close();
        fr.close();
    }

    private static void tets4() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("d:\\test\\Test2.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\test\\4.txt"));

        int i=0;
        while((i=br.read())!=-1){
            bw.write(i);
            bw.flush();

        }
        bw.close();
        br.close();
    }

    private static void tets3() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("d:\\test\\Test2.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\test\\3.txt"));

        int i=0;
        char[] ch=new char[1024];
        while((i=br.read(ch))!=-1){
            bw.write(ch,0,ch.length);
            bw.flush();

        }
        bw.close();
        br.close();
    }

    private static void tets5() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("d:\\test\\Test2.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\test\\5.txt"));

        String s=null;

        while((s=br.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();

        }
        bw.close();
        br.close();
    }

}
