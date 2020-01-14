package day04_test1;

public class Test4 {
    /*1. 在main方法中定义int[] arr保存一组双色球号码{1, 8, 10, 12, 18, 28, 12}
    2. 定义printBall方法,参数为int[] array,返回值为void
    3. 在printBall方法中输出:"您的双色球号码为:"
    4. 在printBall方法中遍历array数组,不换行打印每个元素
    5. 在main方法中调用printBall方法,参数为arr*/
    public static void main(String[] args) {
        int[] arr={1, 8, 10, 12, 18, 28, 12};
        printBall(arr);
    }

    private static void printBall(int[] arr) {
        System.out.println("你的双色球号码为：");
        for (int i=0;i<arr.length;i++){

            System.out.print(arr[i]+",");

        }
    }
}
