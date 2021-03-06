//Author : Issac Koshy Panicker
//03-01-2018

import java.io.*;

class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        
    	int max = 0, sum = 0;
    	for(int i =0; i< nums.length;i++) {
    		if(nums[i]==1) {
    			sum++;
    		}
    	
    	if(sum>max) {
    		max = sum;
    	}
    	if(nums[i]==0)
		sum =0;
    		
    	}
    	return max;
    }
}

public class leet485 {
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
            
            int ret = new Solution485().findMaxConsecutiveOnes(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}