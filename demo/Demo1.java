package demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {

        TreeSet<Student> list =new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int nun1=o1.getAge()-o2.getAge();
                int num2=nun1==0?o1.getName().compareTo(o2.getName()):nun1;
                return num2;
            }
        });
        Student s1=new Student("唐僧",25);
        Student s2=new Student("孙悟空",29);
        Student s3=new Student("猪八戒",28);
        Student s4=new Student("沙僧",26);
        Student s5=new Student("唐僧",30);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        for(Student student:list){
            System.out.println(student);
        }

    }
}
