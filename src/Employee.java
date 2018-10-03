/**
 * Emplyee class
 *  f name string
 *  l name string
 *  salary duble
 *  create a constroctor
 */

public class Employee {
    public String Fname;
    public String Lname;
    public double salary;
    public Employee(String Fname,String Lname,double salary){
        setFname(Fname);
        setLname(Lname);
        setSalary(salary);
    }
    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        if(salary>0){
            this.salary = salary;
    }   else{this.salary=0.00;}
    return this.salary;
    }
}
// make a print emp method
// make a yearly sal method
//make a rais method
