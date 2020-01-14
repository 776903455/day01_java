package day10_demo.demo07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo77 {
    public static void main(String[] args) {

        List<User> list=new ArrayList<>();
        list.add(new User(15,"张三"));
        list.add(new User(35,"李四"));
        list.add(new User(25,"王五"));
        list.add(new User(45,"赵六"));
        list.add(new User(35,"赵七都"));
        list.add(new User(55,"赵八嗄"));

        Stream<User> stream = list.stream()
                .filter(user -> {
                    return user.getAge()>20;
                })
                .filter(user -> {
                   return  user.getName().startsWith("赵");
                })
                .filter(user -> {
                    return user.getName().length()==3;
                });


        List<User> list1 = stream.collect(Collectors.toList());
        list1.stream().forEach(System.out::println);
        long count = list1.stream().count();
        System.out.println(count);

        System.out.println("-----------");

    }
}
