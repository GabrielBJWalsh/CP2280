package hugeInteger;

public class HugeTester {
    public static void main(String[] args) {
    HugeInteger number = new HugeInteger("999");
    HugeInteger number2 = new HugeInteger("1");

    String num = new String(number.add(number2));
        System.out.println(num);
    }


    }