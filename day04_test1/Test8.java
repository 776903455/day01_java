package day04_test1;

public class Test8 {
    /*
    * 选择题答案评分 5道单项选择题，标准答案为 ：【ADBCD】
    * 四名同学答案分别为：
    * 小明：【DCBAD】
    * 小红：【ADBCD】
    * 小黄：【ADBCA】
    * 小强：【ABCDD】
    * 给这4名同学评分,答对一道题给2分 */
    public static void main(String[] args) {
        String[] str={"A","D","B","C","D"};
        String[] ming={"D","C","B","A","D"};
        String[] hong={"A","D","B","C","D"};
        String[] huang={"A","D","B","C","A"};
        String[] qiang={"A","B","C","D","D"};
        int score=0;

        for(int i=0;i<str.length;i++){
            if(str[i]==ming[i]){
                score+=2;
            }
            if(i==str.length-1){
                System.out.println("小明的分数为："+score);
                score=0;
            }
        }

        for(int i=0;i<str.length;i++){
            if(str[i]==hong[i]){
                score+=2;
            }
            if(i==str.length-1){
                System.out.println("小红的分数为："+score);
                score=0;
            }
        }

        for(int i=0;i<str.length;i++){
            if(str[i]==huang[i]){
                score+=2;
            }
            if(i==str.length-1){
                System.out.println("小黄的分数为："+score);
                score=0;
            }
        }

        for(int i=0;i<str.length;i++){
            if(str[i]==qiang[i]){
                score+=2;
            }
            if(i==str.length-1){
                System.out.println("小强的分数为："+score);
                score=0;
            }
        }
    }
}
