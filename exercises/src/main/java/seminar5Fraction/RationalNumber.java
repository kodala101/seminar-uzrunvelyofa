package seminar5Fraction;

import java.util.Objects;

public class RationalNumber {
    private final int numerator;
    private final int denominator;

    //Rep invariant: denominator > 0; rational number will be in its reduced form (gcd = 1)
    //Abstract Function: AF(numerator, denominator) = numerator / denominator
    //Safety from REP Exposure: checkRepresentation(), fields are private, final keyword
    public RationalNumber(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0");
        }

        if (b < 0) {
            a *= -1;
            b *= -1;
        }

        int i = gcd(a, b);

        numerator = a/i;
        denominator = b/i;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public RationalNumber multiply(RationalNumber rn) {
        return new RationalNumber(numerator * rn.numerator, denominator * rn.denominator);
    }

    public RationalNumber add(RationalNumber rn) {
        return new RationalNumber(numerator * rn.denominator + rn.numerator * denominator, denominator * rn.denominator);
    }

    public RationalNumber subtract(RationalNumber rn) {
        return add(new RationalNumber(-rn.numerator, rn.denominator));
    }

    public RationalNumber divide(RationalNumber rn) {
        return multiply(new RationalNumber(rn.denominator, rn.numerator));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RationalNumber)) return false;
        RationalNumber r = (RationalNumber) o;
        if (numerator == r.numerator && denominator == r.denominator) return true;
        return false;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    private void checkRepresentation() {
        assert denominator > 0 : "Denominator must be greater than 0";
        assert gcd(numerator, denominator) == 1 : "Numerator and denominator are not reduced: " + numerator + "/" + denominator;
    }
}
