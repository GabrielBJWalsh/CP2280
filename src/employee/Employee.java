package employee;

import healthApp.Person;


/**
 * Employee  class
 *
 * @author Gabe Walsh
 */

public abstract class Employee extends Person {
    public Employee(String fName, String Lname, int birthYear, int birthMonth, int birthDay, double height, double weight) {

        super(fName, Lname, birthYear, birthMonth, birthDay, height, weight);
    }

    public abstract double getAnnualWage();


}
//  public double salary;

