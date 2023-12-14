package com.telran.org.algorithm_hw_06_11_2023;

import java.util.Comparator;
import java.util.Stack;
import java.util.function.Function;

// Java implementation of SpecialStack
// Note : here we use Stack class for
// Stack implementation


/* A class that supports all the
stack operations and one additional
operation getMin() that returns
the minimum element from stack at
any time. This class inherits from
the stack class and uses an
auxiliary stack that holds minimum
 elements */

class SpecialStack extends Stack<Integer> {
    Stack<Integer> min = new Stack<>();

    /* SpecialStack"s member method to
insert an element to it. This method
    makes sure that the min stack is
also updated with appropriate minimum
    values */
    void push(int x) {
        if (isEmpty() == true) {
            super.push(x);
            min.push(x);
        } else {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if (x < y)
                min.push(x);
            else
                min.push(y);
        }
    }

    /* SpecialStack"s member method to
insert an element to it. This method
    makes sure that the min stack is
also updated with appropriate minimum
    values */
    public Integer pop() {
        int x = super.pop();
        min.pop();
        return x;
    }

    /* SpecialStack"s member method to get
minimum element from it. */
    int getMin() {
        int x = min.pop();
        min.push(x);
        return x;
    }
    public boolean empty() {
        return size() == 0;
    }

    /* Driver program to test SpecialStack
methods */
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("The min element is = " + s.getMin());
        s.push(5);
        System.out.println("The updated min element after adding new element is = " + s.getMin());
        System.out.println(s.empty() + ", if the stack is not empty print me the stack : " + s);
        s.push(9);
        System.out.println(s);
        System.out.println("element to pop from stack is = " + s.pop());
        s.push(15);
        System.out.println(s);
        System.out.println("element to pop after adding new element from stack is = " + s.pop());
        s.push(3);
        System.out.println(s.getMin());
        System.out.println(s);
        System.out.println(s.isEmpty());
    }
}
