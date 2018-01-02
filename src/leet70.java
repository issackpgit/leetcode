//Author : Issac Koshy Panicker
//01/01/2018

import java.io.*;

class Solution70 {
    public int climbStairs(int n) {
    	
    
    	if(n==0) return 0;
    	n++;
    	
//    	int f[] = new int[n+1];
//        int i;
//          
//        f[0] = 0;
//        f[1] = 1;
//         
//        for (i = 2; i <= n; i++)
//        {
//            f[i] = f[i-1] + f[i-2];
//        }
//          
//    	return f[n];
    
     int a = 0, b = 1, c;
           
     for (int i = 2; i <= n; i++)
       {
    	 	c = a + b;
        a = b;
        b = c;
       }
     return b;        
        
    }
}

public class leet70 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution70().climbStairs(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}