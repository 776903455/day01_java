package day04_test1;

public class Test2 {
    /*1.使用静态初始化int类型数组arr,内容为{11, 22, 33, 44, 55}
    2.使用for循环遍历arr数组
    3.在for循环中打印每个元素*/

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }
}
