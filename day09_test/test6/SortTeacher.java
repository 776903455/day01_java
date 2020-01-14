package day09_test.test6;

public class SortTeacher extends Teacher implements  Sport {
    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁 "+getName() +" 的老师在打篮球");
    }
}
