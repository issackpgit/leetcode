//Author : Issac Koshy Panicker
//07-11-2018

import java.io.*;
import java.util.*;

class Solution646 {
    public int findLongestChain(int[][] pairs) {
    	Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        
        int N = pairs.length;
        int[] dp = new int[N];
        Arrays.fill(dp, 1);
        
        for(int i =1;i<N;i++) {
     	   	for(int j =0;j<i;j++) {
            if (pairs[j][1] < pairs[i][0]) {
                 	dp[i] = Math.max(dp[i], dp[i]+1);
            }
     	   	}
        }
        int ans =0;

        for(int x:dp) {
     	   	if(x>ans) ans =x;
        }
        
        
     	return ans;    }
}

public class leet646 {
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
    
//    public static int[][] stringToInt2dArray(String input) {
//        JsonArray jsonArray = JsonArray.readFrom(input);
//        if (jsonArray.size() == 0) {
//          return new int[0][0];
//        }
//    
//        int[][] arr = new int[jsonArray.size()][];
//        for (int i = 0; i < arr.length; i++) {
//          JsonArray cols = jsonArray.get(i).asArray();
//          arr[i] = stringToIntegerArray(cols.toString());
//        }
//        return arr;
//    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int[][] pairs = new int[8][2];
        for(int i =0;i<8;i++) {
	        	for(int j =0;j<2;j++) {
	        		pairs[i][j] = Integer.parseInt(in.readLine());
	        	}
        }
//        while ((line = in.readLine()) != null) {
//            int[][] pairs = stringToInt2dArray(line);
            
            int ret = new Solution646().findLongestChain(pairs);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
//        }
    }
}