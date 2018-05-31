//Author : Issac Koshy Panicker
//05-28-2018

import java.io.*;
import java.util.*;


class Solution6 {
    public String convert(String s, int n) {
        int len = s.length();
       
        char[] a = new char[len];
        for(int i =0;i<len;i++) {
        		a[i] = s.charAt(i);
        		
        }
    	
    	
    	return "";
    }
}

public class leet6 {
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
            line = in.readLine();
            int numRows = Integer.parseInt(line);
            
            String ret = new Solution6().convert(s, numRows);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}