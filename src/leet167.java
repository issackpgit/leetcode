//Author : Issac Koshy Panicker
//06-01-2018

import java.io.*;
import java.util.*;

class Solution167 {
    public int[] twoSum(int[] a, int target) {
    
    	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    	
    	int[] ret = new int[2];
    	
    	for(int i = 0;i<a.length;i++) {
    		map.put(a[i], i);
    	}
    	
    	for(int i = 0;i<a.length;i++) {
    		int temp = target - a[i];
    		if(map.containsKey(temp)) {
    			ret[0]=i+1;
    			ret[1]=map.get(temp)+1;
    			break;
    		}
    	}
    	
    	
    	return ret;
    }
}

public class leet167 {
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
            int[] numbers = stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            int[] ret = new Solution167().twoSum(numbers, target);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}