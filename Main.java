// Mr Coxall Stack main class.
// Created Dec 8th, 2021

import java.util.Scanner;
/**
* Main class.
*/

final class Main {

    /**
    * Constant for number 10.
    */

    public static final int MAGIC_10 = 10;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Main() function.
    *
    * @param args unused argument
    */
    public static void main(String[] args) {
        final Scanner myObj = new Scanner(System.in);
        int pushNumber1 = 0;
        int pushNumber2 = 0;
        final MrCoxallStack aStack = new MrCoxallStack();
        try {
            System.out.println("Input your number to be pushed: ");
            pushNumber1 = myObj.nextInt();
            System.out.println("Input your second number: ");
            pushNumber2 = myObj.nextInt();
        } catch (java.util.InputMismatchException error) {
            System.out.println("Invalid input, must be a number");
            System.exit(0);
        }
        aStack.push(pushNumber1);
        aStack.showStack();
        final int topOfStack = aStack.peek();
        System.out.println(
            "The top number of the stack is:" + topOfStack);
        final int popedNumber = aStack.pop();
        System.out.println("The popped number is: "
             + popedNumber);
        aStack.showStack();
        System.out.println("The pushed number is " + pushNumber2);
        aStack.clear();
        System.out.println("The stack has been cleared.");
        aStack.showStack();
    }
}
