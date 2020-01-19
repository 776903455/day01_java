package day21_test.test5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test5 {

    /*1.编写一个类A，定义一个实例方法 showString ，用于打印一个字符串。
    2.在编写一个类TestA，用键盘输入一个字符串，该字符串就是类A的全名，
    使用反射机制创建该类的对象，并 调用该对象中的方法showString */
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入day21_test.test5.ShowS");
        String next = scanner.next();

        try {
            Class<?> c1 = Class.forName(""+next);
            ShowS ss=(ShowS) c1.newInstance();
           Method method= c1.getMethod("showString");
           Object o= method.invoke(ss);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
