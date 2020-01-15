package day19_test.test11;

import java.io.*;
import java.util.ArrayList;

public class Test11 {
    /*定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
     定义一个测试类，在测试类创建多个学生对象保存到集合中，然后将集合存储到当前项目根目录下的stus.txt文件 中。 */

    public static void main(String[] args) throws IOException {

        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student("罗号",45));
        arrayList.add(new Student("啊号",44));
        arrayList.add(new Student("萨达号",46));
       /* PrintStream ps=new PrintStream("stus.txt");
        System.setOut(ps);
        System.out.println(arrayList);*/

        FileOutputStream fos=new FileOutputStream("stus.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(arrayList);
        oos.close();





    }
}
