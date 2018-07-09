//Author : Issac Koshy Panicker
//07-09-2018

import java.io.*;
import java.util.*;

class Solution516 {
    public int longestPalindromeSubseq(String s) {
    	
    	 int[][] dp = new int[s.length()][s.length()];
    	 
    	 int n = s.length();
    	 for(int i = n-1;i>=0;i--) {
    		 for(int j =i+1;j<n;j++) {
    			 
    			 if(s.charAt(i)==s.charAt(j)) {
    				 dp[i][j] = dp[i+1][j-1]+2;		 
    			 }
    			 else {
    				 dp[i][j]= Math.max(dp[i+1][j], dp[i][j-1]);
    			 }
    			 
    		 }
    		 
    	 }
      
    	return dp[0][n-1];
    }
}

public class leet516 {
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
            
            int ret = new Solution516().longestPalindromeSubseq(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}