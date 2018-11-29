package Project;

import employee.Employee;

import java.util.List;
import java.util.Random;
import java.util.LinkedList;
import java.util.List;


public class RandomEmployeeAndCompanyGenerator {
    String[] firstName = {
            "Darrick",
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
    String[] lastName = {
            "Huttenback",
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
     * Salaryed employee generator
     * @param numberOSalaryedEmployees
     * @return
     */
    public static List<Employee> generateEmployees() {
        String[] firstName = {"Darrick", "Troy", "Lianne", "Fidela", "Doris", "Chantell", "Ashlee", "Marylou", "Lurlene", "Elke", "Al", "Masako", "Janelle", "Jenice", "Jadwiga", "Ann", "Liz", "Lucilla", "Joan", "Danielle "};
        String[] lastName = {"Huttenback", "Castillo", "Benabou", "Kee", "Kenward", "Ramey", "Pulido", "Lage", "Middle", "O'marley", "Ogletree", "Herrin", "Clare", "Isola", "Cesar", "Davy", "Good", "Diller", "Grabbe", "Vela-estrada"};
        Random rand = new Random();
        List<Employee> listOfEmployees = new LinkedList<>();
    /*public SalaryedEmployee salaryedEmployeeGenerator(int numberOSalaryedEmployees ){
       for (int i = 0; i >= numberOSalaryedEmployees; i++) {
           SalaryedEmployee salaryedEmployee1 = new SalaryedEmployee("holder",
                   "holder",
                   9999,
                   9,
                   9,
                   99,
                   999,
                   999);
       }
       returnsalaryedEmployee1 ;

   }*/
    /**
     * Executive employee generator
      * @param numberOExutiveEmployees
     * @return
     */

    /*public ExcutiveEmployee excutiveEmployeeGenerator(int numberOExutiveEmployees ) {

        for (int i = 0; i >= numberOfHourlyEmployees; i++) {
            ExcutiveEmployee excutiveEmployee1 = new ExcutiveEmployee("holder",
                    "holder",
                    9999,
                    9,
                    9,
                    99,
                    999,
                    999,
                    99);
        }
        return excutiveEmployee1;
    }
*/
    /**
     * hourly employee generator
     */
   /* public HourlyEmployee randomHourly(int numberOfHourlyEmployees) {
        for (int i = 0; i >= numberOfHourlyEmployees; i++) {
            HourlyEmployee hourlyEmployee1 = new HourlyEmployee("holder",
                "holder",
                9999,
                9,
                9,
                99,
                999,
                99,
                99);
        }
        return hourlyEmployee1;*/


}


