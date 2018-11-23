package ShapesWithFriends;

/*public class Rectangle extends Shape {

    @Override
    public double getArea() {
        return 0;
    }
}
*/
public class Rectangle extends Shape{
    double length;
    double witdth;

    public Rectangle(double length, double witdth) {
        setLength(length);
        setWitdth(witdth);

    }

    /**
     * a basicl method to return the area of a rectangle
     * @return
     */
    @Override
    public double getArea(){
        return (getLength()*getWitdth());
    }
    @Override
    public String getDescription(){
        return "i am a Rect angle please fix me";
    }
    public double calulatePermeter(){
        return 2*(getWitdth()+getLength());
    }


    /***
     * a get method for the length of a rectangle
     * @return double
     */
    public double getLength() {
        return length;
    }

    /**
     * a set method for the length of a rectangle
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * a get method for the witdth of a rectangle
     * @return
     */
    public double getWitdth() {
        return witdth;
    }

    /**
     * a set method for the witdth of a rectangle
     * @param witdth
     */
    public void setWitdth(double witdth) {
        this.witdth = witdth;
    }



}
