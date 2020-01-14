package day04_test1;

public class Test10 {
    /*有一个编程比赛,有5个评委给选手打分.取消最高分和最低分后的平均分就是这个
    选手的最后得分,这5个评委的 评分为:{99, 100, 98, 97, 96};*/

    public static void main(String[] args) {

        int[] arr={99,100,98,97,96};
        int sum=0;
        int max=getMax(arr);
        int min=getMin(arr);

        for(int x=0;x<arr.length;x++){

            sum+=arr[x];
        }

        int avg=(sum-min-max)/(arr.length-2);
        System.out.println("最终得分："+avg);


    }

    public static int getMin(int[] arr){
        int min=0;
        for(int i=1;i<arr.length;i++){
            if(arr[min]>arr[i]){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
    }
        System.out.println(arr[0]);
        return arr[min];
}

    public static  int getMax(int[] arr){
        int max=0;
        for(int j=1;j<arr.length;j++){
        if(arr[max]<arr[j]) {
            int temp = arr[max];
            arr[max] = arr[j];
            arr[j] = temp;
        }
    }
        System.out.println(arr[max]);
        return arr[max];
    }

}
