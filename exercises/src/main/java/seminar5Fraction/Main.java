package seminar5Fraction;

public class Main {
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(1, 2);
        System.out.println(r1);

//        RationalNumber r2 = new RationalNumber(1, 0);
//        System.out.println(r2);

        RationalNumber r2 = new RationalNumber(0, 1);
        System.out.println(r2);

        RationalNumber r3 = new RationalNumber(4, 12);
        System.out.println(r3);

        RationalNumber r4 = new RationalNumber(3, 4);
        RationalNumber r5 = new RationalNumber(5, 7);

        System.out.println(r4.multiply(r5));
        System.out.println(r4.add(r5));
        System.out.println(r4.subtract(r5));
        System.out.println(r4.divide(r5));
        System.out.println(r4.equals(r5));
    }
}
