/*A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.*/

class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] &&
                    arr[i] >= arr[i + 1])
                return i;
        }
        return 0;

    }
}
