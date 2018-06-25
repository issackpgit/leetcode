//Author : Issac Koshy Panicker
//06-22-2018

import java.io.*;
import java.util.*;

class Solution220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	int min = Integer.MAX_VALUE;
    	int flag = 0;
    	
    	for(int i =0;i<nums.length;i++) {
    		
    	}
    		
    		return false;
    }
}

public class leet220 {
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            line = in.readLine();
            int t = Integer.parseInt(line);
            
            boolean ret = new Solution220().containsNearbyAlmostDuplicate(nums, k, t);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}