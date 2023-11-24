package com.telran.org.lesson8;

public class Node { //genetic whole numbers
    private Integer data;
    private Node next;

    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) { // we never used this set method?
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}