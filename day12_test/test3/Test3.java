package day12_test.test3;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
/*往ArrayList添加以下元素”abc1”, ”abc2”, ”abc3”, ”abc4”
使用迭代器获取ArrayList集合中的元素 */

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("abc1");
        arrayList.add("abc2");
        arrayList.add("abc3");
        arrayList.add("abc4");
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
