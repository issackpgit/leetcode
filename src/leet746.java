//Author : Issac Koshy Panicker
//07-05-2018

import java.io.*;
import java.util.*;

class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
    	
    	int f1=0, f2=0;
    	
    	for(int i =0;i<cost.length;i++) {
    		int f0 = cost[i] + Math.min(f1, f2); 
   		f2=f1;
   		f1=f0;
    	}
    	
    	return Math.min(f1, f2);
        
    }
}

public class leet746 {
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
            int[] cost = stringToIntegerArray(line);
            
            int ret = new Solution746().minCostClimbingStairs(cost);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}