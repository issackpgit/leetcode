//Author : Issac Koshy Panicker
//06-01-2018

import java.io.*;
import java.util.*;

class Solution697 {
    public int findShortestSubArray(int[] nums) {
    	
    	Map<Integer,Integer> left = new HashMap<Integer,Integer>();
    	Map<Integer,Integer> right = new HashMap<Integer,Integer>();
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	
    	for(int i =0;i<nums.length;i++) {
    		int x  = nums[i]; 		
    		if(left.get(x)==null) left.put(x,i);
    		right.put(x, i);
    		if(map.containsKey(x)) {
    			map.put(x, map.get(x)+1);
    		}	else
    			map.put(nums[i], 1);
    	}
    	int n = nums.length;
    	int degree = Collections.max(map.values());
    	
    	for (int x: map.keySet()) {
    		if (map.get(x) == degree) {
    			n = Math.min(n, right.get(x)-left.get(x)+1);
    		}
    		
    	}
    	
    	
        
    	return n;
    }
}

public class leet697 {
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
            
            int ret = new Solution697().findShortestSubArray(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}