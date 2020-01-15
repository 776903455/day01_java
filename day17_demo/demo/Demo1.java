package day17_demo.demo;

import day17_demo.demo1.Student;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student("阿萨大",200));
        arrayList.add(new Student("温泉",40));
        arrayList.add(new Student("的风格",20));
        arrayList.add(new Student("微软",70));


        PrintStream ps=new PrintStream("stus.txt");
        ps.println(arrayList);
    }

    @Test
    public void fun1() throws IOException, ClassNotFoundException {

        FileInputStream fs=new FileInputStream("stus.txt");
        ObjectInputStream pis=new ObjectInputStream(fs);
        ArrayList<Student> arrayList=(ArrayList<Student>)pis.readObject();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getName()+"-"+arrayList.get(i).getAge());
        }


    }

    @Test
    public void fun2() throws IOException {
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student("阿萨大",200));
        arrayList.add(new Student("温泉",40));
        arrayList.add(new Student("的风格",20));
        arrayList.add(new Student("微软",70));

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stus.txt"));
        oos.writeObject(arrayList);
        oos.close();
    }

    @Test
    public void fun3() throws IOException {
      Student student=new Student("萨大",100);


        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stus.txt",true));
        oos.writeObject(student);
        oos.close();
    }
}


