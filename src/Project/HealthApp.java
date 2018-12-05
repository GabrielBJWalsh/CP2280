package Project;

import healthApp.BMICalculator;
import healthApp.HeartRateCalulator;
import healthApp.Person;

import java.util.Scanner;


public class HealthApp {
    public static void main(String[] args) {
        // set up scanner
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("WELCOME:\n\n please provide patients first name ");
        String firstName = consoleInput.next();
        System.out.println("plesee provide patient last name");
        String lastName = consoleInput.next();
        System.out.println("please provide patient weight in pounds");
        double weight = consoleInput.nextDouble();
        System.out.println("please provide patient height in inches");
        double height = consoleInput.nextDouble();
        System.out.println("plesee provide patient birth year");
        int year = consoleInput.nextInt();
        System.out.println("plesee provide the month the patient was born ");
        int month = consoleInput.nextInt();
        System.out.println("plesee provide the day of the month the patient was born ");
        int day = consoleInput.nextInt();
        Person patient = new Person(firstName, lastName, year, month, day, height, weight);
        do {
            System.out.println("Press C to get the Patients MAX heart rate");
            System.out.println("Press B to get the Patients BMI");
            // note to self look for split like  method to clean up code below
           String userInput = consoleInput.next();

            if (userInput.equals("C") || userInput.equals("c")) {
                System.out.printf("Max Target Heart Rate:%d\\", HeartRateCalulator.maxHeartRate(patient.age()));
            }
            else if (userInput.equals("B") || userInput.equals("b")) {
                System.out.printf("Patient BMI is:%.2f\\", BMICalculator.getBMI(patient.getHeight(), patient.getWeight()));

                System.out.printf("Person Information:%s %s/n%s/n%f/n%f",
                        patient.getFirstName(),
                        patient.getLastName(),
                        patient.getDob(),
                        patient.getHeight(),
                        patient.getWeight());
            }
            else if (userInput.equals("R") || userInput.equals("r")) {
                System.out.printf("Max Target Heart Rate:%.1f/n MINIMUM target heart Rate:%.1f",
                        HeartRateCalulator.targetMax(patient.age()), HeartRateCalulator.targetMin(patient.age()));
            }

            //System.out.println("\nBMI VALUES:\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\: 30 or greater");
        } while (!(consoleInput.next().equals("X") || consoleInput.next().equals("x")));
    }
}
