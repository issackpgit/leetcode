//Author : Issac Koshy Panicker
//23-01-2018

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
    	
    	 int result = 0;
    	    for (int i = 0; i < 32; i++) {
    	        result += n & 1;
    	        n >>>= 1;   // CATCH: must do unsigned shift
    	        if (i < 31) // CATCH: for last digit, don't shift!
    	            result <<= 1;
    	    }
    	    return result;
    }
}

public class leet190{
	public static void main(String[] args)throws IOException{
		
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String line;
	        	
	        	line = in.readLine();
	        	
	        	int n = new Solution190().reverseBits(Integer.parseInt(line));
	        	
	        	System.out.println(n);
	        	
	}
}