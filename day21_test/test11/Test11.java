package day21_test.test11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test11 {

    /*1) 模拟JUnit测试的注释@Test，首先需要编写自定义注解@MyTest，并添加元注解，
    保证自定义注解只能修饰方法， 且在运行时可以获得。
    2) 其次编写目标类（测试类），然后给目标方法（测试方法）使用@MyTest注解，编写三个方法，其中两个加上 @MyTest注解。
    3) 最后编写调用类，使用main方法调用目标类，模拟JUnit的运行，只要有@MyTest注释的方法都会运行。
     */

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class c=Test1.class;
        Test1 test1=(Test1) c.newInstance();
        Method[] methods = c.getMethods();
        for(Method method:methods){
            if(method.isAnnotationPresent(MyTest.class)){
                method.invoke(test1);
            }
        }

    }
}

    class Test1{

        @MyTest
        public void test1(){
            System.out.println("我是test1，我被调用了");
        }

        public void test2(){
            System.out.println("我是test2，我被调用了");
        }

        @MyTest
        public void test3(){
            System.out.println("我是test3，我被调用了");
        }
    }
