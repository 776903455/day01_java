package day21_test.test7;



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test7 {
    /*1.定义一个Person类，包含属性name、age。
    2.使用反射的方式创建一个实例、调用构造函数初始化name、age。
    使用反射方式调用setName方法对姓名进 行设置，
    不使用setAge方法直接使用反射方式对age赋值。 */

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class c=Person.class;
        /*使用反射的方式创建一个实例、调用构造函数初始化name、age。*/
        Constructor constructor= c.getConstructor(String.class,int.class);
        Person person=(Person) constructor.newInstance("孙悟空",100);
        System.out.println(person.getName()+"-"+person.getAge());

        /*使用反射方式调用setName方法对姓名进 行设置*/
       /* Person person1 = (Person) c.newInstance();*/
        Method method=c.getMethod("setName", String.class);
        Object obj = method.invoke(person,"李四");
        System.out.println(person.getName()+"-"+person.getAge());


        /*不使用setAge方法直接使用反射方式对age赋值。*/

      Field field= c.getDeclaredField("age");
      field.setAccessible(true);
      field.set(person,25);

      System.out.println(person.getName()+"-"+person.getAge());


    }

}
