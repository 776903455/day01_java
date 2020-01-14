package day07_test;

public class Test4 {
    /*1. 将str字符串转换为字符数组,并遍历字符数组,输出每个字符
    2. 将str字符串转换为小写
    3. 将str字符串转换为大写
    4. 将str字符串中的字符'o'替换成'6'
    5. 将str字符串中的字符串"ll"替换成"LL" */
    public static void main(String[] args) {

        String str="HelloWorld";
        char[] ch =str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println("将str字符串中的字符'o'替换成'6'"+str.replace("0","6"));
        System.out.println("将str字符串中的字符串ll替换成LL"+str.replace("ll","LL"));


    }
}
