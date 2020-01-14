package day14_test.test9;

public class Department {
    private String name;
    private double salary;

    public Department(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static Department addSalary(Department department,Double addSalary){
        department.setSalary(department.getSalary()+addSalary);
        return department;
    }
}
