//Author : Issac Koshy Panicker
//07-07-2018

import java.io.*;
import java.util.*;


class Solution338 {
    public int[] countBits(int num) {
        
    	return null;
    }
}

public class leet338 {
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            int[] ret = new Solution338().countBits(num);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}