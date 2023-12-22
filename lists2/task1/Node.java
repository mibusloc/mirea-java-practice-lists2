package ru.mirea.lists2.task1;

class Node {
    private int value;
    private Node prev, next;

    public Node(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}


