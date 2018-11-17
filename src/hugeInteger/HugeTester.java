package hugeInteger;

public class HugeTester {
    public static void main(String[] args) {
    HugeInteger number = new HugeInteger("1000");
    HugeInteger number2 = new HugeInteger("1000");

        System.out.println(number.IsGreaterOrEqual(number2));
        System.out.println(number.isGreater(number2));
        System.out.println(number.isLesstThenEqual(number2));
        System.out.println(number.islessThen(number2));
    }


    }