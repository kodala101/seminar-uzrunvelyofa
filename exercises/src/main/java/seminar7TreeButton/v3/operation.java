package seminar7TreeButton.v3;

import seminar7TreeButton.v2.Node;

public abstract class operation implements Node {
    protected final Node left;
    protected final Node right;

    protected abstract char symbol();

    public operation(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + symbol() + right.toString() + ")";
    }
}
