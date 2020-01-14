package day07_test;

public class Test1 {
    /*请使用任意3种构造方法创建3个字符串,并输出字符串对象的内容 */
    public static void main(String[] args) {
      /*一*/
        String s1=new String("asda");
        /*二*/
        char[] ch={'a','b','c'};
        String s2=new String(ch);
        System.out.println(s2);
        /*三*/
        byte[] bys={100,87,53};
        String s3=new String(bys);
        System.out.println("s3="+s3);
    }
}
