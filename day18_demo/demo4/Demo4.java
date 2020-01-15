package day18_demo.demo4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Demo4 {

    public static void main(String[] args) throws IOException {
        FileReader fd=null;
        try {
           fd=new FileReader("d:\\test\\score.txt");
            Properties p=new Properties();
            p.load(fd);
            Set<String> set = p.stringPropertyNames();
           /* Person person=new Person();*/
            Class c=Person.class;
            Person person=(Person) c.newInstance();

            Field name = c.getDeclaredField("name");
            Field age = c.getDeclaredField("age");
            Field sex = c.getDeclaredField("sex");
            name.setAccessible(true);
            age.setAccessible(true);
            sex.setAccessible(true);
            set.stream().forEach(n->{


                if("name".equals(n)){
                    try {
                        name.set(person,p.getProperty(n));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }else if("age".equals(n)){
                    try {
                        age.set(person,Integer.valueOf(p.getProperty(n)));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }else {
                    try {
                        sex.set(person,p.getProperty(n));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            });

            System.out.println(person);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } finally {
            fd.close();
        }
    }
}
