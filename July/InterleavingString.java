/*
 * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.

An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:

s = s1 + s2 + ... + sn
t = t1 + t2 + ... + tm
|n - m| <= 1
The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
Note: a + b is the concatenation of strings a and b.
 */
class Solution {
 
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length() + 2, m = s2.length() + 2;
        char[] sc1 = s1.toCharArray(), sc2 = s2.toCharArray(), sc3 = s3.toCharArray();
        if (n + m - 4 != s3.length()) 
            return false;
        boolean[] dp = new boolean[m];
        dp[1] = true;
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++) {
                boolean up = dp[j] && (i < 2 || sc1[i-2] == sc3[j+i-3]),
                    left =dp[j-1] && (j < 2 || sc2[j-2] == sc3[j+i-3]);
                dp[j] = up || left;
            }
        return dp[m-1];
    }
}