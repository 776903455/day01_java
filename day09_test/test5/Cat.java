package day09_test.test5;

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("努力抓老鼠");
    }
}
