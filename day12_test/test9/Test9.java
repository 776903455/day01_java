package day12_test.test9;

import java.util.ArrayList;
import java.util.Iterator;

public class Test9 {
    /*自定义人类:包含姓名,年龄,身高属性.私有成员变量,生成无参,
    有参构造方法,生成get/set方法.创建5个人放到 ArrayList中.
    使用迭代器获取每个人的信息.找出最高的人,最矮的人并输出最高人和
    最矮人的信息.打印格式如下:最 高的人是张三,身高1.80.
    最矮的人是李四,身高1.60*/
    public static void main(String[] args) {

        ArrayList<Human> humans=new ArrayList<>();
        humans.add(new Human("张三",18,1.80));
        humans.add(new Human("李四",18,1.60));
        humans.add(new Human("王五",18,1.70));
        humans.add(new Human("赵六",18,1.71));
        humans.add(new Human("巫七",18,1.75));
        Iterator<Human> iterator = humans.iterator();
        Human maxHuman=humans.get(0);
        Human minHuman=humans.get(0);

        while (iterator.hasNext()){
            Human h = iterator.next();
            if (maxHuman.getHeight()<h.getHeight()){
                maxHuman=h;
            }
            if (minHuman.getHeight()>h.getHeight()){
                minHuman=h;
            }
        }
        System.out.println("最高的人:"+maxHuman.getName()+"-"+maxHuman.getHeight());
        System.out.println("最矮的人:"+minHuman.getName()+"-"+minHuman.getHeight());
    }
}
