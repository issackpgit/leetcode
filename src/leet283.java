//Author : Issac Koshy Panicker
//03-01-2018

import java.io.*;

class Solution283 {
    public void moveZeroes(int[] nums) {
    
    	int c=0;
    	int j =0;
    	int n = nums.length-1;
    	for(int i = 0; i<nums.length;i++) {
    		if(nums[i]!=0) {
    		nums[j]=nums[i];
    		j++;
    		}
    		else
    			c++;
    	}    	
    	for(int i =0;i<c;i++) {
    		nums[n--]=0;
    	}
    }
}

public class leet283 {
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
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            new Solution283().moveZeroes(nums);
            String out = integerArrayToString(nums);
            
            System.out.print(out);
        }
    }
}