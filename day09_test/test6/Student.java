package day09_test.test6;

public class Student extends  Person {
    @Override
    void eat() {
        System.out.println("年龄为"+getAge()+"岁 "+getName() +" 的学生在吃饭");
    }

    void study(){
        System.out.println("年龄为"+getAge()+"岁 "+getName() +" 的老师在学习");
    }
}
