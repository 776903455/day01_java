package day08_test.test5;

public class Test5 {
    public static void main(String[] args) {

/* 模拟教学管理系统师生信息 ，输出老师和学生信息*/
        Teacher teacher=new Teacher("java");
        teacher.setName("王小平老师");
        teacher.teach();
        Student student=new Student(90);
        student.setName("李小乐同学");
        student.exam();
    }
}
