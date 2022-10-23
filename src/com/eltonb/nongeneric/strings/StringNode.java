package com.eltonb.nongeneric.strings;

public class StringNode {

    private String value;
    private StringNode next;

    public StringNode(String value) {
        this.value = value;
        this.next = null;
    }

    public String value() {
        return value;
    }

    public StringNode next()  {
        return next;
    }

    public void setNext(StringNode node) {
        this.next = node;
    }
}
