package ShapesWithFriends;
/**
 * Simple Circle class
 */
public class Circle extends Shape {

    private double radius;

    /**
     * Constructor that sets a circle by radius
     * @param radius
     */
    public Circle(double radius){
        //TODO what about negatives?
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }
}