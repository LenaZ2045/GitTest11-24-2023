package com.telran.org.lesson8;

import java.util.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        packOperationsTwo(list);
        packOperationsOne(list); // this way our created method worked same as methods in class MyLinkedList: we combined methods together

        LinkedList<Integer> integerList = new LinkedList<>(); // realizatciya dannih stryktyri spisok v Java dvynapravleni dvysvyazni spisok
        integerList.add(10);
        integerList.addFirst(19);
        integerList.addLast(20);
//        list.add(2); // this what teacher did at First then he redid this by transferring this data into Methods
//        list.add(4);
//        list.add(3);
//        list.add(8);
//
//// 8->3->4->2
//        for (int i = 0; i < 20; i++) { // scrolled list and added 20 elements at the front of the linked list
//            list.add(i);
//        }

//        list.print();
//        list.pushToTail(15);
//        list.print();
    }
    private static  void packOperationsTwo(MyLinkedList list) { // created method to add element at the end of the linked list
        list.pushToTail(10);
    }

    private static  void packOperationsOne(MyLinkedList list) { // all we typed in Main class we could create this method
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(8);
// 8->3->4->2
        list.print();
        list.pushToTail(15);
        list.print();
    }
}
