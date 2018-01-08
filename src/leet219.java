//Author : Issac Koshy Panicker
//07-01-2018

import java.io.*;
import java.util.*;

class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	
    	if(nums.length==0) return false;
    	if(nums.length==1 && k>0) return false;
       
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	int min = Integer.MAX_VALUE;
    	int flag = 0;
    	for(int i =0;i<nums.length;i++) {
    		if(map.containsKey(nums[i])) {
    			if(Math.abs(map.get(nums[i])-i)<min) min = Math.abs(map.get(nums[i])-i);;
    			map.put(nums[i], i);
    			flag =1;
    		}else
    			map.put(nums[i], i);
    	}
    	if(flag ==0) return false;
    	if(min<=k ) 
    		return true;
    	else
    		return false;	
    }
}

public class leet219 {
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
            
            boolean ret = new Solution219().containsNearbyDuplicate(nums, k);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}