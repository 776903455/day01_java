package day14_test1.test7;

public class Student {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) throws NoScoreException {
        this.name = name;
        this.score = score;
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws NoScoreException {
        if(score<0){
            throw new NoScoreException("分数不能为负数");
        }
        this.score = score;
    }


}
