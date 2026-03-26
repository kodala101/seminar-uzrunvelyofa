package seminar7TreeButton.v3;

import seminar7TreeButton.v2.Node;

public class NumberNode extends operation{
    public NumberNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    protected char symbol() {
        return 0;
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
