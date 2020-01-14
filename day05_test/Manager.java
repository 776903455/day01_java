package day05_test;

public class Manager {
    private String name;
    private int mId;
    private double salary;

    public Manager(){}
    public Manager(String name, int mId, double salary) {
        this.name = name;
        this.mId = mId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  void intro(){
        System.out.println("经理姓名："+name);
        System.out.println("工号:"+mId);
    }

    public void showSalary(){
        System.out.println("基本工资为"+salary+",奖金为"+salary*0.2);
    }

    public void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
