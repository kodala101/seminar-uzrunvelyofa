package seminar6Filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedListFilter implements Filter{
    private List<Integer> al;

    public SortedListFilter() {
        al = new ArrayList<>();
    }

    @Override
    public int size() {
        return al.size();
    }

    @Override
    public boolean isPresent(int index) {
        return Collections.binarySearch(al, index) >= 0;
    }

    @Override
    public void add(int index) {
        int ind = Collections.binarySearch(al, index);
        if (ind < 0) {
            al.add(-ind - 1, index);
        }
    }

    @Override
    public void remove(int index) {
        if (isPresent(index)) al.remove((Integer)index);
    }
}
