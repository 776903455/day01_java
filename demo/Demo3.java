package demo;

import org.junit.Test;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class Demo3 {

    @Test
    public void test1() throws IOException {

        Properties properties= new Properties();
        properties.load(new FileReader(new File("D:\\新建文件夹\\regist.txt")));
      /*  String name=properties.getProperty("username");*/
        properties.setProperty("ada45","54h");
        FileWriter fw=new FileWriter(new File("D:\\新建文件夹\\regist.txt"));

      String value=properties.getProperty("45454");
        System.out.println(value);
        properties.store(fw,"register_name-value");




    }
}
