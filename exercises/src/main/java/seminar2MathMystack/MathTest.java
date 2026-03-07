package seminar2MathMystack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathTest {
    @Test
    public void addSmallPositiveInts() {
        assertEquals(3, Math.add(1, 2));
        assertEquals(2, Math.add(1, 1));
        assertEquals(4, Math.add(3, 1));
        assertEquals(5, Math.add(3, 2));
    }

    @Test
    public void addBigPositiveInts() {
        assertEquals(447, Math.add(123, 324));
        assertEquals(3333, Math.add(1111, 2222));
    }

    @Test
    public void addSmallNegativeInts() {
        assertEquals(-2, Math.add(-1, -1));
        assertEquals(-1, Math.add(0, -1));
    }

    @Test
    public void addBigNegativeInts() {
        assertEquals(-164, Math.add(-43, -121));
        assertEquals(-622, Math.add(-122, -500));
    }

    @Test
    public void absNegativePositiveInts() {
        assertEquals(3, Math.add(-2, 5));
        assertEquals(-5, Math.add(4, -9));
    }

    @Test
    public void absSmallInts() {
        assertEquals(3, Math.abs(-3));
        assertEquals(5, Math.abs(5));
    }

    @Test
    public void absBigInts() {
        assertEquals(346, Math.abs(-346));
        assertEquals(1234, Math.abs(1234));
    }

//    @Test
//    public void absSmallestInt() {
//        assertEquals(3, Math.add(-2, 5));
//        assertEquals(-5, Math.add(4, -9));
//    }
}
