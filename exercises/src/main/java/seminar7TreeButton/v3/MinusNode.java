package seminar7TreeButton.v3;

import seminar7TreeButton.v2.Node;

public class MinusNode extends operation{
    public MinusNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    protected char symbol() {
        return '-';
    }

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
