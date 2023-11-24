package com.telran.org.lesson5;

import java.util.Arrays;

public class AppArray {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3},{4, 5, 6, 0}, {7, 8, 9}};

        System.out.println(arr[1][1]); // vidast "element - 5"
        System.out.println();
        printArray(arr);
        int[] inner = arr[1];
        inner[2] = 15;
        printArray(arr);
        int[] arrNotSorted = {2, 6, 5, 7, 3, 8, 1, 0};
        Arrays.sort(arrNotSorted);
        System.out.println(Arrays.toString(arrNotSorted));

    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // prohodit po kolichestvy strok
            int [] innerArray = arr[i]; // for(int j=0; j<arr[i}.length; j++) mojno tak
            for(int j= 0; j < innerArray.length; j++) { // berya stroky proxodim po elementam vnytrennego masiva
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
