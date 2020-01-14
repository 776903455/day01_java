package day12_test.test12;

import java.util.ArrayList;

public class Test12 {
    /*自定义人类:包含姓名,年龄,身高属性.
    私有成员变量,生成无参,有参构造方法,生成get/set方法.
    创建5个人对象放到 ArrayList中.使用迭代器获取每个人对象.
    将每个人的年龄加2岁.再使用增强for打印每个人的信息*/
    public static void main(String[] args) {






        ArrayList<Human> arrayList=new ArrayList();
        arrayList.add(new Human("张三",18,1.80));
        arrayList.add(new Human("李四",19,1.60));
        arrayList.add(new Human("王五",20,1.70));
        arrayList.add(new Human("赵六",21,1.71));
        arrayList.add(new Human("巫七",17,1.75));
        for(Human h:arrayList){
            h.setAge(h.getAge()+2);
        }
        System.out.println("过了两年后：");
        arrayList.stream().forEach(System.out::println);
    }
}
