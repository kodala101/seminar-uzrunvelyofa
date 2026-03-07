package seminar3FizzBuzzPair;

public class FizzBuzz {
    public static String evaluate(int num) {
        if (num % 15 == 0 || (containsDigit(num, 3) && containsDigit(num, 5))) {
            return "FizzBuzz";
        }
        if (num % 3 == 0 || containsDigit(num, 3)) {
            return "Fizz";
        }
        if (num % 5 == 0 || containsDigit(num, 5)) {
            return "Buzz";
        }
        return String.valueOf(num);
    }

    private static boolean containsDigit(int num, int dig) {
        if (String.valueOf(num).contains(String.valueOf(dig))) return true;
        return false;
    }
}
