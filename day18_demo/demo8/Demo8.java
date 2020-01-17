package day18_demo.demo8;

import java.io.*;

public class Demo8 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       /* fun1();*/
        fun2();

    }

    public  static void fun1() throws IOException {
        User user=new User("罗浩",18);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:\\test.a.txt"));
        oos.writeObject(user);
        oos.close();

    }

    public  static void fun2() throws IOException, ClassNotFoundException {

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\test.a.txt"));
        User user=(User) ois.readObject();
        System.out.println(user);

    }
}
