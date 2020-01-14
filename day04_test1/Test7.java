package day04_test1;

public class Test7 {
    /*定义equals方法，比较2个数组内容是否完全一致。 */

    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        int[] arr1={1,2,3,4,3,2,1};
        boolean flag=equals(arr,arr1);
        System.out.println(flag);
    }

    private static boolean equals(int[] arr, int[] arr1) {

        boolean flag=false;
        int count=0;
        if(arr.length==arr1.length){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==arr1[i]){
                    count++;
                }
            }
            if(count==arr.length){
                flag=true;
            }
        }
        return flag;
    }
}
