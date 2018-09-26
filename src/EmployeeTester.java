/**
 * tester class for empyloee
 *
 */
public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee = new Employee("David", "Parsons", 3900.00);
        Employee employee2 = new Employee("Dave", "par", 3000.00);
        System.out.println("heres an employee");
        System.out.printf("name: %s %s\nSalary: %.2f",
                employee.getFname(),
                employee.getLname(),
                employee.getSalary()
        );
        System.out.println("here is another employee");
        System.out.printf("name: %s %s\nMonthlySalary: %.2f",
                employee2.getFname(),
                employee2.getLname(),
                employee2.getSalary()
        );
    }
}
