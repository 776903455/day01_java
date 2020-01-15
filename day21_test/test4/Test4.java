package day21_test.test4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test4 {
    /*1.定义一个类，在类中定义一个成员方法 show ，
    方法功能是：打印一个字符串。
    2.使用反射机制创建该类的对象，并调用该对象的 show 方法。 */

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        /*创建ShowString类的字节码对象*/
        Class c=ShowString.class;
        /*通过类对象实例化ShowString类*/
        ShowString ss=(ShowString) c.newInstance();

        /*通过类对象创建方法对象,并指明要操作的方法*/
        Method method=c.getMethod("show", String.class);
        /*调用method对象的invoke方法指明那个对象的那个方法，并赋值*/
        Object lyh = method.invoke(ss, "lyh");
        System.out.println(lyh);

    }

}
