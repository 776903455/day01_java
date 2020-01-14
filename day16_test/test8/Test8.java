package day16_test.test8;

import java.util.Arrays;

public class Test8 {
    /*1. 对Java基础班学生的考试成绩进行排序
    定义一个学生类，有两个属性。姓名，考试成绩
     在测试类中定义一个学生数组，存储学生信息。
    使用Lambda省略格式写法对学生数组按照考试成绩由高到低进行排序。*/

    public static void main(String[] args) {
        Student[] student={new Student("qwe",80),
                new Student("asd",100),
                new Student("zxc",90),
                new Student("rty",70),
                new Student("fgh",85),};

        Arrays.sort(student,(s1,s2)->{
            return s2.getScore()-s1.getScore();
        });

        for (Student s:student){
            System.out.println(s);
        }
    }
}
