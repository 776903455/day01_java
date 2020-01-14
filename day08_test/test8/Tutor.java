package day08_test.test8;

public class Tutor extends  Teacher {
    public Tutor(String id, String name) {
        super(id, name);
    }

    public Tutor() {
    }

    @Override
    void work() {
        System.out.println("工号为"+getId()+"助教 "+getName()+" 在帮助学生解决问题");
    }
}
