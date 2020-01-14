package day10_test.test5;

public class Player {


  /*  public void FightAble(){


    }*/

    public FightAble select(String str){


        if("法术角色".equals(str)){
            return new Magic();
        }else if("武力角色".equals(str)){
            return  new Soldier();
        }else {
            return null;
        }

      /*  switch (str){
            case "1":
                System.out.println("选择：法力角色");
                FightAble fightAble=new Magic();
                fightAble.commonFight();
                fightAble.specialFight();
                break;

            case "2":
                System.out.println("选择：武力角色");
                FightAble fightAble1=new Soldier();
                fightAble1.commonFight();
                fightAble1.specialFight();
                break;*/
        }

    }


