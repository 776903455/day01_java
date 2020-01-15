package day21_test.test1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calcuator {
   static Calcuator calcuator=null;
    @BeforeClass
    public static void test1(){
        calcuator =new Calcuator();
        System.out.println("创建了Calcuator对象");
    }

    @Test
    public  void add(){
        System.out.println(10+20);
    }

    @Test
    public   void  jian(){
        System.out.println(20-10);
    }
    @Test
    public  void chen(){
        System.out.println(10*20);
    }

    @Test
    public   void chu(){
        System.out.println(10/20);
    }


    @AfterClass
    public static void test2(){
        calcuator=null;
        System.out.println("清空Calcuator对象");
    }
}

