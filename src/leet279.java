//Author : Issac Koshy Panicker
//07-10-2018

import java.io.*;
import java.util.*;

class Solution279 {
    public int numSquares(int n) {
    	
    	int dp[] = new int[n+1];
    	Arrays.fill(dp, Integer.MAX_VALUE);
    	
    	dp[0] = 0;
    	
    	for(int i =1;i<=n;i++) {
        	int min = Integer.MAX_VALUE;
    		for(int j = 1; i-j*j>=0; j++) {
    			min = Math.min(dp[i-j*j]+1, min);
    		}
    		dp[i] = min;
    	}

        
    	return dp[n];
    }
}

public class leet279 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution279().numSquares(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}