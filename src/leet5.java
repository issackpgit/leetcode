//Author : Issac Koshy Panicker
//06-28-2018

import java.io.*;
import java.util.*;

class Solution5 {
    public String longestPalindrome(String s) {
        
    	return null;
    }
}

public class leet5 {
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
            
            String ret = new Solution5().longestPalindrome(s);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}