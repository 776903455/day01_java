package day19_test.test8;



import day19_test.test7.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test8 {
//    将上一题保存到stu.txt文件中的学生对象读取出来。
public static void main(String[] args) throws IOException, ClassNotFoundException {
    ArrayList<Student> arrayList=null;
    Student student=null;
    FileInputStream fis=new FileInputStream("d:\\test\\h.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    arrayList=(ArrayList) ois.readObject();
    for (int i = 0; i < arrayList.size(); i++) {
        Student s1=arrayList.get(i);
        System.out.println(s1.getName()+"-"+s1.getAge());
    }

    ois.close();
    fis.close();
}
}
