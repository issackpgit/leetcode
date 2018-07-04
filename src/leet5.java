//Author : Issac Koshy Panicker
//06-28-2018

import java.io.*;
import java.util.*;

class Solution5 {
    public String longestPalindrome(String s) {
        
    		boolean dp[][] = new boolean[s.length()][s.length()];
    		
    		String ans = "";
    		int n = s.length();
    		
    		for(int i = n-1;i>=0;i--) {
    			for(int j = i;j<n;j++) {
    				
    				dp[i][j] = s.charAt(i)==s.charAt(j) && (j-i < 3 || dp[i+1][j-1]);
    				
    				if(dp[i][j] && j-i+1 > ans.length()) {
    					ans = s.substring(i, j+1);
    				}
    			}
    			
    		}
    	
    	return ans;
    }
}

public class leet5 {
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
            
            String ret = new Solution5().longestPalindrome(s);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}