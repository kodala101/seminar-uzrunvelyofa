package seminar4RelationOfClasses.Interface;

public abstract class Phone extends Electronics {
    public abstract void makeCall(String number);
    public void testCall(String number) {
        System.out.println("Calling " + number);
    }
}
