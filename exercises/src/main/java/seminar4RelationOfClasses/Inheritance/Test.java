package seminar4RelationOfClasses.Inheritance;

public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent parentChild = new Child();
        //Child childParent = new Parent();
        invoke(parent);
        invoke(child);
        invoke(parentChild);
    }

    public static void invoke(Parent p) {
        p.go();
    }

    public static void invoke(Child c) {
        c.go();
    }
}
