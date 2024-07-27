package org.dsa.arrays;

/**
 * Leetcode link - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * Remove Duplicates from Sorted Array.
 * */

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] myArray = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(myArray);
    }

    public static int removeDuplicates(int[] nums) {
        int leftPointer = 1;
        int rightPointer = 1;

        while (rightPointer < nums.length) {
            if (nums[rightPointer] != nums[rightPointer - 1]) {
                nums[leftPointer] = nums[rightPointer];
                leftPointer ++;
            }

            rightPointer ++;
        }
        return leftPointer;
    }
}
