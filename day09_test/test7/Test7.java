package day09_test.test7;

public class Test7 {
    /*模拟公司给员工发工资*/
    public static void main(String[] args) {
        Employee manager=new Manager("张小亮",9000);
         Employee coder=new Coder("李小亮",5000);
        Company company =new Company(1000000);
        company.paySalary(manager);
        company.paySalary(coder);


    }

}
