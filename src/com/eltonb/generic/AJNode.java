package com.eltonb.generic;

public class AJNode<T> {

    private T value;
    private AJNode<T> next;

    public AJNode(T value) {
        this.value = value;
        this.next = null;
    }

    public T value() {
        return value;
    }

    public AJNode<T> next()  {
        return next;
    }

    public void setNext(AJNode node) {
        this.next = node;
    }
}
