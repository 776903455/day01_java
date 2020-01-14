package com.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Role {
    private static  int id;
    private static int blood;
    private static String name;
    private  static int roleHurt;
    private static ArrayList<Skill> skillArrayList;
    private static ArrayList<Weapon> weaponArrayList;
    private static ArrayList<Armour> armourArrayList;

    private static int roleBaseHurt;
    private static int roleBaseProtect;

    public Role() {
    }

    public Role(int id, int blood, String name, ArrayList<Skill> skillArrayList, ArrayList<Weapon> weaponArrayList, ArrayList<Armour> armourArrayList) {
        this.id = id;
        this.blood = blood;
        this.name = name;
        this.skillArrayList = skillArrayList;
        this.weaponArrayList = weaponArrayList;
        this.armourArrayList = armourArrayList;
    }

    public int getRoleHurt() {
        return roleHurt;
    }

    public void setRoleHurt(int roleHurt) {
        this.roleHurt = roleHurt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Skill> getSkillArrayList() {
        return skillArrayList;
    }

    public void setSkillArrayList(ArrayList<Skill> skillArrayList) {
        this.skillArrayList = skillArrayList;
    }

    public ArrayList<Weapon> getWeaponArrayList() {
        return weaponArrayList;
    }

    public void setWeaponArrayList(ArrayList<Weapon> weaponArrayList) {
        this.weaponArrayList = weaponArrayList;
    }

    public ArrayList<Armour> getArmourArrayList() {
        return armourArrayList;
    }

    public void setArmourArrayList(ArrayList<Armour> armourArrayList) {
        this.armourArrayList = armourArrayList;
    }


    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", blood=" + blood +
                ", name='" + name + '\'' +
                ", skillArrayList=" + skillArrayList +
                ", weaponArrayList=" + weaponArrayList +
                ", armourArrayList=" + armourArrayList +
                '}';
    }


    /*人物面板*/
    public static void roleInfo(){

        roleBaseHurt= roleHurt+weaponArrayList.get(0).getWeaponHurt();
        roleBaseProtect=armourArrayList.get(0).getPortect();
        System.out.println("人物面板:");
        System.out.println("基础属性:姓名:"+name+"   血量:"+blood+"   攻击:"+roleBaseHurt+"   防御"+roleBaseProtect);
        System.out.println("武器:");
        for(Weapon weapon:weaponArrayList){
            System.out.print(weapon);
        }
        System.out.println();
        System.out.println("防具:");
        for(Armour armour:armourArrayList){
            System.out.print(armour);
        }
        System.out.println();
        System.out.println("人物技能::");
        for(Skill skill:skillArrayList){
            System.out.print(skill);
        }

        System.out.println("按1返回:");
        Scanner scanner=new Scanner(System.in);
        int num1 = scanner.nextInt();
        if(num1==1){
            MainJM.JM();
        }


    }

    /*使用技能*/
    public static  void userSkill(Monster monster){

        System.out.println("战斗载入中...");
        System.out.println("你遇到了"+monster.getName());
        System.out.println("选择你要进行的操作:");
        System.out.println("1:技能攻击");
        System.out.println("2:逃跑");
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();

        while (true) {
            switch (num) {
                case 1:
                    System.out.println("请选择技能:");

                    for (int i = 0; i < skillArrayList.size(); i++) {
                        System.out.print(i + ": " + skillArrayList.get(i).getName() + "    ");
                    }

                    int selectSkill = scanner.nextInt();
                    if (selectSkill == 0) {
                        System.out.println("你使用了" +
                                skillArrayList.get(selectSkill).getName() + "对" + monster.getName() +
                                "造成了" + (roleBaseHurt + skillArrayList.get(selectSkill).getHurt()) + "点伤害");
                        System.out.println(monster.getName() + "还剩" + (monster.getMonsterBlood() - (roleBaseHurt + skillArrayList.get(selectSkill).getHurt())) + "点生命值");
                        monster.setMonsterBlood(monster.getMonsterBlood() - (roleBaseHurt + skillArrayList.get(selectSkill).getHurt()));


                    } else if (selectSkill == 1) {
                        System.out.println("你使用了" +
                                skillArrayList.get(selectSkill).getName() + "对" + monster.getName() +
                                "造成了" + (roleBaseHurt + skillArrayList.get(selectSkill).getHurt()) + "点伤害");
                        System.out.println(monster.getName() + "还剩" + (monster.getMonsterBlood() - (roleBaseHurt + skillArrayList.get(selectSkill).getHurt())) + "点生命值");
                        monster.setMonsterBlood(monster.getMonsterBlood() - (roleBaseHurt + skillArrayList.get(selectSkill).getHurt()));

                    } else if (selectSkill == 2) {
                        System.out.println("你使用了" +
                                skillArrayList.get(selectSkill).getName() + "对" + monster.getName() +
                                "造成了" + (roleBaseHurt + skillArrayList.get(selectSkill).getHurt()) + "点伤害");
                        System.out.println(monster.getName() + "还剩" + (monster.getMonsterBlood() - (roleBaseHurt + skillArrayList.get(selectSkill).getHurt())) + "点生命值");
                        monster.setMonsterBlood(monster.getMonsterBlood() - (roleBaseHurt + skillArrayList.get(selectSkill).getHurt()));


                    } else {
                        MainJM.JM();
                    }

                    break;
                case 2:
                    MainJM.JM();
                    break;

            }

            if(monster.getMonsterBlood()<=0){
                System.out.println("战斗胜利..");
                MainJM.JM();
            }
        }

    }

}
