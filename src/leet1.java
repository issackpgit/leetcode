import java.io.BufferedReader;
import java.io.*;
import java.util.*;
class Solution {
	
//    public int[] twoSum(int[] nums, int target) {
//    	int p[]=new int[2];
//    	int length = nums.length;
//    	int flag =1;
//    	for(int i = 0;i<length;i++)
//    	{
//    		for(int j=1;j<length;j++)
//    		{
//    			if(nums[i]+nums[j]==target)
//    				{
//    				p[0] = j;
//    				p[1] = i;
//    				flag =0;
//    				}
//    			   
//    		}
//    		if(flag ==0) {
//    			break;
//    		}
//    	}
//        return p;
//    }
	
	public int[] twoSum(int[]nums,int target) {
	
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		
	     int p[] = new int[2];
		for(int i=0;i<nums.length;i++) {
			int c = target-nums[i];
			if(map.containsKey(c)&&map.get(c)!=i) {
				p[0]=map.get(c);
				p[1]=i;
			}
		}
		
		return p;
		
	}
}

public class leet1 {
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

            line = in.readLine();
            int target = Integer.parseInt(line);
            
            int[] ret = new Solution().twoSum(nums, target);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}