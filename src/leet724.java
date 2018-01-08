//Author : Issac Koshy Panicker
//07-01-2018

import java.io.*;

class Solution724 {
    public int pivotIndex(int[] nums) {
   
    	int sum = 0 , leftsum = 0,rightsum = 0;
    	for(int item : nums) sum+=item;
    	
    	for(int i = 0;i<nums.length;i++) {
    		rightsum = sum - leftsum - nums[i];
    		if(rightsum == leftsum) return i;
    		leftsum += nums[i];
    	}
    	return -1;
    }
}

public class leet724 {
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
            
            int ret = new Solution724().pivotIndex(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}