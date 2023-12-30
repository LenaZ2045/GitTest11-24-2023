package com.telran.org.algorithm_hw_20_11_2023;

public class ArrayRange {
    public static void main(String[] args) {

//        дан массив чисел, нужно создать строку с указанием ренжей
//Пример: 0,1,2,3,4,5,6,9,11,12 -> "0-6,9,11-12"

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 9, 11, 12};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j < arr.length - 1 && arr[j] + 1 == arr[j + 1]) {
                j++;
            }
            if (i == j) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append("-").append(arr[j]);
                i = j;
            }
            if (i != arr.length - 1) {
                sb.append(",");
            }
        }
        String result = sb.toString();
        System.out.println(result);

    }
}
