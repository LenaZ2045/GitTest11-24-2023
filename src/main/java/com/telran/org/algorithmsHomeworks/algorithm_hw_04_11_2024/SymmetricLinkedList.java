package com.telran.org.algorithmsHomeworks.algorithm_hw_04_11_2024;

// Дан односвязный список. Написать функцию или блок схему, определяющую, образуют ли его элементы симметричную последовательность.
// Для решения задачи использовать стек и очередь. Функция будет возвращать значение true, если список является симметричным, false – в противном случае.
// По определению пустой список является симметричным. Поэтому, если список пуст, то возвращаем значение true.
// Для проверки симметричности списка нужно проверить на равенство все пары элементов, равноотстоящих от середины списка.
// Каждая пара содержит один элемент из первой половины списка и один – из второй. Элементы первой половины списка последовательно заносятся в очередь, второй половины в стек.
// Если количество элементов списка будет нечетным, то серединный элемент будет симметричен сам себе и не будет помещен ни в очередь, ни в стек.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class SymmetricLinkedList {
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(isSymmetric(head)); // Should print true
        System.out.println(isSymmetric(head.next)); // Should print false
        System.out.println(isSymmetric(head.next.next)); // Should print false
        System.out.println(isSymmetric(head.next.next.next)); // Should print true


    }

    public static boolean isSymmetric(ListNode head) {
        if (head == null || head.next == null) {
            return true; // Empty list or single element list is symmetric
        }

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the first half of the list and add elements to queue
        while (fast != null && fast.next != null) {
            queue.offer(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the list has an odd number of elements, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        // Traverse the second half of the list and add elements to stack
        while (slow != null) {
            stack.push(slow.val);
            slow = slow.next;
        }

        // Compare elements from queue and stack
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false; // Not symmetric
            }
        }

        return true; // Symmetric
    }
}

// Explanation:
//We use a slow pointer (slow) and a fast pointer (fast) to find the middle of the list.
//We add the first half of the list to a queue and the second half to a stack.
//We compare elements from the queue and stack to check for symmetry.