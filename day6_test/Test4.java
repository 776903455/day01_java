package day6_test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

    /*自定义学生类存储到ArrayList集合,并操作集合 */

    public static void main(String[] args) {

        List<Student> list =new ArrayList<Student>();
        Student s1=new Student("it001","黄渤",1.72);
        Student s2=new Student("it002","孙红雷",1.78);
        Student s3=new Student("it003","章子怡",1.64);
        Student s4=new Student("it004","杨颖",1.68);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println("集合大小："+list.size());
        for (Student s:list){
            System.out.println(s.getsId()+","+s.getName()+","+s.getHeight());
        }

        System.out.println("----------------------------");

        System.out.println("身高1.70以上的学员：");
        for(Student sh:list){
            if(sh.getHeight()>1.70){
                System.out.println(sh.getsId()+","+sh.getName()+","+sh.getHeight());
            }
        }


    }
}
