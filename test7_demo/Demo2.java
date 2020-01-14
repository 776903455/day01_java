package test7_demo;

import org.junit.Test;

import java.util.Locale;

public class Demo2 {

    public static void main(String[] args) {
        String s1="abc";
        String s2="hello";
        String s5="abchello";
        String s4="abc"+"hello";
        String s3=s1+s2;


        System.out.println(s5==s3);
        System.out.println(s5==s4);
        System.out.println(s3==s4);
    }

    @Test
    public void test1(){
        String s5="abchaellao";
        System.out.println(s5.indexOf("a"));

        System.out.println();
    }
}
