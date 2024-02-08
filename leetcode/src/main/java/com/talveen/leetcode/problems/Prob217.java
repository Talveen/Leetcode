package com.talveen.leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Date: 2/8/2024
 * Time: 1:21 PM
 * URL:
 */
public class Prob217 {

    public static void main(String[] args) {
        Prob217 prob217 = new Prob217();
        int[] nums = {1,2,3,1};
        System.out.println(prob217.containsDuplicate(nums));
    }

    private boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(numSet.contains(nums[i])){
                return true;
            }
            numSet.add(nums[i]);
        }
        return false;
    }
}
