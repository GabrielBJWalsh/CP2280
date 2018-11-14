package hugeInteger;

public class HugeInteger {

    public char [] HugeInteger(String input) {
        parse(input);
        return

    }

    private static char[] parse(String input) {
        char[] hugeInteger = new char[40];

        if (input.length() > 40) {
            input = "number too big";
            hugeInteger = input.toCharArray();
        } else {

            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    hugeInteger[i] = input.charAt(i);
                } else {
                    input = "please use only numbers";
                    hugeInteger = input.toCharArray();
                    return hugeInteger;
                }

                return hugeInteger;
            }
        }
        return hugeInteger;

    }

    /**
     * turns char array into int array
     *
     * @param input
     * @return
     */
    private int[] parInt(char[] input) {
        int[] parInt = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            parInt[i] = Character.getNumericValue(input[i]);
        }
        return parInt;

    }

    public String printHugeInt(HugeInteger) {

        return new String(input);
    }

    /**
     * use charter.getNumericValue(i)
     *
     * @param input1 , input2
     * @return HugeInteger
     */
    public HugeInteger hugeAdd(HugeInteger input1, HugeInteger input2) {
        int carry = 0;

        //carry - sum -sum%10)10;

    }
}


/**
 * set to zero
 * methods needed
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

