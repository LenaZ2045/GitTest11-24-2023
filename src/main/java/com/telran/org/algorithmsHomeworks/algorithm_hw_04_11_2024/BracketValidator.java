package com.telran.org.algorithmsHomeworks.algorithm_hw_04_11_2024;

import java.util.Stack;

// Последовательность ([{}]) является правильной, а последовательности ([)], {()] правильными не являются. Докажите это используя стек!
public class BracketValidator {
    public static void main(String[] args) {
        String testString1 = "([{}])"; // Valid
        String testString2 = "([)]";   // Invalid
        String testString3 = "{()]";   // Invalid

        System.out.println("Test 1: " + bracketCheck(testString1)); // Should print YES
        System.out.println("Test 2: " + bracketCheck(testString2)); // Should print NO
        System.out.println("Test 3: " + bracketCheck(testString3)); // Should print NO
    }

    public static String bracketCheck(String testString) {
        Stack<Character> stack = new Stack<>();

        for (char ch : testString.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch); // Push opening brackets onto the stack
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return "NO"; // No corresponding opening bracket
                }
                char top = stack.pop();
                if (!isValidPair(top, ch)) {
                    return "NO"; // Mismatched brackets
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO"; // Stack should be empty for a valid sequence
    }

    public static boolean isValidPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
// Explanation:
//We iterate through each character in the input string.
//If we encounter an opening bracket ((, [, or {), we push it onto the stack.
//If we encounter a closing bracket (), ], or }), we check if it matches the top of the stack (i.e., the corresponding opening bracket). If not, the sequence is invalid.
//Finally, we check if the stack is empty. If it is, the sequence is valid; otherwise, it’s invalid.