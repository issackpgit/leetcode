import java.io.*;
import java.util.*;

class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     
    	Arrays.sort(nums);
    	List<Integer> list = new LinkedList<Integer>();
    	
    	for(int i=1;i<nums.length;i++) {
    		if(nums[i-1]!=i && !list.contains(nums[i-1]))
    			{
//    			System.out.println(i);
    			list.add(i);
    			}
    			
    	}
    	
    return list;
    }
}

public class leet448 {
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
            int[] nums = stringToIntegerArray(line);
            
            List<Integer> ret = new Solution448().findDisappearedNumbers(nums);
            
            String out = integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}