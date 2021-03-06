/*
 * There are n children standing in a line. Each child is assigned a rating
 * value given in the integer array ratings.
 * 
 * You are giving candies to these children subjected to the following
 * requirements:
 * 
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the
 * candies to the children.
 * 
 * 
 */

public class Solution {
    public int candy(int[] ratings) {
        int sum = 0;
        if (ratings.length == 0)
            return sum;
        int[] lc = new int[ratings.length];
        int[] rc = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++)
            lc[i] = rc[i] = 1;
        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i] < ratings[i + 1])
                lc[i + 1] = lc[i] + 1;
        }
        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i])
                rc[i - 1] = rc[i] + 1;
        }
        for (int i = 0; i < ratings.length; i++) {
            sum += max(lc[i], rc[i]);
        }
        return sum;
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
}