package day12_test.test5;

import java.util.ArrayList;

public class Test5 {
    /*往ArrayList添加以下元素” xiaomi”, ”xiaomi2”, ” xiaomi3”, ” xiaomi4”使用增强for遍历ArrayList中的元
素*/
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("xiaomi");
        arrayList.add("xiaomi1");
        arrayList.add("xiaomi2");
        arrayList.add("xiaomi3");
        arrayList.add("xiaomi4");
        for(String s:arrayList){
            System.out.println(s);
        }
    }
}
