package com.eltonb.nongeneric.ints;

public interface IntegerList {
    int size();
    boolean isEmpty();
    int first();
    int last();
    void add(int value);
    int remove(int index);
    IntegerListIterator iterator();
}
