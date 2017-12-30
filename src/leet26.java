import java.io.*;
import java.util.*;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i =0;i<nums.length;i++) {

    		 if (!map.containsKey(nums[i])) {
    			map.put(nums[i],i);
    			}
    	}
    	
    	if (nums.length==0 || nums.length==1)
            return nums.length;
    	
    	int j=0;
    	for(int i =0;i<nums.length-1;i++) {
    		if(nums[i]!=nums[i+1]) {
   			nums[j++]=nums[i];
    		}
    	}
    	nums[j] = nums[nums.length-1];
 
    	
    	return j+1;
    }
}

public class leet26 {
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
            
            int ret = new Solution26().removeDuplicates(nums);
            String out = integerArrayToString(nums, ret);
            
            System.out.print(out);
        }
    }
}