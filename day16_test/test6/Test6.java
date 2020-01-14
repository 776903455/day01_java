package day16_test.test6;

public class Test6 {
    public static void main(String[] args) {
        /*. 在下面的代码中，请分别使用Lambda的标准格式及省略格式
        调用 invokeDirect 方法，打印输出： 导演拍电 影啦!
         */

        invokeDirect(()->{
            System.out.println("导演拍电影了");
        });


        invokeDirect(()-> System.out.println("导演拍电影了"));


    }

    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
