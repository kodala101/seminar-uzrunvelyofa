package seminar7TreeButton.v3;

import seminar7TreeButton.v2.Node;

public class MultiplyNode extends operation{
    public MultiplyNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    protected char symbol() {
        return '*';
    }

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
