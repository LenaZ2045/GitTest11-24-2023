package com.telran.org.lesson11;

import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'a', 'c', 'a'};
        //ca - this is our result
        //abbaca - this is first look
        //aaca - this is second step
        //ca - the outcome

        Stack<Character> charity = new Stack<>();
        for (int i = 0; i < chars.length; i++) {// char element : chars (enhanced for)
            if (charity.isEmpty()) {
                charity.push(chars[i]); // charity.push(element); <-- (can replace with this phrase
                continue;
            }
            char temp = charity.peek();
            if (temp == chars[i]) { // (charity.peek() == element) { <-- can replace with this phrase
                charity.pop();
            } else {
                charity.push(chars[i]); // charity.push(element); <-- can replace with this phrase
            }
        }
        System.out.println(charity);

//        charity.push('a');
//        charity.push('b');
//        charity.push('b');
//        charity.push('a');
//        charity.push('c');
//        charity.push('a');
//
//        System.out.println(charity);
//
//        while(!charity.isEmpty()) {
//            char element;
//            element = charity.pop(charity.search("b"));
//            System.out.println(element);
//
    }
}


