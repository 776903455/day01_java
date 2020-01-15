package day18_demo.demo3;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Demo3 {

    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("d:\\test\\score.txt");
        FileWriter fw=new FileWriter("d:\\test1\\"+new Date().getTime()+".txt");

        int  len=0;
        char[] ch=new char[1024];
        while ((len=fr.read(ch))!=-1){
            fw.write(ch);

        }

        fw.close();
        fr.close();
    }

    @Test
    public void fun1() throws IOException {
        FileWriter fw=new FileWriter("B.txt");
        fw.write("asdas");
        fw.close();
    }
}
