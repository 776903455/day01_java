package day14_test.test18;

import java.util.HashMap;

public class Test18 {
    /*有2个数组,第一个数组内容为:
    [黑龙江省,浙江省,江西省,广东省,福建省],
    第二个数组为:[哈尔滨,杭州,南昌,广州,福州],
    将第一个数组元素作为key,第二个数组元素作为value存储到Map集合中.
    如{黑龙江省=哈尔滨, 浙江省=杭州, …} */
    public static void main(String[] args) {
        String[] s1={"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] s2={"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String,String> hashMap=new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            hashMap.put(s1[i],s2[i]);
        }
        System.out.println(hashMap);
    }
}
