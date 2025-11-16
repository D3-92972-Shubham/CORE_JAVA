package com.sunbeam;

public class GrowableStack implements Stack {
    private Employee[] emps;
    private int top;

    public GrowableStack() {
        emps = new Employee[STACK_SIZE];
        top = -1;
    }

    private void grow() {
        Employee[] temp = new Employee[emps.length * 2];
        for (int i = 0; i < emps.length; i++) {
            temp[i] = emps[i];
        }
        emps = temp;
        System.out.println("Stack grown to size: " + emps.length);
    }

    @Override
    public void push(Employee e) {
        if (top == emps.length - 1) {
            grow();
        }
        emps[++top] = e;
        System.out.println("Pushed: " + e);
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
