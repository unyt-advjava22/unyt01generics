package com.eltonb.ds;

public class BinaryNode<T> {
    private T data;
    private BinaryNode<T> left;
    private BinaryNode<T> right;

    public BinaryNode(T data, BinaryNode left, BinaryNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(T data) {
        this(data, null, null);
    }

    public T data() {
        return data;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }
    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }
    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }
}
