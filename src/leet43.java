//Author : Issac Koshy Panicker
//06-20-2018

import java.io.*;
import java.util.*;

class Solution43 {
    public String multiply(String num1, String num2) {
    	int c = 0;
    	int[] arr = new int[num1.length()+num2.length()];
    		for(int i = num1.length()-1;i>=0;i--) {
    			for(int j =num2.length()-1;j>=0;j--) {
    				int temp = Integer.parseInt(String.valueOf(num1.charAt(i))) * Integer.parseInt(String.valueOf(num2.charAt(j)))  ;
    				int t = temp + arr[i+j+1];
    				
    				arr[i+j] += t / 10;
    				arr[i+j+1] = t % 10;
  
    			}
    		}
    	
    		StringBuilder sb = new StringBuilder();
    	    for(int p : arr) if(!(sb.length() == 0 && p == 0)) sb.append(p);
    	    return sb.length() == 0 ? "0" : sb.toString();
//    	    	return Arrays.toString(arr);
    }
}

public class leet43 {
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
            String num1 = stringToString(line);
            line = in.readLine();
            String num2 = stringToString(line);
            
            String ret = new Solution43().multiply(num1, num2);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}