//Author : Issac Koshy Panicker
//07-18-2018

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        
        
        return false;
    }
}

public class leet290 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String line,line1;
	        line = in.readLine();
	        line1 = in.readLine();
	        
	        boolean b = new Solution290().wordPattern(line,line1);
	        
	        System.out.println(b);
	       
}
}
