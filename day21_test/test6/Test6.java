package day21_test.test6;


import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test6 {
    /*按要求完成下面两个方法的方法体 写一个方法，
    此方法可将obj对象中名为propertyName的属性的值设置为value.
    public void setProperty(Object obj, String propertyName, Object value){ 
} 写一个方法，
此方法可以获取obj对象中名为propertyName的属性的值
public Object getProperty(Object obj, String propertyName){ 
}
*/

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException, NoSuchMethodException, InvocationTargetException {

       /* MyObject myObject = new MyObject();*/
        Class c=MyObject.class;
        MyObject myObject=(MyObject) c.newInstance();
        setProperty(myObject, "propertyName", "王五");
       /* System.out.println(getProperty(myObject,"propertyName"));*/
        System.out.println(myObject.getPropertyName());
    }

    public static void setProperty(MyObject mo, String propertyName, Object value) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class c = mo.getClass();
        Field field = c.getDeclaredField(propertyName);
        field.setAccessible(true);
        field.set(mo, value);
        /*  System.out.println(myObject.getPropertyName());*/

    }

    public static   Object getProperty(MyObject mo, String propertyName) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class c=mo.getClass();
        Field field= c.getDeclaredField(propertyName);
        field.setAccessible(true);
        return field.get(mo);
       /* return invoke;*/

    }
}