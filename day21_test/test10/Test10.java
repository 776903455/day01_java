package day21_test.test10;


public class Test10 {
    /*一、 创建新项目，按以下要求定义，并使用注解：   
    1. 请定义一个最简单的注解@MyAnno1 1) 不需要任何属性。
    2) 此注解只能修饰“类”和接口
    3) 此注解要出现在源码和字节码中
    4) 定义测试类：Test1，并使用此注解修饰*/

    @MyAnnol
    class  Test{}

   /* 2. 请定义注解@MyAnno2：
    1) 包含一个String类型的属性“type”，并且定义默认值“java”。
    2) 此注解只能修饰“字段”。
    3) 此注解只需要能够在源码中使用。
    4) 定义测试类：Test2，随意定义一个成员属性，并使用此注解；*/

    class  Test2{
        @MyAnno2
        private String bookname;
    }

  /*  3. 请定义注解@MyAnno3：
    1) 包含一个String类型的属性“type”，不定义默认值。
    2) 包含一个int[]数组类型的属性“intArr”，不定义默认值。
    3) 此注解只能修饰“方法”。
    4) 此注解要出现在源码和字节码中。
    5) 定义测试类：Test3，随意定义一个成员方法，并使用此注解*/
    class  Test3{

        @MyAnno3(name = "萨达",intarr = {12,13,46})
        public void fun1(){

        }
  }

}
