package seminar1RomanNums;

public class Main {
    public static void main(String[] args) {
        RomanNumeral rn1 = new RomanNumeral(12);
        System.out.println("XII - " + rn1.toString());

        RomanNumeral rn2 = new RomanNumeral("XVI");
        System.out.println("16 - " + rn2.toInt());

        RomanNumeral rn3 = new RomanNumeral("MCLIV");
        System.out.println("1154 - " + rn3.toInt());

        RomanNumeral rn4 = new RomanNumeral(967);
        System.out.println("CMLXVII - " + rn4.toString());
    }
}
