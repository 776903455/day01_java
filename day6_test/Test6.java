package day6_test;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    /*自定义Worker对象,存入ArrayList集合.并遍历集合获取年龄最大的对象
    * 1. 定义Worker类，包含以下内容
     2. 在main方法中创建3个Worker对象
     3. 创建保存Worker对象的Arraylist集合
     4. 将上面创建的3个Worker对象存入Arraylist集合中
     5. 定义ﬁndMaxAge方法,参数列表(ArrayList workers),
     返回值类型void, ﬁndMaxAge方法的功能是获取参 数workers集合中最大年龄的Worker对象,
     并调用大年龄对象的show方法
     6. 在ﬁndMaxAge方法中定义Worker类型的变量maxAgeWorker,maxAgeWorker变量保存最大年
     龄的 Worker,初始化值为workers集合索引为0的对象
     7. 在ﬁndMaxAge方法中使用for循环遍历workers集合中的每个worker对象
     8. 如果取出的worker对象年龄大于maxAgeWorker的年龄,修改maxAgeWorker值为取出的worker对象
     9. 调用maxAgeWorker对象的show方法
     10. 在main方法中调用ﬁndMaxAge方法,参数传入上面创建的Arraylist集合
*/
    public static void main(String[] args) {
        Worker worker1=new Worker("bz001","黄渤",45);
        Worker worker2=new Worker("bz002","孙红雷",48);
        Worker worker3=new Worker("bz003","罗志祥",35);
        List<Worker> list =new ArrayList<>();
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);


        ﬁndMaxAge(list);

    }

    private static void ﬁndMaxAge(List<Worker> list) {
            Worker workerMaxAge=list.get(0);
            for(Worker w:list){
                if(w.getAge()>workerMaxAge.getAge()){
                    workerMaxAge=w;
                }
            }
            workerMaxAge.show();
        System.out.println(workerMaxAge.getwId()+","+workerMaxAge.getName()+","+workerMaxAge.getAge());

    }
}
