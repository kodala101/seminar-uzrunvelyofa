package seminar6Filter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterTest {
    private Filter filter;

    @BeforeEach
    public void setUp() {
        filter = new BooleanFilter();
    }

    @Test
    public void test1() {
        assertEquals(0, filter.size());
    }

    @Test
    public void test2() {
        filter.add(1);
        assertEquals(1, filter.size());
    }

    @Test
    public void test3() {
        filter.add(1);
        filter.remove(1);
        assertEquals(0, filter.size());
    }

    @Test
    public void test4() {
        filter.remove(2);
        assertEquals(0, filter.size());
    }

    @Test
    public void test5() {
        filter.add(1);
        filter.add(1);
        assertEquals(1, filter.size());
    }

    @Test
    public void test6() {
        filter.add(1);
        assertTrue(filter.isPresent(1));
    }

    @Test
    public void test7() {
        filter.add(1);
        assertFalse(filter.isPresent(2));
    }

    @Test
    public void test8() {
        filter.add(50);
        assertEquals(1, filter.size());
    }
}
