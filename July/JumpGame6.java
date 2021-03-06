/*
 * You are given a 0-indexed integer array nums and an integer k.

You are initially standing at index 0. In one move, you can jump at most k steps forward without going outside the boundaries of the array. That is, you can jump from index i to any index in the range [i + 1, min(n - 1, i + k)] inclusive.

You want to reach the last index of the array (index n - 1). Your score is the sum of all nums[j] for each index j you visited in the array.

Return the maximum score you can get.
 */
class Solution {
    public int maxResult(int[] nums, int k) {
        int n = nums.length, a = 0, b = 0;
        int[] deq = new int[n];
        deq[0] = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (deq[a] - i > k) a++;
            nums[i] += nums[deq[a]];
            while (b >= a && nums[deq[b]] <= nums[i]) b--;
            deq[++b] = i;
        }
        return nums[0];
    }
}