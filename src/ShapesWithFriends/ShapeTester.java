package ShapesWithFriends;
import java.util.Random;

public class ShapeTester {

    //Main class
    public static void main(String[] args) {
        System.out.println("Fun with Shapes .... and Friends!");

        for(int i=0; i<5; i++){
            printShapeDetails(getRandomShape());
        }
    }

    public static void printShapeDetails(Shape shape){
        System.out.printf("\nDescription: %s \nArea: %f",
                shape.getDescription(), shape.getArea());
    }

    public static Shape getRandomShape(){
        Random random = new Random();

        if(random.nextInt() % 2 == 0){
            return new Rectangle(random.nextInt(10),random.nextInt(10));
        } else {
            return new Circle(random.nextInt(10));
        }
    }


}