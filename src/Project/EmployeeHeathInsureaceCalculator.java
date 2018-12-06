package Project;

public class EmployeeHeathInsureaceCalculator {
    private static final double BMI_OVER_25 = 1.75;
    private static double BMI_OVER_30 = 2.5;
    private static final double EXCEEDED_HEART_RATE_LIMIT = 1.5;

    public static double calculateInsureance(double salary,
                                             double bmi,
                                             double heartRate,
                                             double topHeartRate) {
        double insuranceRate = 0;
        insuranceRate += salary * .01;
        if (bmi > 30) {
            insuranceRate *= BMI_OVER_30;
        } else if (bmi > 25) {
            insuranceRate *= BMI_OVER_25;
        }
        if (heartRate > topHeartRate) {
            insuranceRate *= EXCEEDED_HEART_RATE_LIMIT;
        }
        return insuranceRate;
    }

}
