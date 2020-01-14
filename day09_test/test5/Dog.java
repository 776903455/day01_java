package day09_test.test5;

public class Dog extends  Animal {
    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome(){
        System.out.println("老老实实看家");
    }
}
