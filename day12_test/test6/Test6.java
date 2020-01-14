package day12_test.test6;

import java.util.ArrayList;

public class Test6 {
//    自定义泛型方法function.可以传入任意类型数据t.在这个方法中打印传入的t.并使用这个泛型方法。
public static void main(String[] args) {

    function(1);
    function("123");
    function(2);
    function("str");
}

/*    for (int i = 0; i <10 ; i++) {
//        调用function传入数字
        *//*function(1+i);*//*
//        调用function传入字符串
        function("str"+i);
    }
}*/
public static <T> void function(T t){
    System.out.println(t);

}
}
