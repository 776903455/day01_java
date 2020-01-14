package day08_test.test3;

public class Test3 {
    public static void main(String[] args) {
        /*将狗和猫相同的内容(姓名,颜色,价格,吃饭)抽取到父类Animal中 */
        Dog dog =new Dog();
        dog.name="旺财";
        dog.eat();
        dog.work();
        System.out.println("------------------");
        Cat  cat =new Cat();
        cat.name="波斯猫";
        cat.eat();
        cat.work();
    }


}
