package day12_test.test1;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    /*.Collection基本方法 */
    public static void main(String[] args) {
       /*1.创建Colection对象.Collection是接口.所以创建子类ArrayList对象 */
        Collection<Object> collection=new ArrayList<Object>();
//        2.往集合中添加对象元素
       collection.add(new User(18,"张三"));
       collection.add(new User(19,"李四"));
       collection.add("123");

        System.out.println(collection);
//       3.删除元素
        collection.remove("123");
        System.out.println(collection);
        /*4.获取集合大小 */
        int size = collection.size();
        System.out.println(size);

//        5.清空集合
        collection.clear();
//         6.输出集合内容
        System.out.println(collection);




    }
}
