package day04_test1;

public class Test3 {
    /*1. 定义数组int[] nums = {5,10,15}
    2. 创建一个int类型的新数组newArr，新数组的长度和nums数组长度相同
    3. 使用for循环遍历nums数组
    4. 在for循环中取出nums数组中的索引为i的元素,将索引为i的元素*2再赋值到新数组newArr对应的索引位 置
    5. 遍历输出nums数组中的元素
    6. 遍历输出新数组newArr中的所有元素 */

    public static void main(String[] args) {

        int[] nums={5,10,15};
        int[] newArr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newArr[i]=nums[i]*2;
            System.out.println(newArr[i]);
        }

    }
}
