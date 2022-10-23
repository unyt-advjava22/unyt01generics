package com.eltonb.generic;

public class AJLinkedListIterator<T> implements AJListIterator<T> {
    private AJNode<T> start;
    private AJNode<T> end;
    private AJNode<T> current;

    public AJLinkedListIterator(AJNode<T> start, AJNode<T> end) {
        this.start = start;
        this.end = end;
        this.current = null;
    }

    public boolean hasNext() {
        return current != end;
    }

    public T next() {
        if (current == null) {
            current = start;
        } else {
            current = current.next();
        }
        return current.value();
    }
}
