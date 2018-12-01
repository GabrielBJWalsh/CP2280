package Project;

import java.util.List;
import java.util.Random;
import java.util.LinkedList;
import java.time.LocalDate;

/**
 * an employee generator class to generate list of employees
 */

public class RandomEmployeeAndCompanyGenerator {
    /**
     * salaryed Employee Generator
     * @return List of Salyaryed employees
     */

    public static List<SalaryedEmployee> generateSalaryedEmployees() {
        String[] firstName = {"Darrick",
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
                "Danielle "};
        String[] lastName = {"Huttenback",
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
        Random rand = new Random();
        List<SalaryedEmployee> listOfSalryedEmployees = new LinkedList<>();
        for (int i = 0; i < firstName.length; i++) {
            for (int j = 0; j < lastName.length; j++) {
                //Randomized variables to be used
                int year = (int) Math.round(LocalDate.now().getYear() - 40 + (15 * rand.nextGaussian()));
                int day = rand.nextInt(28) + 1;
                int month = rand.nextInt(12) + 1;
                int height = rand.nextInt(76) + 1;
                int weight = rand.nextInt(150) + 110;
                int salary = rand.nextInt(600000) + 15000;
                SalaryedEmployee sal = new SalaryedEmployee(firstName[i],
                        lastName[j],
                        year,
                        month,
                        day,
                        height,
                        weight,
                        salary);
                listOfSalryedEmployees.add(sal);


            }
        }
        return listOfSalryedEmployees;
    }

    /**
     * an hourly Employee generator
     * @return
     */
    public static List<HourlyEmployee> generateHourlyEmployees() {
        String[] firstName = {"Darrick",
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
                "Danielle "};
        String[] lastName = {"Huttenback",
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
        Random rand = new Random();
        List<HourlyEmployee> listOfHourlyEmployees = new LinkedList<>();
        for (int i = 0; i < firstName.length; i++) {
            for (int j = 0; j < lastName.length; j++) {
                //Randomized variables to be used
                int year = (int) Math.round(LocalDate.now().getYear() - 40 + (15 * rand.nextGaussian()));
                int day = rand.nextInt(28) + 1;
                int month = rand.nextInt(12) + 1;
                int height = rand.nextInt(76) + 1;
                int weight = rand.nextInt(150) + 110;

                int hourlyWage = rand.nextInt(50) + 10;
                int hoursPerWeek = rand.nextInt(20) + 20;

                HourlyEmployee hourly = new HourlyEmployee(firstName[i],
                        lastName[j],
                        year,
                        month,
                        day,
                        height,
                        weight,
                        hourlyWage,hoursPerWeek);
                listOfHourlyEmployees.add(hourly);


            }
        }
        return listOfHourlyEmployees;
    }

    /**
     * Exctive employee generator
     * @return
     */
    public static List<ExcutiveEmployee> generateExcutiveEmployees() {
        String[] firstName = {"Darrick",
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
                "Danielle "};
        String[] lastName = {"Huttenback",
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
        Random rand = new Random();
        List<ExcutiveEmployee> listOfExcutiveEmployees = new LinkedList<>();
        for (int i = 0; i < firstName.length; i++) {
            for (int j = 0; j < lastName.length; j++) {
                //Randomized variables to be used
                int year = (int) Math.round(LocalDate.now().getYear() - 40 + (15 * rand.nextGaussian()));
                int day = rand.nextInt(28) + 1;
                int month = rand.nextInt(12) + 1;
                int height = rand.nextInt(76) + 1;
                int weight = rand.nextInt(150) + 110;

                int salary = rand.nextInt(100000) + 50000;
                int bonus = rand.nextInt(10) + 1;

                ExcutiveEmployee excutive = new ExcutiveEmployee(firstName[i],
                        lastName[j],
                        year,
                        month,
                        day,
                        height,
                        weight,
                        salary,
                        bonus);
                listOfExcutiveEmployees.add(excutive);


            }
        }
        return listOfExcutiveEmployees;
    }

}


