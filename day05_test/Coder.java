package day05_test;

public class Coder {
    private String name;
    private String cId;
    private double salary;

        public Coder(){}
    public Coder(String name, String cId, double salary) {
        this.name = name;
        this.cId = cId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  void intro(){
        System.out.println("员工姓名："+name);
        System.out.println("工号:"+cId);
    }

    public void showSalary(){
        System.out.println("基本工资为"+salary+",奖金无");
    }

    public void work(){
        System.out.println("正在努力写代码...");
    }
}
