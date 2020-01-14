package day10_test.test2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
/*模拟上课出勤情况。*/
        ArrayList<Student> arrayList=new ArrayList<>();
        Student s1=new Student("小红");
        Student s2=new Student("小亮");
        Student s3=new Student("小明");

        Teacher teacher =new Teacher("张老师");
        teacher.dm(s1).setStatus("上课");
        teacher.dm(s2).setStatus("上课");
        teacher.dm(s3).setStatus("缺勤");

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);


        Couse couse=new Couse("java",teacher.getName(),arrayList);
        couse.show();
    }
}
