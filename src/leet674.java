//Author : Issac Koshy Panicker
//07-01-2018

import java.io.*;

class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
    	
    	if(nums.length ==0) return 0;
  
    	int max =1,a=0,diff=0,i=0;
    	
    	for(i =0;i<nums.length;i++) {
    		if(i>0 && nums[i-1]>=nums[i]) {
    			diff = i-a;
    			a = i;
    			if(diff>max) max =diff;
    		} 		
    	}
    		return Math.max(max, i-a);

    }
}

public class leet674 {
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
            
            int ret = new Solution674().findLengthOfLCIS(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}