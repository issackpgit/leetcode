//Author : Issac Koshy Panicker

import java.io.*;

class Solution53 {
    public int maxSubArray(int[] nums) {
     
    	int max = nums[0];
    int tempmax = nums[0];
    
// 	int max = 0; //Solution 2
//  int tempmax = 0; //Solution 2
//  int flag = 0; //Solution 2
    
    for(int i =1;i < nums.length; i++) {  // i should be 0 for solution 2
    		
//    		if(nums[i]>0) { //Solution 2
//    			flag = 1;//Solution 2
//    		} //Solution 2
    		
    		tempmax += nums[i];
    		if(tempmax<nums[i]) 
    			tempmax= nums[i];
    		
//    	if(tempmax<0)  //Solution 2
//   		tempmax = 0; //Solution 2
    		
    		if(max < tempmax)
    			max = tempmax ; 
    	}
    	
//    	if(flag == 0) {   //*Solution 2
//    		max = nums[0];
//            for(int i = 0; i < nums.length; i++)
//            {
//                if(max < nums[i])
//                {
//                    max = nums[i];
//                }
//            }
//    		
//    	} //*Solution 2
    	
    	return max;
    }
}

public class leet53 {
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
            
            int ret = new Solution53().maxSubArray(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}