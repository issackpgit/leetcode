//Author : Issac Koshy Panicker
//Year : 2017

import java.io.*;

class Solution38 {
    public String countAndSay(int n) {
        
    	return null;
    }
}

public class leet38 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            String ret = new Solution38().countAndSay(n);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}