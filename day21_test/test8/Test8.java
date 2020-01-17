package day21_test.test8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*已知一个类，定义如下 
    package com.dfbz 
    public class DemoClass  {   
    public void run() 
    {   System.out.println("Every one!");   } 
     } 
 (1)写一个Properties格式的配置文件，配置类的完整名称。
  (2)写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，
   (3)用反射的方式运行run方法。
 */
public class Test8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class c=Class.forName(getName());
        DemoClass demoClass=(DemoClass) c.newInstance();
        Method method=c.getMethod("run");
        Object invoke = method.invoke(demoClass);
        System.out.println(invoke);


    }
    public static String getName () throws IOException {

        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("D:\\java_space\\day01_java\\src\\day21_test\\test8\\demo.properties");
        p.load(fis);
        String demoClassName = p.getProperty("DemoClassName");
        fis.close();
        return demoClassName;
    }
}
