package day20_test.test8.game;

import java.util.ArrayList;
import java.util.Scanner;

public class MainJM {

  /*  public static void main(String[] args) {
        JM();

    }*/

    public static  void JM(){
        ArrayList<Weapon> weaponArrayList=new ArrayList<>();
        ArrayList<Armour> armourArrayList=new ArrayList<>();
        ArrayList<Skill> skillArrayList=new ArrayList<>();
        ArrayList<Skill> skillMonster=new ArrayList<>();
        Skill skill=new Skill("降龙十八掌",50);
        Skill skill1=new Skill("蛤蟆功",30);
        Skill skill2=new Skill("打狗棒法",40);
        Skill skill3=new Skill("水溅跃",10);
        Weapon weapon=new Weapon("倚天剑",100);
        Weapon weapon1=new Weapon("屠龙刀",100);
        Armour armour=new Armour("锁子甲",50);
        Armour armour1=new Armour("逆鳞铠",150);

        weaponArrayList.add(weapon1);
        weaponArrayList.add(weapon);
        armourArrayList.add(armour);
        armourArrayList.add(armour1);
        skillArrayList.add(skill);
        skillArrayList.add(skill1);
        skillArrayList.add(skill2);
        skillMonster.add(skill3);
        Role role=new Role();
        role.setId(1);
        role.setBlood(100);
        role.setName("龙傲天");
        role.setRoleHurt(50);
        role.setArmourArrayList(armourArrayList);
        role.setSkillArrayList(skillArrayList);
        role.setWeaponArrayList(weaponArrayList);



        Monster monster=new Monster();

        monster.setMonsterBlood(1000);
        monster.setName("鲤鱼王");
        monster.setMonsterHurt(30);
        monster.setSkillMonster(skillMonster);


   /*     System.out.println("role"+role);
        System.out.println("monster"+monster);*/


        Scanner scanner =new Scanner(System.in);
        System.out.println("1:人物界面");
        System.out.println("2:战斗");
        System.out.println("3:逃跑");
        int select=scanner.nextInt();
        switch (select){
            case 1:
                Role.roleInfo();
                break;
            case 2:
                Role.userSkill(monster);
                break;
            case 3:
                System.exit(0);
        }
    }

}
