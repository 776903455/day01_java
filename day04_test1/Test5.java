package day04_test1;

public class Test5 {

    /*1. 在main方法中定义int类型数组arr,保存学生的考试成绩[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]
    2. 定义getAvg方法,参数列表为(int[] arr),返回值类型为int. getAvg方法的功能是计算参数arr数组的平均值 并返回
    3. 在getAvg方法中定义求和变量sum
    4. 在getAvg方法中使用for循环遍历arr数组
    5. 将arr数组的元素值添加到sum中
    6. 计算平均分, 平均分 = 总分 / 人数
    7. 返回平均分
    8. 在main方法中调用getAvg方法参数为arr数组,计算arr数组的平均分.定义int变量avg保存getAvg方法的 返回值
    9. 在main方法中定义计数器变量count
    10. 在main方法中遍历arr数组
    11. 如果arr数组的元素大于平均分,计数器count+1
    12. 按格式要求输出count变*/
    public static void main(String[] args) {

        int[] arr={95, 92, 75, 56, 98, 71, 80, 58, 91, 91};

        int avg=getAvg(arr);
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>avg){
                count++;
            }
        }
        System.out.println("高于平均分"+avg+"的个数有"+count+"个");
    }

    private static int getAvg(int[] arr) {
           int sum=0;
           for(int i=0;i<arr.length;i++){
               sum+=arr[i];
           }
           int avg=sum/arr.length;

          return avg;
    }
}
