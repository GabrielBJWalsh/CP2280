package Project;

import employee.Employee;

import java.time.LocalDate;
import java.time.Period;

public class HourlyEmployee extends Employee {
    private double dollorsPerHour;
    private double hours;
    private double avgHoursPerWeek;

    public HourlyEmployee(
            String fName,
            String Lname,
            int birthYear,
            int birthMonth,
            int birthDay,
            double height,
            double weight,
            double dollorsPerHour,
            double hoursPerWeek
    ) {
        super(fName, Lname, birthYear, birthMonth, birthDay, height, weight);
        setAvgHoursPerWeek(hoursPerWeek);
        setDollorsPerHour(dollorsPerHour);
    }
    public  int age() {
        return Period.between(getDob(), LocalDate.now()).getYears();

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

    public double getAvgHoursPerWeek() {
        return avgHoursPerWeek;
    }

    public void setAvgHoursPerWeek(double avgHoursPerWeek) {
        if (avgHoursPerWeek >= 0) {
            this.avgHoursPerWeek = avgHoursPerWeek;
        }
    }

    public void setHours(double hours) {
        if (hours >= 0) {
            this.hours = hours;
        }
    }
    public double getAnnualWage(){
     return (avgHoursPerWeek*dollorsPerHour)*52;
    }

   /* public static double getPay() {
        double avgHoursPerWeek = this.avgHoursPerWeek;

        return avgHoursPerWeek * dollorsPerHour;
        }*/
}


