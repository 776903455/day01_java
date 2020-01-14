package day14_test.test9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tes9 {
    /*研发部门有5个人，信息如下：
    （姓名-工资）【柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败 =3800】,
    将以上员工的相关信息存放在适合的集合中,
    给柳岩涨工资300,迭代出每个元素的内容输出到控制台 */
    public static void main(String[] args) {

        HashMap<String,Double> hashMap=new HashMap<>();
        Department departmen=new Department("柳岩",2100);
        Department department2=new Department("张亮",1700);
        Department department3=new Department("诸葛亮",1800);
        Department department4=new Department("灭绝师太",2600);
        Department department5=new Department("东方不败",3800);
        hashMap.put(departmen.getName(),departmen.getSalary());
        hashMap.put(department2.getName(),department2.getSalary());
        hashMap.put(department3.getName(),department3.getSalary());
        hashMap.put(department4.getName(),department4.getSalary());
        hashMap.put(department5.getName(),department5.getSalary());

        System.out.println("没涨工资前：");
        Set<Map.Entry<String, Double>> entries1 = hashMap.entrySet();
        for(Map.Entry<String,Double> entry:entries1){
            System.out.println(entry);
        }

        Department department = Department.addSalary(departmen, 300.0);
        hashMap.put(departmen.getName(),departmen.getSalary());

        System.out.println("涨工资后：");
        Set<Map.Entry<String, Double>> entries = hashMap.entrySet();
        for(Map.Entry<String,Double> entry:entries){
            System.out.println(entry);
        }



    }
}
