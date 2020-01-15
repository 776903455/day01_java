package day18_demo.demo1;

import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo1 {

   static Class<Student> studentClass=null;
    @BeforeClass
    public static void fun1(){
       studentClass=Student.class;
    }

    @Test
    public  void fun2() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
     Constructor c1= studentClass.getDeclaredConstructor(String.class,Integer.class);
        c1.setAccessible(true);
     Student s1=(Student) c1.newInstance("张三",18);

        System.out.println(s1.getName()+"-"+s1.getAge());


    }

    @Test
    public  void fun3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Student student=studentClass.newInstance();
        Method method=studentClass.getMethod("eat");
        Object invoke = method.invoke(student);
        System.out.println(invoke);

    }

    @Test
    public void fun4() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Student student = studentClass.newInstance();
        Method eat = studentClass.getMethod("eat", int.class);
        Object invoke = eat.invoke(student, 20);
        System.out.println(invoke);
    }

    @Test
    public void fun5() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Student student = studentClass.newInstance();
        Method method = studentClass.getDeclaredMethod("play");
        method.setAccessible(true);
        Object invoke = method.invoke(student);
        System.out.println(invoke);
    }

}
