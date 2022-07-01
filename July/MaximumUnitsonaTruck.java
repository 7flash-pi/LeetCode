/*
 * You are assigned to put some amount of boxes onto one truck. You are given a
 * 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi,
 * numberOfUnitsPerBoxi]:
 * 
 * numberOfBoxesi is the number of boxes of type i.
 * numberOfUnitsPerBoxi is the number of units in each box of the type i.
 * You are also given an integer truckSize, which is the maximum number of boxes
 * that can be put on the truck. You can choose any boxes to put on the truck as
 * long as the number of boxes does not exceed truckSize.
 * 
 * Return the maximum total number of units that can be put on the truck.
 * 
 * 
 */

class Solution {
    public int maximumUnits(int[][] B, int T) {
        Arrays.sort(B, (a, b) -> b[1] - a[1]);
        int ans = 0;
        for (int[] b : B) {
            int count = Math.min(b[0], T);
            ans += count * b[1];
            T -= count;
            if (T == 0)
                return ans;
        }
        return ans;
    }
}
