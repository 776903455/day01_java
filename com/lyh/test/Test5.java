package com.lyh.test;

public class Test5 {
    /* 1. 定义类 Test5
       2. 定义 main方法
       3. 定义方法printNum,在main方法中调用printNum方法
       4. printNum方法中,定义ﬂoat变量f1赋值12345.01
       5. printNum方法中,定义ﬂoat变量f2赋值12345.00
       6. printNum方法中,定义ﬂoat 变量 var1 ,
       使用三元运算符赋值,当f1大于等于f2时,赋值12456 ,
       当f1小于f2 赋值12456.02
       7. printNum方法中,定义ﬂoat 变量 var2 , 保存var1 与1024的和.
       8. printNum方法中,同时输出var1,var2的值. */

    public static void main(String[] args) {
        printNum();
    }

    private static void printNum() {
        float f1=12345.01f;
        float f2=12345.00f;

        float var1=(float) (f1>f2?12456:12456.02);
        float var2=var1+1024;
        System.out.println("var1="+var1+"--"+"var2="+var2);


    }
}
