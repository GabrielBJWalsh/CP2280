/**
 * tester class for empyloee
 *
 */
public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee = new Employee("David", "Parsons", 3900.00);
        Employee employee2 = new Employee("Dave", "par", 3000.00);
        System.out.println("heres an employee:");

        System.out.printf("name: %s %s\nMothly Salary: %.2f\n",
                employee.getFname(),
                employee.getLname(),
                employee.getSalary()
        );
        System.out.printf("yearly Salary: %.2f\n",
                employee.getSalary()*12);

        System.out.println("here is another employee:");
        System.out.printf("name: %s %s\nMonthlySalary: %.2f\n",
                employee2.getFname(),
                employee2.getLname(),
                employee2.getSalary()
        );
        System.out.printf("yearly Salary: %.2f\n",
                employee.getSalary()*12);
        employee.setSalary(employee.getSalary()*.1);
        employee2.setSalary(employee2.getSalary()*.1);
        System.out.println("yay everyone got a 10% raise");
        double emp = employee.getSalary();
        double pme = employee.setSalary(emp)*.1;
        System.out.println(pme);
        System.out.printf("name: %s %s\nMothly Salary: %.2f\n",
                employee.getFname(),
                employee.getLname(),
                employee.getSalary()
        );
        System.out.printf("yearly Salary: %.2f\n",
                employee.getSalary()*12);

    }




}
