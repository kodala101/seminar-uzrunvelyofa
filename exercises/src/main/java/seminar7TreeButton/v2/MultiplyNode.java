package seminar7TreeButton.v2;

public class MultiplyNode implements Node{
    private final Node right;
    private final Node left;

    public MultiplyNode(Node right, Node left) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        return right.evaluate() * left.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "*" + right.toString() + ")";
    }
}
