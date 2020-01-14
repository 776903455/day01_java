package day07_test;

public class Test3 {
    /*1. 获取str字符串的长度
    2. 获取str字符串索引为2的char值
    3. 获取字符串"o"第一次出现在该字符串内的索引
    4. 截取字符串str,从索引6开始到结束
    5. 截取字符串str,从索引2开始到索引7(不包含所以7)*/

    public static void main(String[] args) {
        String s="helloworld你好";
        System.out.println("获取str字符串的长度"+s.length());
        char ch=s.charAt(2);
        System.out.println("获取str字符串索引为2的char值"+ch);
        int frist=s.indexOf("o");
        System.out.println("获取字符串\"o\"第一次出现在该字符串内的索引:"+frist);
        String str1=s.substring(6);
        System.out.println("截取字符串str,从索引6开始到结束"+str1);
        String str2=s.substring(2,7);
        System.out.println("截取字符串str,从索引2开始到索引7(不包含所以7)"+str2);

    }
}
