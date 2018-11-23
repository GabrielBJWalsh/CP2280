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

    public boolean isEqual(HugeInteger number) {

        if (this.zeroCounter() != number.zeroCounter()) {
            return false;
        }
        for (int i = 0; i < number.getHugeInt().length; i++) {
            if (Character.getNumericValue(this.getHugeInt()[i]) != Character.getNumericValue(number.getHugeInt()[i])) {
                return false;
            }
        }


        return true;
    }


    /**
     * a method to check if a huge int is less then the other
     *
     * @param number
     * @return
     */
    public boolean islessThen(HugeInteger number) {
        boolean less = false;

        if (this.zeroCounter() > number.zeroCounter()) {
            less = true;
        } else if (this.zeroCounter() == number.zeroCounter()) {
            for (int i = 0; i < number.getHugeInt().length; i++) {
                if (Character.getNumericValue(this.getHugeInt()[i]) < Character.getNumericValue(number.getHugeInt()[i])) {
                    less = true;
                    return less;
                } else if (Character.getNumericValue(this.getHugeInt()[i]) > Character.getNumericValue(number.getHugeInt()[i])) {
                    return false;
                }
            }
        }

        return less;
    }

    /**
     * a method that chekes if a hugeInt is less then or equal to another
     *
     * @param number
     * @return
     */
    public boolean isLesstThenEqual(HugeInteger number) {
        if (this.islessThen(number)) {
            return true;
        } else if (this.isEqual(number)) {
            return true;
        } else return false;
    }

    /**
     * a method to tell if one huge int is bigger then the other
     *
     * @param number
     * @return
     */

    public boolean isGreater(HugeInteger number) {
        boolean greater = false;

        if (this.zeroCounter() > number.zeroCounter()) {
            greater = true;
        } else if (this.zeroCounter() == number.zeroCounter()) {
            for (int i = 0; i < this.getHugeInt().length; i++) {
                if (Character.getNumericValue(this.getHugeInt()[i]) > Character.getNumericValue(number.getHugeInt()[i])) {
                    greater = true;
                    return greater;
                } else if (Character.getNumericValue(this.getHugeInt()[i]) < Character.getNumericValue(number.getHugeInt()[i])) {
                    return false;
                }
            }
        }

        return greater;
    }

    /**
     * a method that checks if a huge int is bigger or equal to another
     *
     * @param number
     * @return
     */
    public boolean IsGreaterOrEqual(HugeInteger number) {
        if (this.isGreater(number)) {
            return true;
        } else if (this.isEqual(number)) {
            return true;
        } else return false;
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
     *
     * @param number
     * @return
     */
    public String subtract(HugeInteger number) {
        char[] number1;
        char[] number2;
        if (this.zeroCounter() <= number.zeroCounter()) {
            char[] diffrence = new char[this.zeroCounter() - hugeInt.length];
        } else {
            char[] diffrence = new char[number.zeroCounter() - number.getHugeInt().length];
        }

        if (number.isGreater(this)) {
            number1 = this.getHugeInt();
            number2 = number.getHugeInt();
        } else {
            number2 = this.getHugeInt();
            number1 = number.getHugeInt();
        }
        for (int i = number1.length - 1; i >= 0; i--) {
            int temp = 0;
            if (number1[i] >= number2[i]) {
                temp = Character.getNumericValue(number1[i]) - Character.getNumericValue(number2[i]);
            } else {
                int j = i;
                while (j - 1 >= 0){
                    if(number1[j-1]=='0'){
                        number1[j-1]='9';
                        j--;
                    }
                    else{
                        number1[i]+=10;
                        j--;
                       //TODO

                    }
                }
            }
        }

        return this.printString();
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
     *
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
 * isZero
 * add
 * toString
 * isGreater
 * isLessThen
 * IsGreaterOrEqual
 * isLessThenOrEquel
 * methods needed:
 * subtract
 */


