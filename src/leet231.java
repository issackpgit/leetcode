//Author : Issac Koshy Panicker
//19-01-2018

import java.io.*;

class Solution231 {
    public boolean isPowerOfTwo(int n) {
 
    	 if (n == 0)
             return false;
          
         while (n != 1)
         {
             if (n % 2 != 0)
                 return false;
             n = n / 2;
         }
         return true; 
         
//   double d = Math.log(n)/Math.log(2);
//   
//   if(d==Math.ceil(d)) 
//    	return true;
//   else return false;
    }
}

public class leet231 {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            boolean ret = new Solution231().isPowerOfTwo(n);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}