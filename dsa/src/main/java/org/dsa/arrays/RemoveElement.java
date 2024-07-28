package org.dsa.arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] myArray = {0,0,1,1,1,2,2,3,3,4};
        removeElement(myArray,2);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k ++;
            }
        }

        System.out.println(k);
        return k;
    }
}
