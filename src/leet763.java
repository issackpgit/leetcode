//Author : Issac Koshy Panicker
//06-20-2018

import java.io.*;
import java.util.*;

class Solution763 {
    public List<Integer> partitionLabels(String S) {
    	
    	return null;
        
    }
}

public class leet763 {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.toString();
    }
    
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String S = stringToString(line);
            
            List<Integer> ret = new Solution763().partitionLabels(S);
            
            String out = integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}