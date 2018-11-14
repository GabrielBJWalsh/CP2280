package hugeInteger;

public class HugeInteger {

    public HugeInteger(String input) {
        parse(input);

    }

    private static char[] parse(String input) {
        char[] hugeInteger = new char[40];

        if (input.length() > 40) {
            input = "number too big";
            hugeInteger = input.toCharArray();
        } else {

            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(i)) {
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
     * @param input
     * @return
     */
    private int[] parInt(char[] input) {
        int[] parInt = new int[input.length];
        for (int i = 0; i < input.length; i++) {
        parInt[i] = Character.getNumericValue(input[i]);}
        return parInt;

    }
    public void printArray(char[]input){
        for (int i=0; i<input.length;i++){
            System.out.println(input[i]);
        }
    }
}

