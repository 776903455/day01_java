package day10_demo.demo07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo7 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream().forEach(System.out::println);

        Stream<String> stream = list.stream()
                .filter(s -> {
//                    System.out.println("过滤姓张的");
                    return s.startsWith("张");
                })
                .filter(s -> {
//                    System.out.println("过滤长度不等于三的");
                    return s.length()==3;
                });
        List<String> list2 = stream.collect(Collectors.toList());
//        list2.stream().forEach(System.out::println);
//            for(String s:list2){
//                System.out.println(s);
//            }


       /* User[] user={new User(18,"张三"),
                    new User(28,"李四"),
                    new User(20,"王五")}*/;

   /*     Comparator<User> comparator= new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        };

        Arrays.sort(user,comparator);
        for(User user1:user){
            System.out.println(user1);
        }*/


       /* Arrays.sort(user,(User u1,User u2)->u1.getAge()-u2.getAge());

        for(User user1:user){
            System.out.println(user1);
        }*/
    }
}
