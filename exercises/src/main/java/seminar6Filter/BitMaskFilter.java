package seminar6Filter;

public class BitMaskFilter implements Filter{
    private long[] bits;
    private int size;

    private static final int b = 64;

    public BitMaskFilter() {
        bits = new long[1];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isPresent(int index) {
        if (index >= b * bits.length) return false;
        int arrInd = index / b;
        int arrPos = index % b;
        return (bits[arrInd] & (1L << arrPos)) != 0;
    }

    @Override
    public void add(int index) {
        if (index >= b * bits.length) {
            int newSize = Math.max(index/64 +1, bits.length * 2);
            long[] newArr = new long[newSize];
            System.arraycopy(bits, 0, newArr, 0, bits.length);
            bits = newArr;
            bits[index/64] |= (1L << (index % 64));
            size++;

        } else {
            if (!isPresent(index)) {
                bits[index/64] |= (1L << (index % 64));
                size++;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (isPresent(index)) {
            bits[index/64] &= (~1L << (index % 64));
            size--;
        }
    }
}
