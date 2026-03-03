package seminar1RomanNums;

import java.util.Map;

public class RomanNumeral {
    private static final int MIN = 1;
    private static final int MAX = 3999;
    private static final String REGEX = "^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
    private static final Map<Character, Integer> SYMBOLS = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );
    private static final int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] syms = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    private int arabicNum;
    private String romanNum;

    public RomanNumeral(int arabicNumber) {
        if (arabicNumber < MIN || arabicNumber > MAX) {
            throw new IllegalArgumentException("Number must be between " + MIN + " and " + MAX);
        }
        this.arabicNum = arabicNumber;
        this.romanNum = null;
    }

    public RomanNumeral(String romanNumber) {
        if (!romanNumber.matches(REGEX)) {
            throw new IllegalArgumentException("Invalid roman number");
        }
        this.arabicNum = 0;
        this.romanNum = romanNumber;
    }

    public int toInt() {
        if (arabicNum != 0) return arabicNum;
        int result = 0;
        for (int i = 0; i < romanNum.length(); i++) {
            if (i != romanNum.length() - 1 && SYMBOLS.get(romanNum.charAt(i)) < SYMBOLS.get(romanNum.charAt(i + 1))) {
                result -= SYMBOLS.get(romanNum.charAt(i));
            } else {
                result += SYMBOLS.get(romanNum.charAt(i));
            }
        }
        arabicNum = result;
        return arabicNum;
    }

    public String toString() {
        if (romanNum != null) return romanNum;
        StringBuilder result = new StringBuilder();
        int temp = arabicNum;
        for (int i = 0; i < nums.length; i++) {
            while(temp >= nums[i]) {
                result.append(syms[i]);
                temp -= nums[i];
            }
        }
        romanNum = result.toString();
        return romanNum;
    }
}
