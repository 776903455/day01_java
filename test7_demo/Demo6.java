package test7_demo;

import java.io.*;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter writer =new OutputStreamWriter(new FileOutputStream("d:\\test\\6.txt"),"utf-8");
        InputStreamReader reader=new InputStreamReader(new FileInputStream("d:\\test\\6.txt"),"gbk");
        writer.write("你好嗄");
        writer.flush();
        char[] ch =new char[1024];
        reader.read(ch);
        System.out.println(ch);
        reader.close();
        writer.close();

    }

}
