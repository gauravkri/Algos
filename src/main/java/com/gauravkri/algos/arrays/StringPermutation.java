package com.gauravkri.algos.arrays;

public class StringPermutation {

   // Helper function to generate permutations
   private static void permute(String str, String ans) {
        // If the string becomes empty, print the current permutation
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Iterate over the string and recursively call permute
        for (int i = 0; i < str.length(); i++) {
            // Pick one character and form the rest of the string
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            
            // Recursively call with the new string and the current permutation
            permute(ros, ans + ch);
        }
    }


    public static void main(String[] args) {
        String word = "ABC";
        permute(word, "");
    }

}
