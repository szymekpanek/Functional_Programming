package ch_2;
// Learning Stack();

import java.util.Stack;

//Make a program that will put in the stack letters from A - Z, then check where is letter A in stack
public class task2_15 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        for (char i = 'A'; i <= 'Z'; i++) {
            stack.add(i);
        }

        System.out.println("Stack: " + stack);

        int index = stack.search('A');
        System.out.println("Index of A: " + index);

        System.out.println("on top of stack: " + stack.peek());

    }
}
