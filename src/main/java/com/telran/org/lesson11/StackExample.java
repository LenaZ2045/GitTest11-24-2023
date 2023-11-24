package com.telran.org.lesson11;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();// type of the stack may be string int double boolean
        // LIFO
        stack.push("one"); // using push to create array of Stack kind (add element to stack)
        stack.push("two");
        stack.push("three"); // saves elements new top is Four top-after is Three middle is Two bottom is One
        stack.push("four");

        System.out.println(stack);

        //search - returns index of element from stack
        System.out.println("Index of One is " + stack.search("one")); // bottom of the element has index which is '1'
        System.out.println("index of Four is " + stack.search("four")); // top of the element has index which is '4'

        //peek - get element from top without remove
        System.out.println("Top element " + stack.peek());
        System.out.println(stack);

        // pop - get and remove element from stack
        System.out.println("Top element " + stack.pop());
        System.out.println(stack);

        //isEmpty()

        while(!stack.isEmpty()) {
            String element = stack.pop();
            System.out.println("element from stack " + element);
        }

        print(); // gives another block for memory for method on top of main method block

    }
    public static void print() {

    }
}
