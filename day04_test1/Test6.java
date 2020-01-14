package day04_test1;

public class Test6 {

    /*判断数组中的元素是否对称. */

    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};

        boolean flag=true;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-1-i]){
                flag=false;
                break;
            }
        }

        System.out.println(flag);

    }
}
