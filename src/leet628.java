//Author : Issac Koshy Panicker
//06-01-2018

import java.io.*;
import java.util.Arrays;

class Solution628 {
    public int maximumProduct(int[] nums) {
        
    	Arrays.sort(nums);
    	
    	return Math.max(nums[0]*nums[1]*nums[nums.length-1], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
}


public class leet628 {
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
            
            int ret = new Solution628().maximumProduct(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}