package day14_test1.test6;

public class Test6 {
    /*1.写一个方法实现获取字符串某个索引上的字符的功能
    2.写一个测试方法调用上面写的方法,使用thows方式进行处理异常,
    并在main方法中调用这个测试方法
    3.再写一个测试方法调用上面写的方法,使用try...catch方式进行处理异常,
    并在main方法中调用这个测试方法 */
    public static void main(String[] args) throws Exception {
        String str = "asdasd";
        /* char c = testThrows(str, 5);*/
        char c = testTryCatch(str, 5);
        System.out.println(c);


    }

    public static void charAt(String str, int index) throws Exception {
        char c = 0;

        if (str==null) {
            throw new Exception("字符串不能为null");
        } else if ("".equals(str)) {
            throw new Exception("字符串不能为空");
        }else if (index < 0 || index > str.length() - 1){
            throw new Exception("小老弟，怎么肥四，你索引越界了");
        }
        else {
            c = str.charAt(index);
        }

    }


    public static void testThrows(String str, int index) throws Exception {
       charAt(str, index);
    }

    public static char testTryCatch(String str, int index){
        try {
            charAt(str, index);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return str.charAt(index);
    }
}
