//Author : Issac Koshy Panicker
//23-01-2018

import java.io.*;

class Solution172 {
    public int trailingZeroes(int n) {
    	 if(n==0) return 0;
        
    	int k = (int) Math.floor(Math.log(n)/Math.log(5));
    	
    	int no =0,t=5;
    	while(k!=0) {
    		no+= Math.floor(n/t);
    		t*=5;
    		k--;
    	}
    	
    	return no;
    }
}

public class leet172 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution172().trailingZeroes(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}