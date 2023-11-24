package com.telran.org.algorithm_hw_30_10_2023;

import java.util.ArrayList;
import java.util.Random;

public class DynamicArraySearch { // Task #1

    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();

        for (int i = 0; i < 10; i++) {
            mal.append(new Random().nextInt(10));
        }

        System.out.println(mal.getIndex()); // adds random elements from 0 to 9 into array
        System.out.println(mal);
        System.out.print(mal.oldAppend(0)); // I did not understand what this method is doing?
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);

        int elementToSearch = 30;

        if (list.contains(elementToSearch)) { // method from Java library which searches element position
            int index = list.indexOf(elementToSearch);
            System.out.println("Element " + elementToSearch + " found at index " + index);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the list");
        }
        System.out.println(list);
        list.remove(5); // method from Java library which removes element by index
        System.out.println(list);
        System.out.println();
        mal.contains(8); // did not work, why?
        System.out.println();
        mal.indexOf(2); // did not work, why?
        System.out.println();
        mal.indexOfRange(mal,7, 4); // did not work, why?
    }
}

class MyArrayList {
    private int[] storage;
    private int index;
    private int mal;

    public MyArrayList() {
        this.storage = new int[2];
        this.index = 0;
    }

    public void append(int item) {
        if (this.storage.length == this.index) {
            int[] temp = new int[2 * this.storage.length];
            System.arraycopy(this.storage, 0, temp, 0, this.storage.length);
            this.storage = temp;
        }

        this.storage[this.index] = item;
        this.index += 1;
    }

    public int getIndex() {
        return this.index;
    }

    public int oldAppend(int item) {
        int n = this.storage.length;
        int[] temp = new int[n + 1];

        System.arraycopy(this.storage, 0, temp, 0, n - 1 + 1);

        temp[n] = item;
        this.index += 1;
        this.storage = temp;
        return n;
    }
    int indexOfRange(Object o, int start, int end) { // I tried to write method to find index and to find element
        int[] es = storage;
        if (o == null) {
            for (int i = start; i < end; i++) {
                if (es[i] == 0) {
                    return i;
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int indexOf(Object o) { // I tried to write method to find index and to find element
        return indexOfRange(o, 0, getIndex());
    }


    public boolean contains(int mal) {
        this.mal = mal; // I tried to write method to find index and to find element
        return indexOf(mal) >= 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < this.index; i++) {
            sb.append(String.format("%d ", this.storage[i]));
        }
        sb.append(']');
        return sb.toString();
    }
}