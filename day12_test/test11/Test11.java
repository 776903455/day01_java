package day12_test.test11;

import java.util.Arrays;

public class Test11 {
    /*编写一个泛形方法名称为swap，实现指定位置数组元素的交换.
    数组和要交换的索引作为方法参数*/
    public static void main(String[] args) {
            System.out.println("Integer交换");
            Integer[] arr={1,5,8,4,6};
            swap(arr,2,4);
            System.out.println("String交换");
            String[] arr1={"你","好","java","再见"};
            swap(arr1,0,2);

    }

    public static <T> void swap(T[] t,int index,int index2){


        for (int i = 0; i <t.length ; i++) {

            T temp=t[index];
            t[index]=t[index2];
            t[index2]=temp;
            break;
        }
        System.out.println(Arrays.toString(t));
        }
    }

