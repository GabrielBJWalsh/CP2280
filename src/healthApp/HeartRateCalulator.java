package healthApp;
/**
 * a class used to calulate a patients heart rate
 * @author Gabe Walsh
 */
public class HeartRateCalulator {
    /**
     * calulates the max heart rate of a patient
     * @param age
     * @return int
     */
    public static int maxHeartRate(int age){
        return 220-age;
    }

    /**
     * heart reate calulator that gets the maximum target heart rate of a patient
     * @return double
     */
    public static double targetMax(int patientAge){
        int pureMax = maxHeartRate(patientAge);
        double maxPrecent =.85;
        return pureMax*maxPrecent;
    }

    /**
     * calculates the minimum target heart rate for a patient
     * @return double
     */

    public static double targetMin(int patientAge){
        int pureMin = maxHeartRate(patientAge);
        double minPrecent =.50;
        return pureMin*minPrecent;

    }
}
