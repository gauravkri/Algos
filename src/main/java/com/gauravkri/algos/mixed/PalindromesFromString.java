package com.gauravkri.algos.mixed;

import java.util.HashSet;
import java.util.Set;

public class PalindromesFromString {


    boolean isPalindromes(String str){
        int left =0;
        int right = str.length()-1;

        while (left<right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;   
            }
            left++;
            right--;
        }

        return true;
    }


    Set<String> findPalindromes(String str){
        Set<String> palindrom = new HashSet<>(); 
        int length = str.length();

        for(int i=0;i<length;i++){
            for(int j = i+1; j<=length; j++){
                String substring = str.substring(i, j);
                
                if (substring.length() > 1 && isPalindromes(substring)) {
                    palindrom.add(substring);
                }
            }
        }
        return palindrom;
    }

    public static void main(String[] args) {
        String str =  "madamsir"; 
        PalindromesFromString pl = new PalindromesFromString();
        System.out.println(pl.findPalindromes(str));
    }

}
