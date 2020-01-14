package day12_test.test10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test10 {
    /*ArrayList中有如下数据:
    ”a”,”b”, ”c”, ”c”, ”a”, ”b”, ”b”, ”b”, ”a”.
    定义名为:frequency(ArrayLis tarr, String key)
    的方 法.arr是ArrayList集合,key是要查找的某个元素.
    使用增强for方式查找key在ArrayList中出现的次数.并将次数作为方法
    的返回值.在mian方法中调用frequency方法*/
    public static void main(String[] args) {
/*        ArrayList<String> arrayList=new ArrayList<>();*/
       String[] arr={"a","b","c","c","a","b","b","b","a"};
        List<String> list = Arrays.asList(arr);
        String key="b";
        frequency(list,key);

    }

    public  static  void frequency(List<String> arr, String key){
                int count=0;
        System.out.println(arr);
            for(String s:arr){
                if(s.equals(key)){
                    count++;
                }

            }
        System.out.println(key+"出现了"+count+"次");
    }
}
