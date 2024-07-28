package org.dsa.stacks;

import java.util.ArrayList;

/**
 * Stack is implemented using dynamic array in java .
 * */

public class Stacks {
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>(); // dynamic array
        push(stack,2);
        push(stack,3);
        push(stack,4);
        push(stack,5);
        push(stack,6);
        System.out.println(" ---- Current stack is -----" + stack);
        System.out.println(size(stack));
        pop(stack);
        pop(stack);
        System.out.println(" ---- Current stack is -----" + stack);
        System.out.println(size(stack));
        size(stack);
    }

    public static void push(ArrayList<Integer> stack ,int n) {
        stack.add(n);
    }

    public static void pop(ArrayList<Integer> stack) {
        stack.remove(stack.size() - 1);
    }

    public static int size(ArrayList<Integer> stack) {
        return stack.size();
    }
}
