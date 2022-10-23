package com.eltonb.nongeneric.strings;

public class StringLinkedListIterator implements StringListIterator {
    private StringNode start;
    private StringNode end;
    private StringNode current;

    public StringLinkedListIterator(StringNode start, StringNode end) {
        this.start = start;
        this.end = end;
        this.current = null;
    }

    public boolean hasNext() {
        return current != end;
    }

    public String next() {
        if (current == null) {
            current = start;
        } else {
            current = current.next();
        }
        return current.value();
    }
}
