package com.telran.org.lesson8;

public class MyLinkedList { // head class out own linked list

    private Node head = null;


    public void add(int data){ // nothing returns method
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return; // ends the work at the moment
        }
        node.setNext(head);
        head = node;
    } // adding new element at the beginning at the array

    // 8->3->4->2->15
    // Time complexity O(N)
    public void pushToTail(int data) {
        Node newNode = new Node(data, null);
        if(head == null) { // we created this as we got NullPointerException (create break point) for method in main class when adding new element at the end of the list
            head = newNode;
            return;
        }
        Node node = head;
        while(node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(newNode);
    }

    // 8->3->4->2
    public void print() { // printed list.print in main class and idea gave us hint
        Node node = head;
        while(node != null) { // method runs by each next object until != null
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }
}
