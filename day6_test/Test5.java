package day6_test;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    /* 1.定义Teacher类，包含以下内容
     2:在main方法中创建3个Teacher对象
     3.创建保存Teacher对象的Arraylist集合
     4.将上面创建的3个Teacher对象存入Arraylist集合中
     5.使用for循环遍 历这个Arraylist集合,打印每个Teacher对象的name, age,like信息
     6.使用for循环遍历这个Arraylist集合,在for 循环遍历的过程中，如果集合中取出的对象的年龄大于40,
     那么将这个对象的爱好改成"打高尔夫",然后调用这 个对象的show方法展示这个对象所有的属性信息
*/

    public static void main(String[] args) {

        Teacher teacher1 =new Teacher("姚小明",23,"打篮球");
        Teacher teacher2 =new Teacher("景甜",20,"打羽毛球");
        Teacher teacher3 =new Teacher("薛之谦",45,"踢足球");
        List<Teacher> list=new ArrayList<>();
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        for(Teacher t:list){
            System.out.println(t.getName()+","+t.getAge()+","+t.getLike());
        }
        System.out.println("----------------------------");
        for(Teacher t1:list){
            if(t1.getAge()>40) {
                t1.setLike("打高尔夫");
                System.out.println(t1.getName() + "," + t1.getAge() + "," + t1.getLike());
            }
        }




    }
}
