package com.gauravkri.algos.mixed;

public class ReverString {

    String revers(String str){

        char[] chrarr =  str.toCharArray();
        int length = str.length();
        int top = length-1;
        for(int i =0; i<length/2; i++){
            char tmp = chrarr[i];
            chrarr[i] = chrarr[top];
            chrarr[top]=tmp;
            top--;
        }
        return new String(chrarr);
    }


    public static void main(String[] args) {
        String s = "gauravk";

        ReverString rs = new ReverString();
        System.out.println("return string "+rs.revers(s));
    }
}
