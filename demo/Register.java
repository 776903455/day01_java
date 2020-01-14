package demo;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class Register {

    public static void register() throws IOException {


        Scanner scanner =new Scanner(System.in);
        System.out.println("用户名：");
        String username=scanner.next();
        System.out.println("密码：");
        String password=scanner.next();
        Properties properties= new Properties();
        System.out.println(username);
        String value=properties.getProperty("45454");
        System.out.println(value);
        if(value!=null) {
            if (value.equalsIgnoreCase(password)) {
                System.out.println("用户已经存在,请重新输入");
                register();
            }
        }
        properties.load(new FileReader(new File("d:\\新建文件夹\\regist.txt")));
        properties.setProperty(username,password);
        FileWriter fw=new FileWriter("d:\\新建文件夹\\regist.txt");
        properties.store(fw,"register_name-value");

        System.out.println("注册成功");
        Demo2.zy();




    }
}
