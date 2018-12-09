package Project;

import employee.Employee;
import healthApp.BMICalculator;
import healthApp.HeartRateCalulator;


import java.util.Random;
import java.util.Scanner;

public class EmployeeManagementApplcation {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE THING\n");
        System.out.println("Would you like to [A] check Employee insurance information");
        System.out.println("Would you like to [B] Generate an example company");
        System.out.println("Would you like to [X] close the Application");
        String checker = input.next();
        do {
            if (checker.equals("A") || checker.equals("a")) {
                double annualSalary = 0;
                double heartRate;

                System.out.println("Enter employee information");
                System.out.println("First Name:");
                String fName = input.next();
                System.out.println("Last Name:");
                String lName = input.next();
                System.out.println("Birth year:");
                int year = input.nextInt();
                System.out.println("Month born in:");
                int month = input.nextInt();
                System.out.println("Day of the month born on");
                int day = input.nextInt();
                System.out.println("How tall is the person(in inches)");
                double height = input.nextDouble();
                System.out.println("How much dose the person weigh?(pounds)");
                double weight = input.nextDouble();
                System.out.println("Heart Rate?");
                heartRate = input.nextDouble();
                System.out.println("Employee Type:[A]:Hourly\n[B]Salary\n[C]Executive");
                checker = input.next();

                if (checker.equals("A") || checker.equals("a")) {// HOURLY
                    System.out.println("Payrate?:");
                    double rate = input.nextDouble();
                    System.out.println("Avrage Hours per week?:");
                    double hours = input.nextDouble();
                    HourlyEmployee employee = new HourlyEmployee(fName,
                            lName,
                            year,
                            month,
                            day,
                            height,
                            weight,
                            rate,
                            hours);
                    annualSalary = (rate * hours) * 52;

                    System.out.printf("Calculated insurance rate:%f",
                            EmployeeHeathInsureaceCalculator.calculateInsureance(annualSalary,
                                    BMICalculator.getBMI(height, weight),
                                    heartRate,
                                    HeartRateCalulator.targetMax(employee.age())) / 12);
                    checker = "X";


                }
                if (checker.equals("B") || checker.equals("b")) {//SALARY
                    System.out.println("Salary?:");
                    int sal = input.nextInt();

                    SalaryedEmployee employee = new SalaryedEmployee(fName,
                            lName,
                            year,
                            month,
                            day,
                            height,
                            weight,
                            sal);
                    System.out.printf("Calculated monthly insurance rate:%.2f",
                            EmployeeHeathInsureaceCalculator.calculateInsureance(sal,
                                    BMICalculator.getBMI(height, weight),
                                    heartRate,
                                    HeartRateCalulator.targetMax(employee.age())) / 12);
                    checker = "X";
                }


                if (checker.equals("C") || checker.equals("c")) {//EXECUTIVE
                    System.out.println("Salary?:");
                    int sal = input.nextInt();
                    System.out.println("Bonus?:");
                    int bounus = input.nextInt();
                    ExcutiveEmployee employee = new ExcutiveEmployee(fName,
                            lName,
                            year,
                            month,
                            day,
                            height,
                            weight,
                            sal,
                            bounus);
                    System.out.printf("Calculated monthly insurance rate:%f",
                            EmployeeHeathInsureaceCalculator.calculateInsureance(sal,
                                    BMICalculator.getBMI(height, weight),
                                    heartRate,
                                    HeartRateCalulator.targetMax(employee.age())) / 12);
                    checker = "X";
                }


                //System.out.println("test working");

            }
            if (checker.equals("B") || checker.equals("b")) {
                System.out.println("Sample size?");
                Employee[] company = RandomEmployeeAndCompanyGenerator.generateCompany(input.nextInt());
                for (int i = 0; i < company.length; i++) {
                   // printEmployee(company[i]);
                    System.out.printf("\nEmployee name: %s %s" +
                                    "\nEmployee age: %s years" +
                                    "\nEmployee height: %.1fin" +
                                    "\nEmployee weight: %.1f lbs" +
                                    "\nEmployee annual wage: $ %.2f\n\n\n",
                             company[i].getFirstName(),
                            company[i].getLastName(),
                            company[i].age(),
                            company[i].getHeight(),
                            company[i].getWeight(),
                            company[i].getAnnualWage());
                    double heartRate = 30 + (220 - 30 + 1) * random.nextDouble();
                    System.out.printf("Heart rate: %.1f\n", heartRate);
                    System.out.printf("Monthly insurance premium: %.2f ",
                            EmployeeHeathInsureaceCalculator.calculateInsureance(company[i].getAnnualWage(),
                            BMICalculator.getBMI(company[i].getHeight(),company[i].getWeight()),
                            heartRate,
                            HeartRateCalulator.targetMax(company[i].age())) / 12);
                }

                checker = "X";
            }

        } while (!(checker.equals("X") || checker.equals("x")));

    }

    /**
     * a method to print employees
     * @param employee
     */
/*
    public static void printEmployee(Employee employee) {
        System.out.printf("\nEmployee name: %s %s" +
                        "\nEmployee age: %s years" +
                        "\nEmployee height: %.1fin" +
                        "\nEmployee weight: %.1f lbs" +
                        "\nEmployee annual wage: $ %.2f\n\n\n",
                employee.getFirstName(),
                employee.getLastName(),
                employee.age(),
                employee.getHeight(),
                employee.getWeight(),
                employee.getAnnualWage());
    }*/
}
