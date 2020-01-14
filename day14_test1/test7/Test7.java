package day14_test1.test7;

public class Test7 {
    /* 1.每一个学生(Student)都有学号,姓名和分数,分数永远不能为为负数。
    2.如果试图给学生赋值一个负数,抛出一个自定异常 */
    public static void main(String[] args) throws NoScoreException {

        Student student1=new Student("lyh",-3);
        System.out.println(student1);
        Student student=new Student();
       /* student.setScore(-1);*/
        student.setScore(15);
    }
}
