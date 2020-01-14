package day09_test.test6;

public class Test6 {
    /*学生都有年龄和姓名属性,有吃饭(学生餐)和学习方法,但是有部分学生会打篮球
    老师都有年龄和姓名属性,有吃饭(工作餐)和讲课方法,但是有部分老师会打篮球
    定义一个方法模拟去打篮球,只要会打篮球的人都可以传入. 
    (提示通过在测试类中定义一个方法参数为接口)*/
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setName("马云");
        t1.setAge(45);
        SortTeacher t2=new SortTeacher();
        t2.setAge(35);
        t2.setName("大姚");
        Student s1=new Student();
        s1.setAge(20);
        s1.setName("小王");
        SportStudent s2=new SportStudent();
        s2.setAge(21);
        s2.setName("王中王");
        goToSport(t2);
//        goToSport(t1);
        goToSport(s2);
//        goToSport(s1);
    }

    public  static void goToSport(Sport sport){
        sport.playBasketball();
    }
}
