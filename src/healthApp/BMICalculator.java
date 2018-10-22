package healthApp;

/**
 * BMICalculator Class
 *@author Gabe Walsh
 */
public class BMICalculator {
    /**
     * getBMI
     * BMI calulated using height in inches and weight in pounds
     *
     * @param height
     * @param weight
     * @return
     */
    public static double getBMI(double height, double weight){
        return (weight * 703) / (height * height);
    }
}