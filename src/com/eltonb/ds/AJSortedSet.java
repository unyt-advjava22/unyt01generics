package com.eltonb.ds;

public interface AJSortedSet<T extends Comparable<T>> extends Iterable<T> {
    void add(T value);
    boolean isEmpty();
    int size();
    boolean contains(T value);
}
