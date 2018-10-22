package employee;
/**
 * Employee  class
 *
 * @author Gabe Walsh
 */

public class Employee {
    public String Fname;
    public String Lname;
    public double salary;

    /**
     * constuctor method to create employee
     *
     * @param Fname
     * @param Lname
     * @param salary
     */
    public Employee(String Fname, String Lname, double salary) {
        setFname(Fname);
        setLname(Lname);
        setSalary(salary);
    }

    /**
     * geter method for employee First name
     *
     * @return String
     */

    public String getFname() {
        return Fname;
    }

    /**
     * setter method for employee First name
     *
     * @param fname
     */
    public void setFname(String fname) {
        Fname = fname;
    }

    /**
     * geter method for employee Last name
     *
     * @return
     */

    public String getLname() {
        return Lname;
    }

    /**
     * setter method for employee last name
     *
     * @param lname
     */

    public void setLname(String lname) {
        Lname = lname;
    }

    /**
     * geter method for employee employee salary
     *
     * @return
     */
    public double getSalary() {
        return salary;
    }

    /**
     * setter method for employee salary
     *
     * @param salary
     * @return
     */

    public double setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.00;
        }
        return this.salary;
    }

    /**
     * print method for employee
     */
    public void printEmp(Employee emp) {
        System.out.printf("\nname: %s %s\nMothly Salary: %.2f\n",
                emp.getFname(),
                emp.getLname(),
                emp.getSalary()
        );

    }

    /**
     * a method to give an employee a 10% raise
     *
     * @param emp
     */
    public void giveRaise(Employee emp) {
        double sal = getSalary();
        double setSal = sal * 1.1;
        setSalary(setSal);

    }

    /**
     * a method to print the yearly salary of an employee
     *
     * @param emp
     */
    public void yearly(Employee emp) {
        System.out.printf("Yearly salary: %.2f", emp.getSalary() * 12);

    }

}
