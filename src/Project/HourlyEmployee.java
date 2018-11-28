package Project;

import employee.Employee;

public class HourlyEmployee extends Employee {
    double rate;
    double hours;

    public HourlyEmployee(
            String fName,
            String Lname,
            int birthYear,
            int birthMonth,
            int birthDay,
            double height,
            double weight,
            double rate,
            double hours
    ) {
        super(fName, Lname, birthYear, birthMonth, birthDay, height, weight);
        setHours(hours);
        setRate(rate);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
