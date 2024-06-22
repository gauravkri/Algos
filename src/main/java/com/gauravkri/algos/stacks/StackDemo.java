package com.gauravkri.algos.stacks;

import java.util.*;
import java.util.stream.Collectors;

public class StackDemo {


    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.push(1);

        System.out.println("size of stack "+stack.size());

        stack.push(2);

        System.out.println("stack "+stack);

        System.out.println("stack convert to list "+stack.stream().collect(Collectors.toList()));
        System.out.println("peek "+stack.peek());

        System.out.println("stack "+stack);

        System.out.println("pop "+ stack.pop());
        System.out.println("stack "+stack);





    }

}
