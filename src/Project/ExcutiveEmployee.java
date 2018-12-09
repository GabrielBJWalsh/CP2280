package Project;

import java.time.LocalDate;
import java.time.Period;

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
            double salary,
            double bonus) {
        super(fName, Lname, birthYear, birthMonth, birthDay, height, weight, salary);
        setBouns(bouns);
    }

    @Override
    public double getAnnualWage() {
        return getSalary()+getBouns();
    }

    public int age() {
        return Period.between(getDob(), LocalDate.now()).getYears();

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
