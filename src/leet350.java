//Author: Issac Koshy Panicker
//25-01-2018

import java.io.*;
import java.util.*;

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
    
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	ArrayList<Integer> set2 = new ArrayList<Integer>();
    
   
    	for(int i =0;i<nums1.length;i++) {
    		map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
    	}
    	for(int i =0;i<nums2.length;i++) {
    		if(map.containsKey(nums2[i]) && map.get(nums2[i])>0) {
    			set2.add(nums2[i]);
    			map.put(nums2[i], map.get(nums2[i])-1);
    		}
    	}
    		
    	
    	int[] arr = new int[set2.size()];

    	int index = 0;

    	for( Integer i : set2 ) {
    	  arr[index++] = i; 
    	}
    	
    	return arr;
        
    	
    }
}

public class leet350 {
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
            
            int[] ret = new Solution350().intersect(nums1, nums2);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}