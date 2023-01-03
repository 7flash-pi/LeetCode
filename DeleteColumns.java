class Solution {
    public int minDeletionSize(String[] strs) {
        //n - number of rows
        //m - number of column
        int n = strs.length;
        int m = strs[0].length();
        //res - answer
        int res = 0;
        //col - index of column
        //row - index of row
        for(int col=0;col<m;col++){
            //prev - prev cell value 
            char prev = strs[0].charAt(col);
            //flg - keep track of whether the column is sorted or not.
            //flg - If sorted value = 1 else value = 0
            int flg = 0;
            for(int row = 1; row < n; row++){
                if(prev>strs[row].charAt(col)){
                    //column not sorted in ascending order
                    flg = 1;
                    break;
                }
                prev = strs[row].charAt(col);
                
            }
            if(flg==1)
                res++;
            
        }
        //return ans
        return res;
    }
}