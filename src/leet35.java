//Author : Issac Koshy Panicker
//Year : 2017

import java.io.*;

class Solution35 {
    public int searchInsert(int[] nums, int target) {
    
    	int low = 0, high = nums.length-1;
    	
    	while(low<=high) {
    		int mid = (low+high) / 2 ; 
    		if(nums[mid] == target) return mid; 
    		else if(nums[mid]<target) low = mid+1;
    		else high = mid -1; 
    	}
    	
    	return low;
    }
    
//    public int binarySearch(int[] nums, int l, int r, int x) { 	
//   
//        if (r>l)
//        {
//            int mid = l + (r - l)/2;          
//            if (nums[mid] == x)
//               return mid;
//            if (nums[mid] > x)
//               return binarySearch(nums, l, mid-1, x);
//            return binarySearch(nums, mid+1, r, x);
//        }
//        
//        return l;   	
//    }
    
}

public class leet35 {
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
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            int ret = new Solution35().searchInsert(nums, target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}