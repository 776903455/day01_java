package day14_test.test7;

import day14_test.test6.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test7 {

    /*每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，
    则将学生对象和家庭住址存储到map集合 中。学生作为键,
    家庭住址作为值，并使用keySet和entrySet方式遍历Map集合.注意，
    学生姓名相同并且年龄相 同视为同一名学生 */

    public static void main(String[] args) {
        HashMap<Student,String> hashMap=new HashMap<>();
        hashMap.put(new Student("杨过",18),"广州");
        hashMap.put(new Student("郭靖",36),"深圳");
        hashMap.put(new Student("杨康",20),"佛山");
        hashMap.put(new Student("陈玄风",30),"香港");

        System.out.println("keySet方法");
        Set<Student> students = hashMap.keySet();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student key = iterator.next();
            String value=hashMap.get(key);
            System.out.println(key+"--"+value);
        }

        System.out.println("entrySet方法");
        Set<Map .Entry<Student,String>> entries=hashMap.entrySet();
        Iterator<Map.Entry<Student, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


    }
}
