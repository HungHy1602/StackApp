/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackapp;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: StackApp.
 */
public class StackApp {

    public static void main(String[] args) {
        StackX theStack = new StackX(10);

        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        theStack.displayStackArray(); // Display the stack array

        while (!theStack.isEmpty()) {
            theStack.displayStack(); // Display the stack
            long value = theStack.pop();
            System.out.println("Popped: " + value);
        }

        theStack.displayStackArray(); // Display the stack array after popping

        theStack.pop(); // Attempt to pop from an empty stack

        theStack.push(100); // Push an element onto the stack

        theStack.displayStackArray(); // Display the stack array after pushing

        theStack.push(200); // Attempt to push onto a full stack
    }
}
