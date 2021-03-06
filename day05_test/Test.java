package day05_test;

public class Test {

    /*1. 一个类与它的对象之间是什么关系？
            类是对象的模板，对象是类的实体
    2. 如何定义一个类，由哪些部分组成，各个部分的作用是什么？
            由两部分组成：一是成员变量--描述对象的属性，二是成员方法--描述对象的行为
    3. 如何创建一个对象，如何使用该对象？
            // 创建对象格式:  数据类型 变量名 = new 数据类型();   
            // 对象使用方式: 变量名.成员变量  变量名.成员方法(
    4. 局部变量和成员变量的区别？
            在类中的位置不同 
            成员变量：类中，方法外  
            局部变量：方法中或者方法声明上(形式参数)    作用范围不一样  成员变量：类中  
            局部变量：方法中  初始化值的不同 
            成员变量：有默认值  
            局部变量：没有默认值。    在内存中的位置不同 
            成员变量：堆内存  
            局部变量：栈内存  生命周期不同 
            成员变量：随着对象的创建而存在，随着对象的消失而消失  
            局部变量：随着方法的调用而存在，随着方法的调用完毕而消

    5. 构造方法和成员方法的区别？

        A:格式区别
           构造方法和类名相同，并且没有返回类型，也没有返回值。
           普通成员方法可以任意起名，必须有返回类型，可以没有返回值。
     B:作用区别
            构造方法用于创建对象，并进行初始化值。
            普通成员方法是用于完成特定功能的。

     C:调用区别
            构造方法是在创建对象时被调用的，一个对象建立，只调用一次相应构造函数
            普通成员方法是由创建好的对象调用，可以调用多次

    6. 请简述封装原则

        1.将不需要对外提供的内容都隐藏起来。
        2.成员变量private，提供对应的getXxx()/setXxx()方

    */
}
