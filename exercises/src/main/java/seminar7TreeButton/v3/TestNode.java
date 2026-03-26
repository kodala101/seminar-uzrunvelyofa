package seminar7TreeButton.v3;

import org.junit.jupiter.api.Test;
import seminar7TreeButton.v2.AddNode;
import seminar7TreeButton.v2.DivideNode;
import seminar7TreeButton.v2.MinusNode;
import seminar7TreeButton.v2.MultiplyNode;
import seminar7TreeButton.v2.Node;
import seminar7TreeButton.v2.NumberNode;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestNode {
    @Test
    public void TestEverything() {
        Node n1 = new AddNode(new NumberNode(5), new NumberNode(6));
        assertEquals(11, n1.evaluate());

        Node n2 = new MinusNode(new NumberNode(5), new NumberNode(6));
        assertEquals(-1, n2.evaluate());

        Node n3 = new MultiplyNode(new NumberNode(5), new NumberNode(6));
        assertEquals(30, n3.evaluate());

        Node n4 = new DivideNode(new NumberNode(6), new NumberNode(2));
        assertEquals(3, n4.evaluate());

        Node n5 = new DivideNode(new AddNode(new NumberNode(1), new NumberNode(3)), new NumberNode(2));
        assertEquals(2, n5.evaluate());
    }
}
