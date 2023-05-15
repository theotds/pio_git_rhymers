package edu.kis.vh.nursery;

/**
 * class representing a data structure with methods such as:
 * - getTotal -> return rhymer size
 * - countIN -> add variable in, at the specific place
 * - callCheck -> boolean to check if it's empty
 * - isFull -> boolean to check if it's full
 * - peekaboo -> method to return last stored valuer
 * - countOut -> same as peekaboo, but it decreases
 */
public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int FULL = CAPACITY - 1;
    private static final int EMPTY = -1;
    private static final int ERROR_CODE = -1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total--];
    }

}
