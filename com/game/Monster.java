package com.game;

import java.util.ArrayList;

public class Monster {
    private int monsterBlood;
    private String name;
    private int monsterHurt;
    private ArrayList<Skill> skillMonster;

    public Monster() {
    }

    public Monster(String name, int monsterHurt, ArrayList<Skill> skillMonster) {
        this.name = name;
        this.monsterHurt = monsterHurt;
        this.skillMonster = skillMonster;
    }

    public int getMonsterBlood() {
        return monsterBlood;
    }

    public void setMonsterBlood(int monsterBlood) {
        this.monsterBlood = monsterBlood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonsterHurt() {
        return monsterHurt;
    }

    public void setMonsterHurt(int monsterHurt) {
        this.monsterHurt = monsterHurt;
    }

    public ArrayList<Skill> getSkillMonster() {
        return skillMonster;
    }

    public void setSkillMonster(ArrayList<Skill> skillMonster) {
        this.skillMonster = skillMonster;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", monsterHurt=" + monsterHurt +
                ", skillMonster=" + skillMonster +
                '}';
    }


    public  void monsterAttack(){}
}
