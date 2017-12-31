//Author : Issac Koshy Panicker

import java.io.*;

class Solution66 {
    public int[] plusOne(int[] digits) {
    
	int c = 0;
	
	for(int i = digits.length-1 ; i>=0;i--) {
		if(digits[i]!=9) {
			digits[i] += 1; 
			break;
		}
		digits[i] = 0;
		c++;	
	}
			
	if(c == digits.length) {
		int[] d = new int[c+1];
		d[0] = 1;
		return d;
	}
		
	return digits;
    	
    }
}

public class leet66 {
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
            int[] digits = stringToIntegerArray(line);
            
            int[] ret = new Solution66().plusOne(digits);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}