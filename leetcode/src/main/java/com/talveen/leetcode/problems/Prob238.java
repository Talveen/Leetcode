package com.talveen.leetcode.problems;

import java.util.Arrays;

/**
 * Date: 2/8/2024
 * Time: 2:11 PM
 * URL:
 */
public class Prob238 {
    public static void main(String[] args) {
        Prob238 prob238 = new Prob238();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(prob238.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int pro = 1;
        //calculate prod of all numbers
        for(int i : nums) {
            pro *= i;
        }
        //divide by number at position to find product of all other numbers
        for(int i = 0; i < n; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }
}
