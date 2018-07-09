//Author : Issac Koshy Panicker
//07-09-2018

import java.io.*;
import java.util.*;

class Solution647 {
    public int countSubstrings(String s) {
    	
    	int n = s.length();
    	int ans =0;
    	
    	for(int c = 0;c <2*n-1;c++) {
    		int left = c/2;
    		int right = left +c%2;
    		while(left>=0 && right < n && s.charAt(left)==s.charAt(right)) {
    			ans++;
    			left--;
    			right++;
    			
    		}
    	}
        
    	return ans;
    }
}

public class leet647 {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            
            int ret = new Solution647().countSubstrings(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}