package Project;


import employee.Employee;

public class SalaryedEmployee extends Employee {
    int salary;
    public SalaryedEmployee(
            String fName, String Lname, int birthYear, int birthMonth, int birthDay, double height, double weight,int salary) {
        super(fName, Lname, birthYear, birthMonth, birthDay, height, weight);
        this.setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
