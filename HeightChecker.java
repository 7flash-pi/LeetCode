class Solution {
    public int heightChecker(int[] heights) {
        int[] newHeights = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            newHeights[i] = heights[i];
        }
         
        Arrays.sort(heights);
         
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(newHeights[i] != heights[i]){
                count++;
            }
        }
        return count;
        
    }
}