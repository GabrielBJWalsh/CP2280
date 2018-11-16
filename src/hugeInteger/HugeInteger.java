package hugeInteger;


import sun.rmi.transport.proxy.CGIHandler;

public class HugeInteger {
    public char[] hugeInt;

    /**
     * constructor for huge integer
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
    public char[] add(HugeInteger number2){
        char[] sum = new char[40];
        int carry =0;
        char[] num1 = this.hugeInt;
        char[] num2 = number2.getHugeInt();
        for(int i = num1.length -1; i>=0;i--){
            int holdSum =carry +Character.getNumericValue(num1[i])+Character.getNumericValue(num2[i]);
            carry = holdSum /10 %10;
            sum[i]=Character.forDigit(holdSum%10,10);
        }
        return sum;
    }


    /**
     * @return String
     */
    /**
     * method used to count the leading zeros before the actual number is placed
     * @return
     */
    public int zeroCounter() {
        int counter = 0;

        for (int i = 0; i < hugeInt.length; i++) {
            if(hugeInt[i]=='0'){
                counter++;
            }else{break;}

        }
        return counter;
    }

    public String printString() {
        char[] printbleInt = new char[zeroCounter()];

        String print = new String(this.hugeInt);


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

    public void setHugeInt(char[] hugeInt) {
        this.hugeInt = hugeInt;
    }
}


/**
 * use charter.getNumericValue(i)
 *
 * @param input1 , input2
 * @return HugeInteger
 * <p>
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
 * <p>
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


/**
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
/**
 */

