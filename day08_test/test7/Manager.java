package day08_test.test7;

public class Manager extends Employees {

    public Manager() {
    }

    public Manager(String empNo, String name, double salary) {
        super(empNo, name, salary);
    }

    @Override
    void eat() {
        System.out.println("工号为："+getEmpNo()+","+"姓名为："+getName()+","+"工资为："+getSalary()+"的经理在吃鱼");
    }

    @Override
    void work() {
        System.out.println("工号为："+getEmpNo()+","+"姓名为："+getName()+","+"工资为："+getSalary()+"的经理在工作，管理其他人");

    }
}
