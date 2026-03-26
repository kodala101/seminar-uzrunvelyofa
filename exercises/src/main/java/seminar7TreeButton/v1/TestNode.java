package seminar7TreeButton.v1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestNode {
    @Test
    public void TestEverything() {
        Node n1 = new Node('+', 1, 2);
        Node n2 = new Node('*', 3, 4);
        Node n3 = new Node('-', n2, n1);
        Node n4 = new Node(1.5);
        Node n5 = new Node('/', n4, n3);
        assertEquals(1, 6 * n5.evaluate());
        assertEquals("(1.5/((3.0*4.0)-(1.0+2.0)))", n5.toString());
    }
}
