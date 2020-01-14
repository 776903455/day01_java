package day04_test.demo;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        int[] newarr=new int[arr.length];

      /*
        第一种
        for (int i =arr.length-1; i >=0 ; i--) {
          newarr[i]=arr[arr.length-1-i];
        }*/

     /*  第二种
      for (int i = 0; i <arr.length/2 ; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }*/

      /*  第三种
      for (int start=0,end=arr.length-1; start<end ; start++,end--) {

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }*/

       Object[] newarrs=reverses(arr);

        for (int i = 0; i < newarrs.length; i++) {
            System.out.println(newarrs[i]);
        }
    }

    private static Object[] reverses(int[] arr) {

        ArrayList list =new ArrayList();
        for (int i = 0; i < arr.length; i++) {

            list.add(arr[arr.length-1-i]);
        }
        System.out.println(list);
        return list.toArray();
    }
}
