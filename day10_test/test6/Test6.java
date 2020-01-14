package day10_test.test6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test6 {
    /*student(name,age，score)
        List<Student>list=new ArrayList<>();
        List<Student>list2=new ArrayList<>();
        班级a有若干学生
        班级b有若干学生

        1打印总共有多少姓张的学生的个数
        2.先按年龄降序，再按成绩升序排序
        3.打印2个班级中前3个姓张且年龄小于18岁的学生信息
*/
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        List<Student>list2=new ArrayList<>();

        /*a班学生*/
        list.add(new Student("张三",15,70));
        list.add(new Student("张四",16,80));
        list.add(new Student("张五",16,90));
        list.add(new Student("赵三",17,71));
        list.add(new Student("赵四",18,72));
        list.add(new Student("赵五",18,73));
        list.add(new Student("王三",16,80));
        list.add(new Student("王四",18,81));
        list.add(new Student("王五",19,90));
        /*b班学生*/
        list2.add(new Student("张六",19,71));
        list2.add(new Student("张七",20,72));
        list2.add(new Student("李六",18,82));
        list2.add(new Student("曹三",20,81));
        list2.add(new Student("曹四",24,90));
        list2.add(new Student("曹五",18,91));
        list2.add(new Student("巫三",19,85));
        list2.add(new Student("巫四",17,79));
        list2.add(new Student("巫五",16,82));

//        1打印总共有多少姓张的学生的个数
        long zhang = Stream.concat(list.stream(), list2.stream()).filter(student -> {
            return student.getName().startsWith("张");
        }).count();
        System.out.println("姓张的人有："+zhang+"个");

        /*2.先按年龄降序，再按成绩升序排序*/
        System.out.println("先按年龄降序，再按成绩升序排序:");
        Stream.concat(list.stream(), list2.stream()).sorted((Student s1,Student s2)->{
            int num=s2.getAge()-s1.getAge();
            int num2=num==0?s1.getScore()-s2.getScore():num;
            return num2;
        }).forEach(System.out::println);




//        3.打印2个班级中前3个姓张且年龄小于18岁的学生信息
        System.out.println("2个班级中前3个姓张且年龄小于18岁的学生信息：");
       /* Stream.concat(list.stream(), list2.stream()).filter(student -> {
            return student.getName().startsWith("张")&&student.getAge()<18;
        }).limit(3).forEach(System.out::println);*/

        Stream.concat(list.stream(), list2.stream()).sorted((Student s1,Student s2)->{
            int num=s2.getAge()-s1.getAge();
            int num2=num==0?s1.getScore()-s2.getScore():num;
            return num2;
        }).filter(student -> {
            return student.getName().startsWith("张")&&student.getAge()<18;
        }).limit(3).forEach(System.out::println);

    }
}
