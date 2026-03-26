package seminar7TreeButton.v3;

import seminar7TreeButton.v2.Node;

public class DivideNode extends operation{
    public DivideNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    protected char symbol() {
        return '/';
    }

    @Override
    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
