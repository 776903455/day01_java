package day6_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {
    /*
    * 1. 创建存放String的ArrayList集合
    * 2. 添加4个元素:"孙悟空","猪八戒","沙和尚","铁扇公主"
    * 3. 获取索引为3的元素并打印
    * 4. 修改索引为3的元素为"唐僧"
    * 5. 删除索引为1的元素
    * 6. 遍历集合,打印集合的所有元素*/
    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("铁扇公主");
        System.out.println(list.get(3));
        list.set(3,"唐僧");
        list.remove(1);
      /* for(int i=0;i<list.size();i++){
           System.out.println(list.get(i));
       }*/

  /*    for(String s : list){
          System.out.println(s);
      }*/

        Iterator<String> it =list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
