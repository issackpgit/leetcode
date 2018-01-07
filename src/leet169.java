import java.io.*;
import java.util.*;

class Solution169 {
    public int majorityElement(int[] nums) {
        
    	int n = nums.length/2;
    	
    	Map<Integer, Integer> map= new HashMap<Integer,Integer>();
    	
    	for(int i = 0;i<nums.length;i++) {
    		if(map.containsKey(nums[i])) {
    			map.put(nums[i], map.get(nums[i])+1);
    			if(map.get(nums[i])>n) {
    				return nums[i];
    			}
    		}
    			else
    			map.put(nums[i], 1);
    		
    	}
    	return 0;
    }
}

public class leet169 {
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
            
            int ret = new Solution169().majorityElement(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}