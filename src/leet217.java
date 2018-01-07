//Author : Issac Koshy Panicker
//06-01-2018

import java.io.*;
import java.util.*;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        
    	Map<Integer, Integer> map = new HashMap<Integer,Integer>();
    	
    	for(int i =0;i<nums.length;i++) {
    		map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
    		if(map.get(nums[i])>1) return true;
    	}
    	return false;
    }
}

public class leet217 {
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            boolean ret = new Solution217().containsDuplicate(nums);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}