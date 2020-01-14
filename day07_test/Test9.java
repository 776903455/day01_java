package day07_test;

import java.util.ArrayList;
import java.util.List;

public class Test9 {

    /*定义ArrayList集合，存入多个字符串
    删除ArrayList集合中长度大于4的字符串，打印删除后的集*/
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("bac");
        list.add("bacsad");
        list.add("bacasdasd");
        list.add("bacdasdasa");
        list.add("你好啊");
        list.add("我不好");
        list.add("你哪里不好");
        list.add("我哪里都不好");

        System.out.println("删除前:"+list);

      /*  List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() <= 4) {
                list1.add(list.get(i));
            }
        }*/

      for(int i=0;i<list.size();i++){

          if(list.get(i).length()>4){
              list.remove(i);
              i--;
          }
      }
        System.out.println("删除后："+list);
    }
}

