package com.eltonb.generic;

public interface AJList<T> {
    int size();
    boolean isEmpty();
    T first();
    T last();
    void add(T value);
    T remove(int index);
    AJListIterator<T> iterator();
}
