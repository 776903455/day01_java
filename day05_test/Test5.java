package day05_test;

public class Test5 {

    /*定义两个类，经理类Manager，程序员类Coder ，并打印对应信息*/

    public static void main(String[] args) {

        Manager manager =new Manager("James",9527,15000);
        manager.intro();
        manager.showSalary();
        manager.work();

        Coder coder=new Coder("Kobe","0025",10000);
        coder.intro();
        coder.showSalary();
        coder.work();
    }

}
