package src.com.javaconcepts;

public class subString {
    public static int countSubsequences(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // dp[i][j] stores the count of occurrences of
        // s1(0...i-1) in s2(0...j-1)
        int[][] dp = new int[m + 1][n + 1];

        // Filling the first row: with 1s because an empty string is a subsequence of any string but only 1 time
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 1;
        }

        // Filling the first column: s1(0...i-1) cannot be found in an empty s2
        for (int i = 1; i <= m; i++) {
            dp[i][0] = 0;
        }

        // Calculating the number of subsequence using dynamic programming
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If last characters are matching, we have two options:
                // 1. consider last characters of both strings in solution
                // 2. ignore last character of string s2
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                else
                    // If last characters are not matching, ignore last char of s2 and recur for remaining string
                    dp[i][j] = dp[i][j - 1];
            }
        }

        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABCBABC";
        System.out.println("The string \"" + s1 + "\" appears " + countSubsequences(s1, s2) + " times as a subsequence in \"" + s2 + "\".");
    }

}
