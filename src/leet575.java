//Author : Issac Koshy Panicker
//04-01-2018

import java.io.*;
import java.util.*;

class Solution575 {
    public int distributeCandies(int[] candies) {
    	
//    	Arrays.sort(candies);
//    	
//    	int c = 0;
//    	
//    	for(int i =1;i<candies.length && c<candies.length/2;i++) {
//    		if(candies[i]>candies[i+1]) {
//    			c++;
//    		}
//    	}
//        
//    	return c;
    	
    	Set<Integer> set = new HashSet<Integer>();
    	
    	for(int item : candies) set.add(item);
    	
    	if(set.size()>=candies.length/2) {
    		return candies.length/2;
    	}
    	else return set.size();
    	
    	
    }
}

public class leet575 {
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
            int[] candies = stringToIntegerArray(line);
            
            int ret = new Solution575().distributeCandies(candies);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}