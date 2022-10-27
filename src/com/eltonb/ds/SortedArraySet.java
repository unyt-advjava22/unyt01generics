package com.eltonb.ds;

import java.util.ArrayList;
import java.util.Iterator;

public class SortedArraySet<T extends Comparable<T>> implements AJSortedSet<T> {
    private ArrayList<T> elements;

    public SortedArraySet() {
        elements = new ArrayList<>();
    }

    public void add(T value) {
        if (elements.isEmpty()) {
            elements.add(value);
            return;
        }
        int valIndex = linearSearch(value);
        if (value.compareTo(elements.get(valIndex)) == 0) {
            //value already present
            return;
        }
        if(valIndex==elements.size()) {
            //added as last element
            elements.add(value);
            return;
        }
        T lastValue = elements.get(elements.size() - 1)  ;
        for (int i = elements.size()-1; i>valIndex; i--) {
            elements.set(i, elements.get(i-1));
        }
        elements.set(valIndex, value);
        elements.add(lastValue);

    }

    private int linearSearch(T value) {
        int i = 0;
        while(i<elements.size() && value.compareTo(elements.get(i)) > 0) {
            i++;
        }
        return i;
    }

    public boolean contains(T value) {
        return binarySearch(value, 0, elements.size()-1);
    }

    private boolean binarySearch(T value, int lo, int hi) {
        if (lo > hi)
            return false;
        if (lo==hi)
            return value.compareTo(elements.get(lo)) == 0;

        int mid = (lo + hi) / 2;
        T midValue = elements.get(mid);
        int comparison = value.compareTo(midValue);

        if (comparison < 0)
            return binarySearch(value, lo, mid-1);
        if (comparison > 0)
            return binarySearch(value, mid+1, hi);

        return true;
    }

    public void remove(T value) {
        //TODO
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
