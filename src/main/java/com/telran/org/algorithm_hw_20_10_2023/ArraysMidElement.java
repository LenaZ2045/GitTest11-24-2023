package com.telran.org.algorithm_hw_20_10_2023;

import java.util.Arrays;

public class ArraysMidElement {
    public static void main(String[] args) {
        // my own trials to solve this task from homework...
//        int[][] arr = {{100, 112, 256, 349, 770}, {72, 86, 113, 119, 265, 445, 892}}; // how do we combine two arrays into one?
//        System.out.printf("print two arrays " + Arrays.toString(arr));

//        int[] m = {100, 112, 256, 349, 770};
//        int[] n = {72, 86, 113, 119, 265, 445, 892};
//        int[] k = new int[] {m.length + n.length};
//        System.out.println(Arrays.toString(k));
//        Arrays.sort(k);
        int[] mn = {100, 112, 256, 349, 770, 72, 86, 113, 119, 265, 445, 892};
        System.out.println("Array 'mn' IS NOT sorted " + Arrays.toString(mn));
        Arrays.sort(mn);
        System.out.println("Array 'mn' IS sorted " + Arrays.toString(mn));
        int[] middleElement = outputMiddleElement(mn);
        int[] middleIndex = printMiddleIndex(mn);
        // prints array's 7th middle element [256] & prints array's middle element '256' index [6]
        System.out.println("7th element of sorted array = " + Arrays.toString(middleElement) + " index of #256 is " + Arrays.toString(middleIndex));

        // I wish to see how would I count the element using the method or cycle 'for'???
    }

//    private static void printArray(int[] arr) { // tried to combine two arrays into one
//        for (int i = 0; i < arr.length; i++) { // walks by size of array
//            int[] innerArray = arr[i]; // for(int j=0; j<arr[i}.length; j++) may be written this way
//            for (int j = 0; j < innerArray.length; j++) { // writing cycle we walk by elements of inner array
//                System.out.println(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    // used GPT-4 clue to help me write method
    public static int[] outputMiddleElement(int[] mn) { // method to find middle element from array 'mn'
        int[] result = new int[0]; // initialized 'result'
        int k = 0; // initialized 'k'
        if (mn.length % 2 == 0) { // introduced logic for finding middle element if array-length is even
            // even-length array (two middle elements)
            result = new int[2]; //  initialized how many mid-elements will be printed in result
            result[0] = mn[mn.length / 2 - 1]; // initialized result from array how to calculate & find first middle element in even-length
            result[1] = mn[mn.length / 2]; // initialized result from array how to calculate & find second middle element in even-length
            result[k] = result[1]; // added this logic to get only one element printed (my own additions)
        }
//        else {
//            //odd-length array (only one middle element)
//            result = new int[1];
//            result[0] = mn[mn.length / 2];
//        }
        return new int[]{result[k]}; // prints [256] before it was (return result) and printed two middle elements
    }

    // after looking into method 'outputMiddleElement' wrote logic method how to find index of this middle second element form array 'mn'
    public static int[] printMiddleIndex(int[] mn) { // method to find middle index from array 'mn'
        int[] result = new int[0]; // introduced local variable 'result'
        int index1 = 0; // introduced local variable 'index'
        if (mn.length % 2 == 0) { // logical 'if' for calculating middle element if array length is even
            // even-length array (two middle indexes)
            result = new int[2]; // initialized which and how many middle indexes to print
            result[0] = mn.length / 2 - 1; // initialized result to calculate & find first middle index in even-length array
            result[1] = mn.length / 2; // initialized result to calculate & find second middle index in even-length array
            result[index1] = result[1]; // added this logic to get only one index printed
        }
//        else {
//            //odd-length array (only one middle element)
//            result = new int[1];
//            result[0] = mn.length / 2;
//        }
        return new int[] {result[index1]}; // prints [6] AND will print [two middle indexes] if I write 'return result'
    }
}
