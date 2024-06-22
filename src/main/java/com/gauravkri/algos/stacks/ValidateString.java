package com.gauravkri.algos.stacks;

import java.util.Iterator;
import java.util.Stack;

public class ValidateString {

    public static boolean validString(String s){
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        int i =0;
        while (i< s.length()){

            if (s.charAt(i) ==  '('){
                stack.push(')');
                i++;
            }
            else if (s.charAt(i) ==  '{'){
                stack.push('}');
                i++;
            }
            else if (s.charAt(i) ==  '['){
                stack.push(']');
                i++;
            }
            else{
                if (stack.isEmpty() || s.charAt(i)!= stack.peek()){
                    return false;
                }
                else {
                    stack.pop();
                }
                i++;
            }
        }

        return true;
    }

    public static boolean validString2(String s){
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char c: chars) {
            stack.push(c);
        }

        while (stack.size()>0){
            char c1 = stack.pop();
            char c2 = stack.pop();

            if (c1 == ')'){
                if (c2 != '(')
                    return false;
            } else if (c1 == '}') {
                if (c2 != '{')
                    return false;
            }else if (c1 == ']') {
                if (c2 != '[')
                    return false;
            }else
                return false;
        }



        return true;
    }
    public static void main(String[] args) {
//        System.out.println(validString2("(){}"));;
//        System.out.println(validString2("({)}"));;
        System.out.println(validString("{[]}"));;
    }
}
