//Author : Issac Koshy Panicker
//07-09-2018

import java.io.*;
import java.util.*;

class Solution516 {
    public int longestPalindromeSubseq(String s) {
      
    	return 0;
    }
}

public class leet516 {
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
            
            int ret = new Solution516().longestPalindromeSubseq(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}