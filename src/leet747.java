//Author : Issac Koshy Panicker
//06-01-2018

import java.io.*;
import java.util.Arrays;


class Solution747 {
    public int dominantIndex(int[] nums) {
    
    	 int maxValue = nums[0], maxIndex = 0;
    	 
    	    for(int i=1;i < nums.length;i++){ 
    	      if(nums[i] > maxValue){ 
    	         maxValue = nums[i]; 
    	         maxIndex =i;
    	      } 
    	    } 
    	    
    	int flag =0;
    	Arrays.sort(nums);
    	for(int i =0;i<nums.length-1;i++) {
    		if(maxValue<nums[i]*2) {
    			flag =1;
    		}
    	}
    	
    	if(flag==1) return -1;
    	else 
    	return maxIndex;
    	
    }
}

public class leet747{
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
	            
	            int out = new Solution747().dominantIndex(nums);
	            
	            System.out.print(out);
	        }
	}
}