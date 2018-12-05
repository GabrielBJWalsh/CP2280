package Project;

import employee.Employee;

public class HourlyEmployee extends Employee {
    private double dollorsPerHour;
    private double hours;
    private double avgHours;

    public HourlyEmployee(
            String fName,
            String Lname,
            int birthYear,
            int birthMonth,
            int birthDay,
            double height,
            double weight,
            double dollorsPerHour,
            double hours
    ) {
        super(fName, Lname, birthYear, birthMonth, birthDay, height, weight);
        setHours(hours);
        setDollorsPerHour(dollorsPerHour);
    }

    public double getDollorsPerHour() {
        return dollorsPerHour;
    }

    public void setDollorsPerHour(double dollorsPerHour) {
        if (dollorsPerHour >= 0) {
            this.dollorsPerHour = dollorsPerHour;
        }
    }

    public double getHours() {

        return hours;
    }

    public double getAvgHours() {
        return avgHours;
    }

    public void setAvgHours(double avgHours) {
        if (avgHours >= 0) {
            this.avgHours = avgHours;
        }
    }

    public void setHours(double hours) {
        if (hours >= 0) {
            this.hours = hours;
        }
    }

    public double getPay(double hours, double dollorsPerHour) {
        return hours * dollorsPerHour;
    }

}
