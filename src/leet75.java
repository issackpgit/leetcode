//Author : Issac Koshy Panicker
//07-20-2018

import java.io.*;
import java.util.*;

class Solution75 {
    public void sortColors(int[] nums) {
    	
    	
    	 int p1 = 0, p2 = nums.length - 1, index = 0;
    	    while (index <= p2) {
    	        if (nums[index] == 0) {
    	            nums[index] = nums[p1];
    	            nums[p1] = 0;
    	            p1++;
    	        }
    	        if (nums[index] == 2) {
    	            nums[index] = nums[p2];
    	            nums[p2] = 2;
    	            p2--;
    	            index--;
    	        }
    	        index++;
    	    }
//    	int count0 = 0, count1 = 0, count2 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {count0++;}
//            if (nums[i] == 1) {count1++;}
//            if (nums[i] == 2) {count2++;}
//        }
//        for(int i = 0; i < nums.length; i++) {
//            if (i < count0) {nums[i] = 0;}
//            else if (i < count0 + count1) {nums[i] = 1;}
//            else {nums[i] = 2;}
//        }
    	
    }
}

public class leet75 {
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
            
            new Solution75().sortColors(nums);
            String out = integerArrayToString(nums);
            
            System.out.print(out);
        }
    }
}