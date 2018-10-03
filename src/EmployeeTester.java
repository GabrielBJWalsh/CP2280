/**
 * tester class for Employee
 */
public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee = new Employee("David", "Parsons", 3900.00);
        Employee employee2 = new Employee("Dave", "par", 3000.00);
        employee.printEmp(employee);
        employee.yearly(employee);
        employee2.printEmp(employee2);
        employee2.yearly(employee2);

        System.out.println("\n\nyay Dave Par got a 10% raise");

        employee2.giveRaise(employee2);
        employee2.printEmp(employee2);
        employee2.yearly(employee2);

    }


}

