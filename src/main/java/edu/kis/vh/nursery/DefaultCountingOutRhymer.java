package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int FULL = 11;
    private static final int SIZE = 12;
    private static final int COUNTER = -1;

    private final int[] numbers = new int[SIZE];

    public int total = COUNTER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == COUNTER;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return COUNTER;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return COUNTER;
        return numbers[total--];
    }

}
