//Author : Issac Koshy Panicker
//06-11-2018

import java.io.*;
import java.util.*;

class Solution152 {
    public int maxProduct(int[] nums) {
      int max =nums[0],min = nums[0],t = nums[0];
        for(int i =1;i<nums.length;i++){
            int temp = max;
            max = Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
            min = Math.min(Math.min(temp*nums[i],min*nums[i]),nums[i]);        
            if(t<max){
                t=max;
            }
        }
        return t;
    }
}

public class leet152 {
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
            
            int ret = new Solution152().maxProduct(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}