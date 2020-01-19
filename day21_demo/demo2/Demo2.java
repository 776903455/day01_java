package day21_demo.demo2;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo2 {


    @Test
    public void method(){
        Class<Student> c=Student.class;
        try {
            Student student=c.newInstance();
            Constructor<Student> constructor=c.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);
            student= constructor.newInstance("尼古拉斯-赵四");

            Method method=c.getDeclaredMethod("sum", int.class, int.class);
            method.setAccessible(true);
            int sum=(int)method.invoke(student, 10, 20);

           Field field= c.getDeclaredField("age");
           field.setAccessible(true);
           field.set(student,sum);

            System.out.println(student.getName()+"-"+student.getAge());

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
