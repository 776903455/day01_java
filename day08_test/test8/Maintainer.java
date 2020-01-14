package day08_test.test8;

public class Maintainer extends AdminStaff {
    public Maintainer(String id, String name) {
        super(id, name);
    }

    public Maintainer() {
    }

    @Override
    void work() {
        System.out.println("工号为"+getId()+"的维护专员 "+getName()+" 在解决不能共享屏幕问题");
    }
}
