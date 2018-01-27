//Author: Issac Koshy Panicker
//25-01-2018

import java.io.*;
import java.util.*;

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        
    	Set<Integer> set1 = new HashSet<Integer>();
    	Set<Integer> set2 = new HashSet<Integer>();
    
    	for(int i =0;i<nums1.length;i++) {
    		set1.add(nums1[i]);
    	}
    	for(int i =0;i<nums2.length;i++) {
    		if(set1.contains(nums2[i]))
    			set2.add(nums2[i]);
    	}
    	
    	int[] arr = new int[set2.size()];

    	int index = 0;

    	for( Integer i : set2 ) {
    	  arr[index++] = i; 
    	}
    	
    	return arr;
    }
}

public class leet349 {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
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
            int[] nums1 = stringToIntegerArray(line);
            line = in.readLine();
            int[] nums2 = stringToIntegerArray(line);
            
            int[] ret = new Solution349().intersection(nums1, nums2);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}