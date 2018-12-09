package Project;


import employee.Employee;

import java.time.LocalDate;
import java.time.Period;

public class SalaryedEmployee extends Employee {
    private double salary;



    public SalaryedEmployee(
            String fName, String Lname, int birthYear, int birthMonth, int birthDay, double height, double weight, double salary) {
        super(fName, Lname, birthYear, birthMonth, birthDay, height, weight);
        this.setSalary(salary);
    }
    public  int age() {
        return Period.between(getDob(), LocalDate.now()).getYears();

    }

    @Override
    public double getAnnualWage() {
        return getSalary();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}
