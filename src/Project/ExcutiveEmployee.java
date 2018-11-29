package Project;

import employee.Employee;

public class ExcutiveEmployee extends SalaryedEmployee {
    int bouns;

    public ExcutiveEmployee(
            String fName,
            String Lname,
            int birthYear,
            int birthMonth,
            int birthDay,
            double height,
            double weight,
            int salary,
            int bonus) {
        super(fName, Lname, birthYear, birthMonth, birthDay, height, weight, salary);
        setBouns(bouns);
    }

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        if (bouns >= 0) {
            this.bouns = bouns;
        }
    }
}
