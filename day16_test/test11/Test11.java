package day16_test.test11;


import day15_test.test6.MyRunable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test11 {
    /*某公司组织年会，会议入场时有两个入口，在入场时每位员工都能获取一张双色球彩票，
    假设公司有100个员工， 利用多线程模拟年会入场过程，并分别统计每个入口入场的人数,
    以及每个员工拿到的彩票的号码。线程运行后打印 格式如下：
     */
    public static void main(String[] args) {

        MyRunnable m1=new MyRunnable("前门");
        MyRunnable m2=new MyRunnable("后门");
        m1.start();
        m2.start();

    }
}
