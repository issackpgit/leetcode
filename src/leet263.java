//Author : Issac Koshy Panicker
//23-01-2018

import java.io.*;

class Solution263 {
    public boolean isUgly(int num) {
    	
    	for (int i=2; i<6 && num>0; i++)
    	    while (num % i == 0)
    	        num /= i;
    	return num == 1;
    	
//      	if(num <=0) return false;
//    	if(num ==1) return true;
//    	
//    if(num%2==0)
//    	 	return isUgly(num/2);
//    if(num%3==0)
//	 	return isUgly(num/3);
//    if(num%5==0)
//	 	return isUgly(num/5);
//    	
//		return false;
        
    }
}

public class leet263 {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            boolean ret = new Solution263().isUgly(num);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}