package com.sunbeam;

public class FixedStack implements Stack {
    private Employee[] emps;
    private int top;

    public FixedStack() {
        emps = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee e) {
        if (top == STACK_SIZE - 1) {
            System.out.println("Stack Overflow - Fixed Stack is full!");
        } else {
            emps[++top] = e;
            System.out.println("Pushed: " + e);
        }
    }

    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack Underflow - Nothing to pop!");
            return null;
        }
        return emps[top--];
    }
}
