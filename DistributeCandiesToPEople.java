class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int index = 0;
        int give_candy = 1;
        while(candies!=0){
            if(candies<give_candy){
                result[index] += candies;
                candies = 0;
            }else{
                result[index] += give_candy;
                candies -= give_candy;
            }
            index++;
            give_candy++;
            if(index == num_people){
                index = 0;
            }
        }
        return result;
    }
}