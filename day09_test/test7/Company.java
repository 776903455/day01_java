package day09_test.test7;

public class Company implements Money{

    private  double sumMoney;

    public Company(double sumMoney) {
        this.sumMoney = sumMoney;
    }

    public Company() {
    }


    @Override
    public void paySalary(Employee employee) {
        System.out.println("给"+employee.getName()+"发工资"+employee.getSalary()+",公司还剩余："+(sumMoney-employee.getSalary()));
        sumMoney=sumMoney-employee.getSalary();
    }
}
