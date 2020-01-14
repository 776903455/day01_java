package day08_test.test2;

public class Test2 {
    public static void main(String[] args) {
/*将程序员和老师中相同的内容(姓名,年龄,吃饭,睡觉)抽取到父类Person中 */
        Coder coder=new Coder();
        coder.name="马化腾";
        coder.age=45;
        coder.eat();
        coder.sleep();
        coder.work();
        System.out.println("--------------");
        Teacher teacher=new Teacher();
        teacher.name="马云";
        teacher.eat();
        teacher.sleep();
        teacher.teacher();

    }
}
