//Author : Issac Koshy Panicker
//06-27-2018

import java.io.*;
import java.util.*;

class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        
    		int left =0;
    		int sum =0;
    		int ans = Integer.MAX_VALUE;
    		
    		for(int i =0;i<nums.length;i++) {
    			sum+=nums[i];
    			
    			while(sum>=s) {
    				ans = Math.min(ans, i-left+1);
    				sum -= nums[left];
    				left++;
    			}
    		}
    	
    	
    		return (ans != Integer.MAX_VALUE) ? ans : 0;
    		
    }
}

public class leet209 {
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
            int s = Integer.parseInt(line);
            line = in.readLine();
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution209().minSubArrayLen(s, nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}