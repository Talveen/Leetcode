package com.talveen.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Date: 2/4/2024
 * Time: 9:15 AM
 * URL: https://leetcode.com/problems/two-sum/
 */
public class Prob1 {
    public static void main(String[] args) {
        int[] nums = {3,2,4}; int target = 6;
        Prob1 prob1 =  new Prob1();
        int[] ans = prob1.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                ans[1] = i; ans[0]=map.get(target-nums[i]);
                return ans;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
