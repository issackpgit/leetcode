//Author : Issac Koshy Panicker
// 01/01/2018

import java.io.*;

class Solution69 {
    public int mySqrt(int x) {
    	
//    	if(x == 1) return 1;
//    	if(x==0) return 0;
//    	
//    	long r =x; 
//    	int i = 0;
//    	while(i<=r/2) {
//    		if(i*i>r)
//    			break;
//    		else
//    			i++;
//    	}
//        return i-1;
    	
    	 if (x == 0 || x == 1)
             return x;
    	     	
    	int start = 1; int end =x/2; int ans = 0;
    	while(start<=end) {
    		int mid = (start+end)/2;
    		
    		if(mid==x/mid)
    			return mid;
    		
    		if(mid<x/mid) {
    			start = mid+1;
    			ans = mid;
    		}
    		else if(mid  >x/mid) {
    			end = mid-1;
    		}
    	}
    	return ans;
    }
}

public class leet69 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution69().mySqrt(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}