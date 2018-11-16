package hugeInteger;


public class HugeInteger {
    public char[] hugeInt;

    /**
     * constructor for huge integer
     *
     * @param input
     */
    public HugeInteger(java.lang.String input) {
        this.hugeInt = toZero();

        parse(input);

    }

    /**
     * parse
     * a metod to populate a char array with the value of a string
     * that has numbers
     *
     * @param input
     */
    public void parse(String input) {

        if (input.length() <= 41) {
            int index = this.hugeInt.length - 1;
            for (int i = input.length() - 1; i >= 0; i--) {
                if (Character.isDigit(input.charAt(i))) {
                    this.hugeInt[index] = input.charAt(i);
                    index--;
                }
            }

        }
    }

    /**
     * add method adds two huge ints together
     *
     * @param number2
     * @return String
     */
    public String add(HugeInteger number2) {
        char[] sum = new char[40];
        int carry = 0;
        char[] num1 = this.hugeInt;
        char[] num2 = number2.getHugeInt();
        for (int i = num1.length - 1; i >= 0; i--) {
            int holdSum = carry + Character.getNumericValue(num1[i]) + Character.getNumericValue(num2[i]);
            carry = holdSum / 10 % 10;
            sum[i] = Character.forDigit(holdSum % 10, 10);
        }
        String someString = new String(sum);
        HugeInteger someInteger = new HugeInteger(someString);
        return someInteger.printString();
    }

    /**
     * subtract method
     * @param number2
     * @return
     */
    public String subtract(HugeInteger number2) {
        char[] sum = new char[40];
        int carry = 0;
        char[] num1 = this.hugeInt;
        char[] num2 = number2.getHugeInt();
        for (int i = num1.length - 1; i >= 0; i--) {
            int holdSum = carry + Character.getNumericValue(num1[i]) - Character.getNumericValue(num2[i]);
            carry = holdSum / 10 % 10;
            sum[i] = Character.forDigit(holdSum % 10, 10);
        }
        String someString = new String(sum);
        HugeInteger someInteger = new HugeInteger(someString);
        return someInteger.printString();
    }


    /**
     * @return String
     */
    /**
     * method used to count the leading zeros before the actual number is placed
     *
     * @return
     */
    public int zeroCounter() {
        int counter = 0;

        for (int i = 0; i < hugeInt.length; i++) {
            if (hugeInt[i] == '0') {
                counter++;
            } else {
                break;
            }

        }
        return counter;
    }

    /**
     * method that prints the hugeInt without any  leading 0 s
     * @return
     */
    public String printString() {
        boolean checker = false;
        int index = 0;
        char[] printbleInt = new char[40 - zeroCounter()];

        for (int i = 0; i < hugeInt.length; i++) {
            if (hugeInt[i] != '0') {
                checker = true;
            }
            if (checker) {
                printbleInt[index] = hugeInt[i];
                index++;
            }

        }

        String print = new String(printbleInt);


        return print;

    }

    public char[] toZero() {
        hugeInt = new char[40];
        for (int i = 0; i < hugeInt.length; i++) {
            hugeInt[i] = '0';
        }
        return hugeInt;
    }


    public char[] getHugeInt() {
        return hugeInt;
    }

}




/*
 * methods done:
 * set to zero
 * methods needed:
 * isZero
 * add
 * subtract
 * toString
 * isGreater
 * isLessThen
 * IsGreaterOrEqual
 * isLessThenOrEquel
 */


