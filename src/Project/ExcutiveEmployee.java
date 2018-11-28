package Project;

import employee.Employee;

public class ExcutiveEmployee extends SalaryedEmployee {
    public ExcutiveEmployee(
            String fName, String Lname, int birthYear, int birthMonth, int birthDay,double height, double weight,int salary){

        super(fName,Lname,birthYear, birthMonth,birthDay,height,weight,salary);
    }
}
