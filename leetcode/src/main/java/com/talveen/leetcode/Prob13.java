package com.talveen.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 2/4/2024
 * Time: 2:56 PM
 * URL:https://leetcode.com/problems/roman-to-integer/description/
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M
        Prob13 prob13 = new Prob13();
        String s = "MCMXCIV";
        System.out.println(prob13.romanToInt(s));


    }
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I", 1);map.put("V", 5);map.put("X", 10);
        map.put("L", 50);map.put("C", 100);map.put("D", 500);map.put("M", 1000);
        char[] chars = s.toCharArray();
        int num = 0; int i = s.length()-1;
        while(i>=0){
            num = num + map.get(String.valueOf(s.charAt(i)));
            i--;
        }
        return num;
    }
}
