//Author : Issac Koshy Panicker
//08-01-2018

import java.io.*;

class Solution198 {
    public int rob(int[] nums) {
        
    	if(nums.length==0) return 0;
    	if(nums.length==1) return nums[0];
    	if(nums.length==2) return Math.max(nums[0], nums[1]);
    	
    	int[] dp = new int[nums.length];
    	
    	dp[0]=nums[0];
    	dp[1]=Math.max(nums[0], nums[1]);
    	
    	for(int i =2;i<nums.length;i++) {
    		dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
    	}
    	
    	
    	return dp[nums.length-1];
    }
}

public class leet198 {
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
            
            int ret = new Solution198().rob(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}