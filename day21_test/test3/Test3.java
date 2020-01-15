package day21_test.test3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test3 {
    /*定义一个Student类，用反射去创建一个Student对象，使用两种方式
    1.通过Class对象的方法创建。
    2.通过Constructor对象的方法创建。 */

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class c=Student.class;
        Student stu=(Student) c.newInstance();

        Constructor c1=c.getConstructor();
        Student stu1=(Student) c1.newInstance();

    }
}
