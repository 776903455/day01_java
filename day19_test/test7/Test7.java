package day19_test.test7;

import java.io.*;
import java.util.ArrayList;

public class Test7 {
    /*定义一个学生类，包含姓名，年龄，性别等成员变量，
    提供setters和getters方法以及构造方法。在测试类中创建 一个学生对象，
    给学生对象的三个成员变量赋值。然后将该对象保存到当前项目根目录下的stu.txt文件中。 */
    public static void main(String[] args) throws IOException {
        ArrayList<Student> arrayList=new ArrayList<>();

        arrayList.add(new Student("罗苑浩",200,"男"));
        arrayList.add(new Student("孙悟空",100,"男"));
        arrayList.add(new Student("撒旦",154,"男"));



        FileOutputStream fis=new FileOutputStream("d:\\test\\h.txt",true);
      /*  OutputStreamWriter osw=new OutputStreamWriter(fis,"UTF-8");*/
        ObjectOutputStream oos=new ObjectOutputStream(fis);

        oos.writeObject(arrayList);

        oos.close();
        fis.close();

    }
}
