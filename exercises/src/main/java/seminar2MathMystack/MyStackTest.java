package seminar2MathMystack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyStackTest {
    MyStack<Integer> ms;

    @BeforeEach
    public void setUp() {
        ms = new MyStack<>();
    }

    @Test
    public void testEmptySize() {
        assertEquals(0, ms.size());
    }

    @Test
    public void testAdd() {
        ms.add(1);
        assertEquals(1, ms.size());
    }

    @Test
    public void testPop() {
        ms.add(1);
        assertEquals(1, ms.pop());
        assertEquals(0, ms.size());
    }

    @Test
    public void testAddAll() {
        ms.addAll(List.of(1, 2, 3));
        assertEquals(3, ms.size());
    }
}
