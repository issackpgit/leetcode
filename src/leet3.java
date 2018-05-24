//Author : Issac Koshy Panicker
//05-23-2018

import java.io.*;
import java.util.*;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        
    	
    	
    	return 0;
    }
}

public class leet3 {
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
            
            int ret = new Solution3().lengthOfLongestSubstring(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}