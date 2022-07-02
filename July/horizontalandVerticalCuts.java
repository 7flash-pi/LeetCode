/*
 * You are given a rectangular cake of size h x w and two arrays of integers
 * horizontalCuts and verticalCuts where:
 * 
 * horizontalCuts[i] is the distance from the top of the rectangular cake to the
 * ith horizontal cut and similarly, and
 * verticalCuts[j] is the distance from the left of the rectangular cake to the
 * jth vertical cut.
 * Return the maximum area of a piece of cake after you cut at each horizontal
 * and vertical position provided in the arrays horizontalCuts and verticalCuts.
 * Since the answer can be a large number, return this modulo 109 + 7.
 */
class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        Arrays.sort(hc);
        Arrays.sort(vc);
        int maxh = Math.max(hc[0], h - hc[hc.length - 1]),
                maxv = Math.max(vc[0], w - vc[vc.length - 1]);
        for (int i = 1; i < hc.length; i++)
            maxh = Math.max(maxh, hc[i] - hc[i - 1]);
        for (int i = 1; i < vc.length; i++)
            maxv = Math.max(maxv, vc[i] - vc[i - 1]);
        return (int) ((long) maxh * maxv % 1000000007);
    }
}