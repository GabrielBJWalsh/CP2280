package Project;

import employee.Employee;

import java.util.Random;
import java.time.LocalDate;

/**
 * an employee generator class to generate list of employees
 */

public class RandomEmployeeAndCompanyGenerator {
    private static String[] firstName = {"Darrick",
            "Troy",
            "Lianne",
            "Fidela",
            "Doris",
            "Chantell",
            "Ashlee",
            "Marylou",
            "Lurlene",
            "Elke",
            "Al",
            "Masako",
            "Janelle",
            "Jenice",
            "Jadwiga",
            "Ann",
            "Liz",
            "Lucilla",
            "Joan",
            "Danielle "
    };
    private static String[] lastName = {"Huttenback",
            "Castillo",
            "Benabou",
            "Kee",
            "Kenward",
            "Ramey",
            "Pulido",
            "Lage",
            "Middle",
            "O'marley",
            "Ogletree",
            "Herrin",
            "Clare",
            "Isola",
            "Cesar",
            "Davy",
            "Good",
            "Diller",
            "Grabbe",
            "Vela-estrada"};

    /**
     * salaryed Employee Generator
     *
     * @return
     */

    public static SalaryedEmployee generateSalaryedEmployee() {


        Random rand = new Random();


        //Randomized variables to be used
        int year = (int) Math.round(LocalDate.now().getYear() - 40 + (15 * rand.nextGaussian()));
        int day = rand.nextInt(28) + 1;
        int month = rand.nextInt(12) + 1;
        int height = rand.nextInt(76) + 1;
        int weight = rand.nextInt(150) + 110;
        int salary = rand.nextInt(600000) + 15000;

        SalaryedEmployee sal = new SalaryedEmployee(getFirstName(),
                getLastName(),
                year,
                month,
                day,
                height,
                weight,
                salary);


        return sal;
    }

    /**
     * an hourly Employee generator
     *
     * @return
     */
    public static HourlyEmployee generateHourlyEmployees() {

        Random rand = new Random();


        //Randomized variables to be used
        int year = (int) Math.round(LocalDate.now().getYear() - 40 + (15 * rand.nextGaussian()));
        int day = rand.nextInt(28) + 1;
        int month = rand.nextInt(12) + 1;
        int height = rand.nextInt(76) + 1;
        int weight = rand.nextInt(150) + 110;

        int hourlyWage = rand.nextInt(50) + 10;
        int hoursPerWeek = rand.nextInt(20) + 20;

        HourlyEmployee hourly = new HourlyEmployee(getFirstName(),
                getLastName(),
                year,
                month,
                day,
                height,
                weight,
                hourlyWage,
                hoursPerWeek);


        return hourly;
    }

    /**
     * Exctive employee generator
     *
     * @return
     */
    public static ExcutiveEmployee generateExcutiveEmployees() {

        Random rand = new Random();

        //Randomized variables to be used
        int year = (int) Math.round(LocalDate.now().getYear() - 40 + (15 * rand.nextGaussian()));
        int day = rand.nextInt(28) + 1;
        int month = rand.nextInt(12) + 1;
        int height = rand.nextInt(76) + 1;
        int weight = rand.nextInt(150) + 110;

        int salary = rand.nextInt(100000) + 50000;
        int bonus = rand.nextInt(10) + 1;

        ExcutiveEmployee executive = new ExcutiveEmployee(getFirstName(),
                getLastName(),
                year,
                month,
                day,
                height,
                weight,
                salary,
                bonus);


        return executive;
    }

    /**
     * a method that creates a random company full of random employees
     *
     * @param size
     * @return
     */
    public static Employee[] generateCompany(int size) {
        Random rand = new Random();
        Employee[] company = new Employee[size];
        for (int i = 0; i < size; i++) {
            int randomNumber = rand.nextInt(100);
            if (randomNumber > 0 & randomNumber < 40) {
                company[i] = generateSalaryedEmployee();
            }
            if (randomNumber > 41 & randomNumber < 89) {
                company[i] = generateHourlyEmployees();
            }
            if (randomNumber > 90 & randomNumber < 100) {
                company[i] = generateExcutiveEmployees();
            }
        }


        return company;
    }

    /**
     * a method to get the a random frist name from a list
     * @return
     */
    public static String getFirstName() {

        Random rand = new Random();
        String fname = firstName[rand.nextInt(firstName.length)];
        return fname;
    }

    /**
     * a method to get the a random last name from a list
     * @return
     */
    public static String getLastName() {

        Random rand = new Random();
        String lname = lastName[rand.nextInt(lastName.length)];
        return lname;
    }
}


