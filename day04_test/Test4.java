package day04_test;

public class Test4 {
    /*
    * 1. 定义getChar方法,参数为(int num),返回值char类型
    * 2. 在getChar方法中,将传入的参数num转成char类型变量ch
    * 3. 在getChar方法中判断chs是否是小写字母.如果是返回ch
    * 4. 在getChar方法中判断chs是否是大写字母.如果是返回ch
    * 5. 在getChar方法中判断chs是否是数字字符.如果是返回ch
    * 6. 其他情况返回' '
    * 7. 在main方法中调用getChar方法,传入一个数字.使用aChar变量接收getChar方法的返回值
    * 8. 输出aChar变量 */
    public static void main(String[] args) {

        int num=48;
       char aChar= getChar(num);
        System.out.println(aChar);

    }

    private static char getChar(int num) {
        char ch=(char) num;
            if(ch>=48&&ch<=57){
                return  ch;
            }else if(ch>=65&&ch<=90){
                return  ch;
            }else if(ch>=97&&ch<=122){
                return ch;
            }else {
                ch=' ';
                return ch;

            }

    }
}
