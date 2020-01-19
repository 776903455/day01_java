package day21_demo.demo3;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Demo3 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        Properties p = new Properties();
        /* p.load(Demo3.class.getResourceAsStream("src\\day21_demo\\demo3\\student.properties"));*/
        p.load(new FileInputStream("D:\\java_space\\day01_java\\src\\day21_demo\\demo3\\student.properties"));
        Set<String> key = p.stringPropertyNames();
        String className = p.getProperty("className");
        Class c = Class.forName(className);
        Student student = (Student) c.newInstance();


        for (String n : key) {
            try {


                if ("name".equals(n)) {
                    Field field = c.getDeclaredField(n);
                    field.setAccessible(true);
                    field.set(student, p.getProperty(n));
                } else if ("age".equals(n)) {
                    Field field = c.getDeclaredField(n);
                    field.setAccessible(true);
                    field.set(student, Integer.valueOf(p.getProperty(n)));
                } else if ("sex".equals(n)) {
                    Field field = c.getDeclaredField(n);
                    field.setAccessible(true);
                    field.set(student, p.getProperty(n));
                } else if("className".equals(n)){
                        continue;
                }

            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();

            }
        }
        System.out.println(student);
    }
}
