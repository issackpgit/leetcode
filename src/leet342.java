//Author: Issac Koshy Panicker
//25-01-2018

import java.io.*;

class Solution342 {
    public boolean isPowerOfFour(int num) {
    		
    	return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;

    	
//    	return (Math.log(num)/Math.log(4) %1 ==0) ;
    	
    	
//    		if(num ==0) return false;
//        double a = Math.ceil((double)Math.log(num)/(double)Math.log(4));
//        if(Math.log(num)/Math.log(4)==a) return true;
//        else return false;
    }
}

public class leet342 {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            boolean ret = new Solution342().isPowerOfFour(num);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}