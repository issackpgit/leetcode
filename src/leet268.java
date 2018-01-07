//Author : Issac Koshy Panicker
//06-01-2018

import java.io.*;
import java.util.*;

class Solution268 {
    public int missingNumber(int[] nums) {
    	
    	 Set<Integer> numSet = new HashSet<Integer>();
         for (int num : nums) numSet.add(num);

         for (int i = 0; i < nums.length; i++) {
             if (!numSet.contains(i)) {
                 return i;
             }
         }
//    	Arrays.sort(nums);
//    	
//    	for(int i =0;i<nums.length;i++) {
//    		if(nums[i]!=i) {
//    			return i;
//    		}
//    		
//    	}
    	return nums.length;
    }
}

public class leet268 {
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
            
            int ret = new Solution268().missingNumber(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}