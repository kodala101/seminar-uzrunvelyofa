package seminar2MathMystack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack<T> {
    private final List<T> elems;

    public MyStack() {
        elems = new ArrayList<>();
    }

    public void add(T elem) {
        elems.add(elem);
    }

    public T pop() {
        if (elems.isEmpty()) {
            throw new EmptyStackException();
        }
        T temp = elems.get(elems.size() - 1);
        elems.remove(elems.size() - 1);
        return temp;
    }

    public void addAll(Collection<T> c) {
        elems.addAll(c);
    }

    public int size() {
        return elems.size();
    }
}
