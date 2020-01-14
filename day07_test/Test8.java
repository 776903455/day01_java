package day07_test;

public class Test8 {
    /*有如下字符串:"javajﬁewjavajﬁowfjavagkljjava",定义方法统计出该字符串中"java"字符串的数量 */

    public static void main(String[] args) {

        String str="javajﬁewjavajﬁowfjavagkljjava";

        int start=0;
        int count =0;
        int index=0;
        while(true){
            index=str.indexOf("java",start);
            if(index!=-1){
                count++;
                start=index+5;
                if(start>str.length()){
                    break;
                }
            }

        }
        System.out.println("str中java的数量"+count);

    }
}
