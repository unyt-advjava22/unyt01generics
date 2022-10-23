package com.eltonb.nongeneric.ints;


public class IntegerSingleLinkedList implements IntegerList {

    private IntegerNode firstNode;
    private IntegerNode lastNode;
    private int elementCount = 0;

    public IntegerSingleLinkedList() {
        firstNode = null;
        lastNode = null;
        elementCount = 0;
    }

    @Override
    public int size() {
        return elementCount;
    }

    @Override
    public boolean isEmpty() {
        return elementCount == 0;
    }

    @Override
    public int first() {
        if (isEmpty())
            throw new IllegalStateException("List is empty, no first element defined");
        return firstNode.value();
    }

    @Override
    public int last() {
        if (isEmpty())
            throw new IllegalStateException("List is empty, no first element defined");
        return lastNode.value();
    }

    @Override
    public void add(int value) {
        IntegerNode node = new IntegerNode(value);
        if (isEmpty()) {
            firstNode = node;
        } else {
            lastNode.setNext(node);
        }
        lastNode = node;
        elementCount++;
    }

    @Override
    public int remove(int index) {
        if (index >= size())
            throw new IllegalArgumentException("Cannot remove element at index " + index + ", list size is " + size());
        int curr = 0;
        IntegerNode currNode = firstNode;
        IntegerNode prevNode = null;
        while (curr < index) {
            curr++;
            prevNode = currNode;
            currNode = currNode.next();
        }

        int value = currNode.value();

        //corner case - first & last element, i.e. list size == 1
        if (firstNode == currNode && lastNode == currNode) {
            firstNode = null;
            lastNode = null;

        }
        //corner case - first element
        else if (firstNode == currNode) {
            firstNode = currNode.next();
        }

        //corner case - last element
        else if (lastNode == currNode) {
            lastNode = prevNode;
            lastNode.setNext(null);
        }

        //handle other cases
        else {
            prevNode.setNext(currNode.next());;
        }


        elementCount--;
        return value;
    }

    @Override
    public IntegerListIterator iterator() {
        return new IntegerLinkedListIterator(firstNode, lastNode);
    }

}
