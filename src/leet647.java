//Author : Issac Koshy Panicker
//07-09-2018

import java.io.*;
import java.util.*;

class Solution647 {
    public int countSubstrings(String s) {
        
    	return 0;
    }
}

public class leet647 {
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
            
            int ret = new Solution647().countSubstrings(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}