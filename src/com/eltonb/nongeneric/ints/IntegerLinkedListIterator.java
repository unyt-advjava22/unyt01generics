package com.eltonb.nongeneric.ints;

public class IntegerLinkedListIterator implements IntegerListIterator {
    private IntegerNode start;
    private IntegerNode end;
    private IntegerNode current;

    public IntegerLinkedListIterator(IntegerNode start, IntegerNode end) {
        this.start = start;
        this.end = end;
        this.current = null;
    }

    public boolean hasNext() {
        return current != end;
    }

    public Integer next() {
        if (current == null) {
            current = start;
        } else {
            current = current.next();
        }
        return current.value();
    }
}
