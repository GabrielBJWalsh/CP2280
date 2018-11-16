package hugeInteger;

public class HugeTester {
    public static void main(String[] args) {
    HugeInteger number = new HugeInteger("1000");
    HugeInteger number2 = new HugeInteger("1");
    String sub = number.subtract(number2);
    String num = number.add(number2);

        System.out.println(sub);

    }


    }