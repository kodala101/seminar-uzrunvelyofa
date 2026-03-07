package seminar2MathMystack;

public class Math {
    public static int add(int i1, int i2) {
        return i1 + i2;
    }

    public static int abs(int i) {
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        if (i < 0) return -i;
        return i;
    }
}
