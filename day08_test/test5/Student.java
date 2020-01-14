package day08_test.test5;

public class Student extends Person {

    private  int score;

    public Student(){}
    public Student(int score) {
        this.score = score;

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void exam(){
        System.out.println(getName()+"考了："+score+"分");
    }
}
