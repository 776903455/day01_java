package day21_demo.demo1;

import org.junit.*;

public class Demo1 {


    @BeforeClass
    public static  void beforeclass(){
        System.out.println("beforeclass");
    }
    @AfterClass
    public static  void afterclass(){
        System.out.println("afterclass");
    }

    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @Test
    public void fun1(){
        System.out.println("我是fun1");
    }

    @Test
    public void fun2(){
        System.out.println("我是fun2");
    }
}
