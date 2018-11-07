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
}


