public class Solution1 {
    public int solution(String S) {
        int n = S.length();
        int[] leftB = new int[n + 1];
        int[] rightA = new int[n + 1];

        // leftB[i] will store the number of 'B's to the left of the position i
        for (int i = 0; i < n; i++) {
            leftB[i + 1] = leftB[i] + (S.charAt(i) == 'B' ? 1 : 0);
        }

        // rightA[i] will store the number of 'A's to the right of the position i
        for (int i = n - 1; i >= 0; i--) {
            rightA[i] = rightA[i + 1] + (S.charAt(i) == 'A' ? 1 : 0);
        }

        // Calculate the minimum deletions required to get the desired format
        int minDeletions = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            minDeletions = Math.min(minDeletions, leftB[i] + rightA[i]);
        }

        return minDeletions;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.solution("BAAABAB")); // Output: 2
        System.out.println(solution.solution("BBABAA")); // Output: 3
        System.out.println(solution.solution("AABBBB")); // Output: 0
    }
}
