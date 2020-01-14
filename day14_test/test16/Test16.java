package day14_test.test16;

import java.util.*;

public class Test16 {
    /*通过键盘录入五个人的姓名,每当录入一个人的姓名,随机给出一个成绩0, 100.
    将姓名和成绩存储到Map集合中,姓名作为key,成绩作为value
    统计五个学生的总分,最高分,最低分,平均分,并将总分,最高分,最低分,平均分
    将结果输出到控制台格式为: 总分=xxx,最高分=xxx,最低分=xxx,平均分=xxx*/
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);

        Random random =new Random();
        for (int i = 0; i < 5; i++) {
            int score = random.nextInt(101);
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            String name = scanner.next();
            map.put(name,score);
        }
        System.out.println(map);

        int sum=0;
        int avg=0;
        int max=0;
        int min=0;

        Set<String> key = map.keySet();
        Iterator<String> iterator = key.iterator();
        while (iterator.hasNext()){
            max=map.get(iterator.next());
            min=map.get(iterator.next());
            break;
        }

        for (String s1:key){
            sum+=map.get(s1);
            if(max<map.get(s1)){
                max=map.get(s1);
            }
            if(min>map.get(s1)){
                min=map.get(s1);
            }
        }

       avg=sum/map.size();

        System.out.println("总分="+sum+","+"最高分="+max+","+"最低分="+min+","+"平均分="+avg);

    }
}
