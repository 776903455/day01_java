package day14_test.test20;

import java.util.HashMap;

public class Tets20 {
    /*已知Map中保存如下信息:
    {“及时雨”=”宋江”, “玉麒麟”=”卢俊义”, “智多星”=”吴用”}
    其中键表示水浒中人物的外号，value表示人物的姓名.
    1. 往Map中添加“入云龙”=”公孙胜”, ”豹子头”=”林冲”两位好汉
    2. 删除“玉麒麟”=”卢俊义”
    3. 将key为“智多星”的value修改为null,
    4. 将“及时雨”=”宋江”,修改为”呼保义”=” 宋江” */
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("及时雨","宋江");
        hashMap.put("玉麒麟","卢俊义");
        hashMap.put("智多星","吴用");

        hashMap.put("入云龙","公孙胜");
        hashMap.put("豹子头","林冲");

        hashMap.remove("玉麒麟");
        hashMap.put("智多星",null);
        hashMap.remove("及时雨");
        hashMap.put("呼保义","宋江");
        System.out.println(hashMap);
    }
}
