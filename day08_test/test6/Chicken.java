package day08_test.test6;

public class Chicken extends Animal {
    @Override
    void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在啄米");
    }

    public void work(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在打鸣");
    }
}
