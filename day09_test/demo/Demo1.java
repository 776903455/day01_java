package day09_test.demo;

import day09_test.test8.Cart;

public class Demo1 {
    public static void main(String[] args) {

      /*  Dog dog=new Dog();*/
        Animal cat=new Cat();
        Animal.show(cat);
    }
}

abstract class Animal{
    public abstract void eat();
    public static void show(Animal animal){
        animal.eat();
    }
}


class  Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class  Dog extends  Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
