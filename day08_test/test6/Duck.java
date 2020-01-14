package day08_test.test6;

public class Duck extends Animal {
    @Override
    void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在吃饭");
    }

    public void like(){
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在游泳");
    }


}
