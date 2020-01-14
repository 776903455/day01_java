package day04_test1;

public class Test1 {
/*1.定义一个int类型数组arr,元素为{12, 33, 25, 6, 16}
2.定义int类型变量min,用于保存最小值,min的初始化值为数组的第一个元素
3.遍历arr数组,获取数组的每个元素
4.判断遍历到的元素是否小于min
5.如果遍历到的元素小于min,将遍历到的元素赋值给min 6.按要求输出最小值 */

    public static void main(String[] args) {

        int[] arr1={12,33,25,6,16};
         getMin(arr1);

    }

    private static void getMin(int[] arr1) {

        int min=0;
        for(int i=1;i<arr1.length;i++){
            if(arr1[min]>arr1[i]){
                int temp=arr1[min];
                arr1[min]=arr1[i];
                arr1[i]=arr1[min];
            }

        }

        System.out.println(arr1[min]);
    }
}
