package day08_test.test8;

public class Lecturer extends Teacher {

    public Lecturer(String id, String name) {
        super(id, name);
    }

    public Lecturer() {
    }

    @Override
    void work() {
        System.out.println("工号为"+getId()+"的讲师 "+getName()+" 在讲课");
    }
}
