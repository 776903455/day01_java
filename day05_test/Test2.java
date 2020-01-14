package day05_test;

public class Test2 {
/*定义一个学生类，老师类，并打印相应方法*/
    public static void main(String[] args) {

        Teacher teacher =new Teacher();
        teacher.setAge(30);
        teacher.setName("周老师");
        teacher.setContent("java面向对象");
        teacher.eat();
        teacher.teach();
        Student student =new Student(18,"韩同学","java面向对象");
        student.eat();
        student.study();
    }
}
