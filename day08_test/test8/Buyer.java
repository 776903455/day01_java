package day08_test.test8;

public class Buyer extends AdminStaff {
    public Buyer(String id, String name) {
        super(id, name);
    }

    public Buyer() {
    }

    @Override
    void work() {
        System.out.println("工号为"+getId()+"的采购专员 "+getName()+" 在采购音频设备");
    }
}
