package day07_test;

public class Test2 {
    /*1. 比较str1和str2内容是否相等,比较str1和str3内容是否相等
    2. 忽略大小写比较str1和str3内容是否相等
    3. 测试str1字符串是否以"He"前缀开头,测试str1字符串是否以"abc"前缀开头
    4. 测试str1字符串是否以"o"后缀结尾,测试str1字符串是否以"l"后缀结尾*/

    public static void main(String[] args) {

        String s1="hello";
        String s2=new String("hello");
        String s3="Hello";
        System.out.println("str1和str2内容是否相等:"+s1.equals(s2));
        System.out.println("str1和str3内容是否相等:"+s1.equals(s3));
        System.out.println("忽略大小写比较str1和str3内容是否相等:"+s1.equalsIgnoreCase(s3));
        System.out.println("测试str1字符串是否以He前缀开头"+s1.startsWith("He"));
        System.out.println("测试str1字符串是否以abc前缀开头"+s1.startsWith("abc"));
        System.out.println("测试str1字符串是否以o后缀结尾"+s1.endsWith("o"));
        System.out.println("测试str1字符串是否以l后缀结尾"+s1.endsWith("l"));

    }
}
