package com.gauravkri.algos.stacks;

import java.util.Stack;

public class BalanceBracket {

    boolean BracketValidate(String br){
        Stack<Character> stack = new Stack<>();
        char brs[] = br.toCharArray();
        for(int i=0; i< brs.length; i++){
            if ('(' == brs[i] || '{' == brs[i] || '[' == brs[i]) {
                stack.push(brs[i]);
            }else if (']' == brs[i]) {
                if (stack.isEmpty()) {
                    return false;
                }
    
                    if(stack.pop() != '[')
                        return false;
                }else if ('}' == brs[i]) {
                    if (stack.isEmpty()) {
                        return false;
                    }
        
                    if(stack.pop() != '{')
                        return false;
                }else if (')' == brs[i]) {
                    if (stack.isEmpty()) {
                        return false;
                    }
        
                    if(stack.pop() != '(')
                        return false;
                }
            }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
            String brakcets = "([{)]";
            BalanceBracket bb = new BalanceBracket();
            System.out.println(bb.BracketValidate(brakcets));
    }

}
