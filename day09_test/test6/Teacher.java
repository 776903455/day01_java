package day09_test.test6;

public class Teacher extends  Person {
    @Override
    void eat() {
        System.out.println("年龄为"+getAge()+"岁 "+getName() +" 的老师在吃饭");
    }

    void teach(){
        System.out.println("年龄为"+getAge()+"岁 "+getName() +" 的老师在教课");
    }

}
