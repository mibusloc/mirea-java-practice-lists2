package ru.mirea.lists2.task1;

public class List {
    private Node head;

    public List() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);
        newNode.setPrev(last);
    }

    public void sort() {
        if (head == null || head.getNext() == null) {
            return;
        }

        Node current = head;

        while (current != null) {
            Node minNode = findMin(current);
            if (minNode == current) {
                current = current.getNext();
            }
            moveToStart(minNode);
        }
    }

    private Node findMin(Node start) {
        Node minNode = start;
        Node current = start.getNext();

        while (current != null) {
            if (current.getValue() < minNode.getValue()) {
                minNode = current;
            }
            current = current.getNext();
        }

        return minNode;
    }

    private void moveToStart(Node node) {
        if (node != head) {
            if (node.getPrev() != null) {
                node.getPrev().setNext(node.getNext());
            }
            if (node.getNext() != null) {
                node.getNext().setPrev(node.getPrev());
            }

            node.setNext(head);
            node.setPrev(null);
            head.setPrev(node);
            head = node;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
