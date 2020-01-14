package day09_test.test6;

public class SportStudent extends  Student implements  Sport {
    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁 "+getName() +" 的学生在打篮球");
    }
}
