//Author : Issac Koshy Panicker
//05-28-2018

import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Solution8 {
    private static final int INT_MIN = 0;

	public int myAtoi(String a) {
    	int c = 1;
		
	for(int i =0;i<a.length();i++) {
		if(Character.isLetter(a.charAt(i)) && c==1){
			return 0;
		}
		else if(Character.isDigit(a.charAt(i))) {
			c = 0;
		}
		if(c==1)
			return 0;
		
	}
	
	a = a.replaceAll("\\s[a-zA-Z]","");

	 BigInteger num = new BigInteger(a);
	 if(num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))>=1) {
		 return Integer.MAX_VALUE;
	 }
	 
//	 System.out.println(num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)));
	 if(num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE))<=0) {
		 return Integer.MIN_VALUE;
	 }
	 
		 
		 

//    	a = a.replaceAll("", "");
    	
    	System.out.println(a);
        if(a.length() == 0) return 0;

    	
    	if(a.contains(".")) {
    		return 0;
    	}
    
    	if(Long.parseLong(a)>Integer.MAX_VALUE)// || Long.parseLong(a)<Integer.MIN_VALUE)
    		return Integer.MAX_VALUE;
    	else if(Long.parseLong(a)<Integer.MIN_VALUE)
    		return Integer.MIN_VALUE;

    	return Integer.parseInt(a);
    }
}

public class leet8 {
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
            String str = stringToString(line);
            
            int ret = new Solution8().myAtoi(str);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}