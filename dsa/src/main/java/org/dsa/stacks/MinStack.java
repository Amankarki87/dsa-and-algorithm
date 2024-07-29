package org.dsa.stacks;

import java.util.ArrayList;

/**
 * Design a stack class that supports the push, pop, top, and getMin operations.
 *
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * Each function should run in
 * 𝑂 (1)
 * O(1) time.
 * **/

public class MinStack {
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> minimumStack = new ArrayList<>();

    public MinStack() {
    }

    public void push(int val) {
        this.stack.add(val);

        if (!minimumStack.isEmpty() && minimumStack.get(minimumStack.size() - 1) < val) {
            val = minimumStack.get(minimumStack.size() - 1);
        }

        this.minimumStack.add(val);
    }

    public void pop() {
        this.stack.remove(stack.size() - 1);
        this.minimumStack.remove(minimumStack.size() - 1);
    }

    public int top() {
        return this.stack.get(stack.size() - 1);
    }

    public int getMin() {
        return this.minimumStack.get(minimumStack.size() - 1);
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);
        System.out.println(minStack.getMin()); // return 0
        minStack.pop();
        System.out.println(minStack.top());    // return 2
        System.out.println(minStack.getMin());
    }
}
