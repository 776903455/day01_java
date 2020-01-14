package day12_test.test8;

import java.util.ArrayList;
import java.util.Iterator;

public class Test8 {
    /*自定义学生类:
    包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,
    生成get/set方法.创建5个学生放到 ArrayList中.使用迭代器获取每个学生信息.
    统计总分,平均分,最高分,最低分并输出 */

    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student("张三",18,80));
        arrayList.add(new Student("李四",18,85));
        arrayList.add(new Student("王五",18,70));
        arrayList.add(new Student("赵六",18,90));
        arrayList.add(new Student("吴七",18,76));
        Iterator<Student> iterator = arrayList.iterator();
        int sum=0;
        int avg=0;
        int max=arrayList.get(0).getScore();
        int min=arrayList.get(0).getScore();
        while(iterator.hasNext()){
            Student stu = iterator.next();
            sum+=stu.getScore();
            if(max<stu.getScore()){
                max=stu.getScore();
            }
            if (min>stu.getScore()){
                min=stu.getScore();
            }

        }
        avg=sum/arrayList.size();
        System.out.println("总分\t\t平均分\t\t最高分\t\t最低分");
        System.out.println(sum+"\t\t"+avg+"\t\t\t"+max+"\t\t\t"+min);

    }

}
