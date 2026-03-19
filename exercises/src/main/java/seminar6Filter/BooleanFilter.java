package seminar6Filter;

import java.util.ArrayList;
import java.util.List;

public class BooleanFilter implements Filter{
    private boolean[] b;
    private int size;

    public BooleanFilter() {
        b = new boolean[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isPresent(int index) {
        if (index >= b.length) return false;
        return b[index];
    }

    @Override
    public void add(int index) {
        if (index >= b.length) {
            int newSize = Math.max(index + 1, 2 * b.length);
            boolean[] newArray = new boolean[newSize];
            System.arraycopy(b, 0, newArray, 0, b.length);
            b = newArray;
            b[index] = true;
            size++;
        } else {
            if (!b[index]) {
                b[index] = true;
                size++;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (index < b.length) {
            if (b[index]) {
                b[index] = false;
                size--;
            }
        }
    }
}
