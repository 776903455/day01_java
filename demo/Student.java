package demo;

public class Student  implements  Comparable{
    private String name;
    private int age;
    private double score;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student=(Student)o;
        int num=(int)(this.getScore()-student.getScore());
        return num;
    }
}
