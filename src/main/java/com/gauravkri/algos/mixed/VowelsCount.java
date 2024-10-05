package com.gauravkri.algos.mixed;

public class VowelsCount {

    static int vowelCountInSubstrings(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int counter = 0;
        int n = str.length();
        
        // Loop through each character in the string
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            
            // Check if the current character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                
                // Calculate how many substrings this vowel contributes to
                int contribution = (i + 1) * (n - i);
                counter += contribution;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Count of vowels in all substrings: " + vowelCountInSubstrings(input));
    }
}
