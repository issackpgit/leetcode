//Author : Issac Koshy Panicker
//05-28-2018

import java.io.*;
import java.util.*;

class Solution8 {
    public int myAtoi(String str) {
        
    	return 0;
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