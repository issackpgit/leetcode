//Author : Issac Koshy Panicker
//08-01-2018

import java.io.*;
import java.util.*;

class Solution136 {
    public int singleNumber(int[] nums) {
    		int result = 0;
    	    for (int i = 0; i<nums.length; i++)
    	    {
    			result ^=nums[i];
    	    }
    		return result;
    	
//    		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
//    		
//    		for(int i =0;i<nums.length;i++) {
//    			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//    		}
//    		
//    		for(int i :map.keySet()) {
//    			if(map.get(i)==1) return i;
//    		}
//    	
//    	return 0;
    }
}

public class leet136 {
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution136().singleNumber(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}