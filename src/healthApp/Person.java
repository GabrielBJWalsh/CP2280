package healthApp;

import java.time.Period;
import java.time.LocalDate;

/**
 * patient class
 * gives a persons name and dob/age
 *
 * @author Gabe walsh 20141337
 */
public class Person {


    public String lastName;
    public String firstName;
    public LocalDate dob;
    public double height;
    public double weight;


    /**
     * Person constructor class
     *
     * @param firstName
     * @param lastName
     * @param birthYear
     * @param birthMonth
     * @param birthDay
     */
    public Person(
            String lastName, String firstName, int birthYear, int birthMonth, int birthDay, double height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setDob(birthYear, birthMonth, birthDay);
        setHeight(height);
        setWeight(weight);
    }

    /**
     * a method to get the age of a patient based of Date of Birth
     *
     * @return int
     */
    public int age() {
        return Period.between(getDob(), LocalDate.now()).getYears();
        //LocalDate.now().getYear() - dob.getYear();
    }


    //SETTERS

    /**
     * Setter method for Person height
     *
     * @param height
     */

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    /**
     * Setter method for Person weight
     *
     * @param weight
     */

    public void setWeight(double weight) {
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }
    }

    /**
     * setter method for Person Date of Birth
     *
     * @param year
     * @param month
     * @param day
     */

    public void setDob(int year, int month, int day) {
        if (year > LocalDate.now().getYear()) {
            System.out.println("Year can not be greater then current year");
        } else if (year < 1) {
            System.out.println("you are not a dinosour ");
        }
        if (month > 12 || month < 1) {
            month = 1;
        }
        if (day > 31 || day < 1) {
            day = 1;

        }

        this.dob = LocalDate.of(year, month, day);
    }

    /**
     * setter method for Patecint last name
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * setter method for Patecint last name
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //GETTERS

    /**
     * getter method for patient last name
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * getter method for patient frist name
     *
     * @return
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * getter method for patient Date of Birth
     *
     * @return
     */
    public LocalDate getDob() {
        return dob;
    }

    /**
     * Getter method for patient HGetter method for Person height
     *
     * @return int
     */
    public double getHeight() {
        return height;
    }

    /**
     * Getter method for Person weight
     *
     * @return int
     */
    public double getWeight() {
        return weight;
    }
    //System.out.println(LocalDate.now().getYear()- LocalDate.of(2015,12,25).getYear());


}