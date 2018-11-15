package hugeInteger;


public class HugeInteger {

    public HugeInteger(java.lang.String input){

         parse(input);
    }
    public static char[] parse(java.lang.String input){


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

    } /*

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
    public static String printString(){
        String print = new String(parse(this));



       return print;

    }
    }



    /**
     * use charter.getNumericValue(i)
     *
     * @param input1 , input2
     * @return HugeInteger
     */




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

