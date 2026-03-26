package seminar7TreeButton.v2;

public class DivideNode implements Node{
    private final Node right;
    private final Node left;

    public DivideNode(Node right, Node left) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        if (right.evaluate() == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return right.evaluate() / left.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "/" + right.toString() + ")";
    }
}