package org.dsa.arrays;

/** https://leetcode.com/problems/concatenation-of-array/ **/

public class concatenation {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        getConcatenation(nums);
    }

    private static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int index = 0;

        for (int i = 0 ; i < 2; i ++) {
            for (int j = 0; j < nums.length; j ++) {
                ans[index] = nums[j];
                index ++;
            }
        }

        System.out.println("answer is" + ans);
        return ans;
    }
}
