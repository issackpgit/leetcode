//Author : Issac Koshy Panicker
//08-01-2018

import java.io.*;

class Solution414 {
    public int thirdMax(int[] nums) {
        
    	Integer max1= null;
    	Integer max2= null;
    	Integer max3= null;
    		
    	for(Integer item : nums) {
    		 if (item.equals(max1) || item.equals(max2) || item.equals(max3)) continue;
    		 
    		 if(max1==null || item>max1) {
    			max3=max2;
    			max2=max1;
    			max1=item;
    		}
    		else if(max2==null || item>max2 ) {
    			max3=max2;
    			max2=item;
    		}
    		else if(max3==null ||item>=max3) {
    			max3=item;
    		}
    	}
    	 return max3 == null ? max1 : max3;
    }
}

public class leet414 {
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
            
            int ret = new Solution414().thirdMax(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}