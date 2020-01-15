package day21_test.test2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test2 {
    /*1.现有集合：ArrayList list = new ArrayList();
    2.利用反射机制在这个泛型为Integer的ArrayList中存放一个String类型的对象。 */
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        ArrayList<Integer> arrayList=new ArrayList<>();

       Class c=arrayList.getClass();
        Method method = c.getMethod("add",Object.class);
        method.invoke(arrayList,231);
        method.invoke(arrayList,54);
        method.invoke(arrayList,89);
        method.invoke(arrayList,"123456");

        System.out.println(arrayList);


    }




}
