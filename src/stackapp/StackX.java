/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackapp;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: StackApp.
 */
class StackX {

    private int maxSize;        // size of stack array
    private long[] stackArray;
    private int top;            // top of stack

    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        if (!isFull()) {
            stackArray[++top] = j;
        } else {
            System.out.println("Stack is full. Cannot push " + j);
        }
    }

    public long pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value to indicate an empty stack.
        }
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void displayStackArray() {
        System.out.print("Stack Array: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public void displayStack() {
        System.out.print("Stack (from top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
