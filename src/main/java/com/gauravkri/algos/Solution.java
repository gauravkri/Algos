// public class Solution {
//     public int solution(String S) {
//         int countA = 0; // Count of 'A' characters
//         int countB = 0; // Count of 'B' characters

//         for (char c : S.toCharArray()) {
//             if (c == 'A') {
//                 countA++;
//             } else {
//                 // If we encounter 'B', it should come after all 'A's
//                 // So we need to delete it
//                 countB++;
//             }
//         }

//         // The minimum deletions needed will be the smaller of countA and countB
//         return Math.min(countA, countB);
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         System.out.println(solution.solution("BAAABAB")); // Output: 2
//         System.out.println(solution.solution("BBABAA")); // Output: 3
//         System.out.println(solution.solution("AABBBB")); // Output: 0
//     }
// }



public class Solution {
    public String solution(int AA, int AB, int BB) {
        StringBuilder result = new StringBuilder();
        
        while (AA > 0 || AB > 0 || BB > 0) {
            // Check the last two characters of the result to avoid "AAA" or "BBB"
            String lastTwo = result.length() >= 2 ? result.substring(result.length() - 2) : "";
            
            if ((lastTwo.equals("AA") && AA > 0) || (lastTwo.equals("BB") && BB > 0)) {
                if (AB > 0) {
                    result.append("AB");
                    AB--;
                } else {
                    break; // No way to add without causing "AAA" or "BBB"
                }
            } else if (AA >= BB) {
                if (AA > 0) {
                    result.append("AA");
                    AA--;
                } else if (BB > 0) {
                    result.append("BB");
                    BB--;
                }
            } else {
                if (BB > 0) {
                    result.append("BB");
                    BB--;
                } else if (AA > 0) {
                    result.append("AA");
                    AA--;
                }
            }
            
            if (AA == 0 && AB > 0) {
                result.append("AB");
                AB--;
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(5, 0, 2)); // Output: "AABBAABBAA"
        System.out.println(sol.solution(1, 2, 1)); // Possible outputs: "BBABABAA", "ABAABBAB", "ABABAABB", "AABBABAB"
        System.out.println(sol.solution(0, 2, 0)); // Output: "ABAB"
        System.out.println(sol.solution(0, 0, 10)); // Output: "BB"
    }
}

