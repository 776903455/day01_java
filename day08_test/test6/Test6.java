package day08_test.test6;

public class Test6 {

    public static void main(String[] args) {
        Chicken chicken =new Chicken();
        chicken.setAge(2);
        chicken.setColor("红色");
        chicken.eat();
        chicken.work();
        Duck duck=new Duck();
        duck.setAge(1);
        duck.setColor("黑色");
        duck.eat();
        duck.like();
    }
}
