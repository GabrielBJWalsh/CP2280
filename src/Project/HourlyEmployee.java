package Project;

import employee.Employee;

public class HourlyEmployee extends Employee {
    double rate;
    double hours;

    public HourlyEmployee(
            String fName, String Lname, int birthYear, int birthMonth, int birthDay, double height, double weight
    ) {

        super(fName, Lname, birthYear, birthMonth, birthDay, height, weight);
    }
}
