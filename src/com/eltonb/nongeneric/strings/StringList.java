package com.eltonb.nongeneric.strings;

public interface StringList {
    int size();
    boolean isEmpty();
    String first();
    String last();
    void add(String value);
    String remove(int index);
    StringListIterator iterator();
}
