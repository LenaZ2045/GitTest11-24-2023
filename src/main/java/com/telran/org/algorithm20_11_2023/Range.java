package com.telran.org.algorithm20_11_2023;

public class Range {
    public static void main(String[] args) {

        int[] mass = {0, 1, 2, 3, 4, 5, 6, 9, 11, 12};
        int a = 0;
        int b = 0;
        for (int i = 0; i < mass.length; i++){
            mass[0] = a;
            mass[0] = b;
            if(mass[i+1] == a+1){
                i++;
            }
        }

    }
}
