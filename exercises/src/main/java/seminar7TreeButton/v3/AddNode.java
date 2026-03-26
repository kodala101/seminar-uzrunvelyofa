package seminar7TreeButton.v3;
import seminar7TreeButton.v2.Node;

public class AddNode extends operation{

    public AddNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }

    @Override
    protected char symbol() {
        return '+';
    }
}
