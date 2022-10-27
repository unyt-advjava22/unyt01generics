package com.eltonb.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortedBSTreeSet<T extends Comparable<T>> implements AJSortedSet<T> {

    private BinaryNode<T> root;
    private int counter;

    public SortedBSTreeSet() {
        root = null;
        counter = 0;
    }

    public int size() {
        return counter;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(T value) {
        if (! contains(value)) {
            root = insert(root, value);
            counter++;
        }
    }

    public boolean contains(T value) {
        return binarySearch(value, root);
    }

    private boolean binarySearch(T value, BinaryNode<T> tree) {
        if (tree == null)
            return false;
        T rootValue = tree.data();
        int comparison = value.compareTo(rootValue);
        if (comparison < 0)
            return binarySearch(value, tree.getLeft());
        if (comparison > 0)
            return binarySearch(value, tree.getRight());
        return true;
    }


    private BinaryNode<T> insert(BinaryNode<T> tree, T value) {
        if (tree == null) {
            return new BinaryNode<>(value);
        }
        if (value.compareTo(tree.data()) < 0) {
            BinaryNode<T> left = insert(tree.getLeft(), value);
            tree.setLeft(left);
        }
        if (value.compareTo(tree.data()) > 0) {
            BinaryNode<T> right = insert(tree.getRight(), value);
            tree.setRight(right);
        }
        return tree;
    }

    public void remove(T value) {
        //TODO
    }

    public Iterator<T> iterator() {
        List<T> elements = collectInfix(root);
        return elements.iterator();
    }

    private List<T> collectInfix(BinaryNode<T> tree) {
        if (tree == null)
            return new ArrayList<>();

        List<T> elements = new ArrayList<>();
        elements.addAll(collectInfix(tree.getLeft()));
        elements.add(tree.data());
        elements.addAll(collectInfix(tree.getRight()));
        return elements;
    }

}
