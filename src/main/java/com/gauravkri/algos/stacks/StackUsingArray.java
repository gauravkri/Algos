package com.gauravkri.algos.stacks;

/*
 * Stack is linear data structure that follow tha LIFO principle, means last in first out.
 */

public class StackUsingArray {
    int[] stack ;
    int top, capacity;

    StackUsingArray(int size){
        capacity=size;
        top =-1;
        stack = new int[size];
    }

    boolean isEmpty(){
        if (top == -1) {
            System.out.println("stack is underflow");
            return true;
        }
        return false;
    }

    boolean isFull(){
        if (top == capacity) {
            System.out.println("stack is overflow");
            return true;
        }
        return false;
    }

    void push(int value){
       if (!isFull()) {
        stack[++top] = value;
       }
    }

    int pop(){   
        if (!isEmpty()) {
            return  stack[top--];
        }
        return -1;
    }

    int peak(){
        if (!isEmpty()) {
            return stack[top];
        }
        return -1;
    }


    public static void main(String[] args) {
       StackUsingArray st = new StackUsingArray(5);
       st.push(20);
      System.out.println("now peak is "+st.peak());
      st.push(30);
      st.push(40);
      st.push(50);
      st.push(60);
      System.out.println("now peak is "+st.peak());
        System.out.println("pop value "+st.pop()); 
        System.out.println("pop value "+st.pop()); 
        System.out.println("pop value "+st.pop()); 
        System.out.println("pop value "+st.pop()); 

    }
}
