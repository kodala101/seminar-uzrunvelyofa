package seminar3FizzBuzzPair;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PairTest {
    @Test
    public void testEquals() {
        Pair<Integer, String> pair1 = new Pair<>(1, "a");
        Pair<Integer, String> pair2 = new Pair<>(1, "a");
        Pair<Integer, String> pair3 = new Pair<>(2, "b");
        String s = "asd";
        assertTrue(pair1.equals(pair2));
        assertTrue(pair2.equals(pair1));
        assertFalse(pair1.equals(pair3));
        assertFalse(pair3.equals(pair1));
        assertFalse(pair3.equals(s));
    }

    @Test
    public void testGetKey() {
        Pair<Integer, String> pair1 = new Pair<>(1, "a");
        assertEquals(1, pair1.getKey());
    }

    @Test
    public void testGetValue() {
        Pair<Integer, String> pair1 = new Pair<>(1, "a");
        assertEquals("a", pair1.getValue());
    }

    @Test
    public void testSetKey() {
        Pair<Integer, String> pair1 = new Pair<>(1, "a");
        pair1.setKey(2);
        assertEquals(2, pair1.getKey());
    }

    @Test
    public void testSetValue() {
        Pair<Integer, String> pair1 = new Pair<>(1, "a");
        pair1.setValue("b");
        assertEquals("b", pair1.getValue());
    }

    @Test
    public void testToString() {
        Pair<Integer, String> pair1 = new Pair<>(1, "a");
        assertEquals("1 - a", pair1.toString());
    }
}
