package com.telran.org.algorithm_inClass_10_30_2023;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        List list = new List();
        list.append(new Random().nextInt(10)); // O(N)

        System.out.println(list.getCount());
    }

    static class List {
        private int[] array;
        private int count;
        int index;

        public List() {
            this.array = new int[0];
            this.count = 0;
        }
        public int getCount() {
            count++;
            return this.index;
        }
        public void append(int item) {
            this.array[this.index++] = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.index; i++) {
                sb.append(String.format("% ", this.array[i]));
            }
            return sb.toString();
        }
    }
}
