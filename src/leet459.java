//Author: Issac Koshy Panicker
//24-01-2018

import java.io.*;
import java.util.*;

class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
    int l =s.length();
    
    for(int i =l/2;i>0;i--) {
	    	if(l%i==0) {
	    		int m = l/i;
	    		String str = s.substring(0, i);
	    		StringBuffer sb = new StringBuffer();
	    		for(int j =0;j<m;j++) {
	    			sb.append(str);
	    		}
	    		if(s.equals(sb.toString())) return true;
	    	}
    }
    	return false;
    	
    }
}

public class leet459 {
    public static String stringToString(String input) {
        assert input.length() >= 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '\\') {
                char nextChar = input.charAt(i+1);
                switch (nextChar) {
                    case '\"': sb.append('\"'); break;
                    case '/' : sb.append('/'); break;
                    case '\\': sb.append('\\'); break;
                    case 'b' : sb.append('\b'); break;
                    case 'f' : sb.append('\f'); break;
                    case 'r' : sb.append('\r'); break;
                    case 'n' : sb.append('\n'); break;
                    case 't' : sb.append('\t'); break;
                    default: break;
                }
                i++;
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            
            boolean ret = new Solution459().repeatedSubstringPattern(s);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}