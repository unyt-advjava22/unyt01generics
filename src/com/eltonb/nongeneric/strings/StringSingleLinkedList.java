package com.eltonb.nongeneric.strings;

public class StringSingleLinkedList implements StringList {

    private StringNode firstNode;
    private StringNode lastNode;
    private int elementCount = 0;

    public StringSingleLinkedList() {
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
    public String first() {
        if (isEmpty())
            throw new IllegalStateException("List is empty, no first element defined");
        return firstNode.value();
    }

    @Override
    public String last() {
        if (isEmpty())
            throw new IllegalStateException("List is empty, no first element defined");
        return lastNode.value();
    }

    @Override
    public void add(String value) {
        StringNode node = new StringNode(value);
        if (isEmpty()) {
            firstNode = node;
        } else {
            lastNode.setNext(node);
        }
        lastNode = node;
        elementCount++;
    }

    @Override
    public String remove(int index) {
        if (index >= size())
            throw new IllegalArgumentException("Cannot remove element at index " + index + ", list size is " + size());
        int curr = 0;
        StringNode currNode = firstNode;
        StringNode prevNode = null;
        while (curr < index) {
            curr++;
            prevNode = currNode;
            currNode = currNode.next();
        }

        String value = currNode.value();

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
    public StringListIterator iterator() {
        return new StringLinkedListIterator(firstNode, lastNode);
    }

}
