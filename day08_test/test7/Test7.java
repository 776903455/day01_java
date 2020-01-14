package day08_test.test7;

public class Test7 {

/*1. 经理 成员变量:工号,姓名,工资 成员方法:工作(管理其他人),吃饭(吃鱼)
 2. 厨师 成员变量:工号,姓名,工资 成员方法:工作(炒菜),吃饭(吃肉)
 */

    public static void main(String[] args) {
        Manager manager=new Manager("m110","老王",10000.0);
        manager.eat();
        manager.work();
        Cook cook=new Cook("c110","小王",6000);
        cook.eat();
        cook.work();
    }
}
