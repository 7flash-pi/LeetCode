class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][]dp = new int[text1.length()+1][text2.length()+1];    
        for(int i= text1.length()-1;i>=0;i--){
            for(int j = text2.length()-1;j>=0;j--){
                char ch1 = text1.charAt(i);
                char ch2 = text2.charAt(j);
                if(ch1==ch2) // diagnal
                dp[i][j]= 1+dp[i+1][j+1];
                else// left,down
                    dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j]);
                    
            }
        }
        return dp[0][0];
    }