package day11_test.test7;

public class Test7 {
    /*测试以下2个操作所消耗的事件*/
    public static void main(String[] args) {
        String s1="lyh";
        StringBuffer sb=new StringBuffer("lyh");
        test1(s1);
        test2(sb);
    }

    private static void test1(String s) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s+="nb";
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
    private static void test2(StringBuffer stringBuffer) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("nb");
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
