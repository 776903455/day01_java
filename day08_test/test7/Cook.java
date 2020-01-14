package day08_test.test7;

public class Cook extends Employees {

    public Cook() {
    }

    public Cook(String empNo, String name, double salary) {
        super(empNo, name, salary);
    }

    @Override
    void eat() {
        System.out.println("工号为："+getEmpNo()+","+"姓名为："+getName()+","+"工资为："+getSalary()+"的厨师在吃肉");
    }

    @Override
    void work() {
        System.out.println("工号为："+getEmpNo()+","+"姓名为："+getName()+","+"工资为："+getSalary()+"的厨师在工作，炒菜");
    }
}
