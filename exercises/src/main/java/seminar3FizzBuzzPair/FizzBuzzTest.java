package seminar3FizzBuzzPair;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFirst() {
        assertEquals("FizzBuzz", FizzBuzz.evaluate(30));
    }

    @Test
    public void testFirstt() {
        assertEquals("FizzBuzz", FizzBuzz.evaluate(35));
    }

    @Test
    public void testSecond() {
        assertEquals("Fizz", FizzBuzz.evaluate(33));
    }

    @Test
    public void testThird() {
        assertEquals("Buzz", FizzBuzz.evaluate(40));
    }

    @Test
    public void testThirdd() {
        assertEquals("Buzz", FizzBuzz.evaluate(52));
    }

    @Test
    public void testSecondd() {
        assertEquals("Fizz", FizzBuzz.evaluate(38));
    }

    @Test
    public void testForth() {
        assertEquals("14", FizzBuzz.evaluate(14));
    }
    @Test
    public void testForthh() {
        assertEquals("104", FizzBuzz.evaluate(104));
    }
}
