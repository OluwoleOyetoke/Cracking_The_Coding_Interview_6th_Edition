/*
 * Copyright (C) 2018 Oluwole Oyetoke <oluwoleoyetoke@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cracking.the.coding.interview.chapter03.stacksandqueus.datastructure;

/**
 * Stack data structure implementation
 *
 * @author Oluwole Oyetoke {@literal <}oluwoleoyetoke {@literal @}
 */
@SuppressWarnings("unused")
public class MyStack<Type> {

    private int top;
    private int size;
    private Type[] stack;
    private Type currentMin;

    /**
     * Default constructor
     */
    public MyStack() {
        size = 20;
        stack = (Type[]) new Object[size];
        top = -1;
    }

    /**
     * Constructor
     *
     * @param size maximum size of the stack
     */
    public MyStack(int size) {
        this.size = size;
        stack = (Type[]) new Object[size];
        top = -1;
    }

    /**
     * Push into stack
     *
     * @param element element to add
     * @return true/false true if successful
     */
    public boolean push(Type element) {
        top++;
        if (top > size - 1) {
            System.out.println("Stack is full");
            top--;
            return false;
        }
        stack[top] = element;
        return true;
    }

    /**
     * Pop out element from the stack
     *
     * @return toReturn element poped out (if any)
     */
    public Type pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        Type toReturn = stack[top];
        top--;
        return toReturn;
    }

    /**
     * Check the element at the top of the stack, but don't pop;
     *
     * @return element element at the top of the stack
     */
    public Type peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    /**
     * Check if stack is empty
     *
     * @return true/false true if stack is empty
     */
    public boolean isEmpty() {
        if (top < 0) {
            return true;
        }
        return false;
    }

    /**
     * Converts stack into a string
     *
     * @return stackString stack string
     */
    @Override
    public String toString() {
        String toReturn = "";
        if (top < 0) {
            toReturn = "Stack is Empty";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            if (i != top) {
                sb.append(stack[i]);
                sb.append(",");
            } else {
                sb.append(stack[i]);
            }
        }
        return sb.toString();
    }

    /**
     * Main method for stack implementation....uncomment to run
     *
     * @param args command line argument
     *//*
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(30);
        for (int i = 0; i < 20; i++) {
            stack.push((Integer) i * 9);
        }

        System.out.println("STACK: " + stack.toString());
        System.out.println("POP: " + stack.pop());
        System.out.println("AFTER POP: " + stack.toString());
        System.out.println("PUSH 141 INTO STACK: " + stack.push(141));
        System.out.println("STACK: " + stack.toString());
        System.out.println("PEEK: " + stack.peek());
    }
*/
}
