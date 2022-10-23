package com.eltonb.nongeneric.ints;

public class IntegerNode {

    private int value;
    private IntegerNode next;

    public IntegerNode(int value) {
        this.value = value;
        this.next = null;
    }

    public int value() {
        return value;
    }

    public IntegerNode next()  {
        return next;
    }

    public void setNext(IntegerNode node) {
        this.next = node;
    }
}
