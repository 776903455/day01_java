package day10_test.test5;

import demo.Play;

import java.util.Scanner;

public class Test5 {
    /*模拟玩家选择角色。*/

    public static void main(String[] args) {

       /* Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要选择的角色：");
        System.out.println("1：法术角色");
        System.out.println("2：武力角色");
        String str= scanner.next();
        Player player=new Player();
        player.select(str);*/

        Player player=new Player();
        String str="法术角色";
        System.out.println("选择："+str);
        FightAble fs = player.select(str);
        fs.specialFight();
        fs.commonFight();

        System.out.println("-------------");
        String str1="武力角色";
        System.out.println("选择："+str1);
        FightAble wl = player.select(str1);
        wl.specialFight();
        wl.commonFight();
}
}
