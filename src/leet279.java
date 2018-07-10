//Author : Issac Koshy Panicker
//07-10-2018

import java.io.*;
import java.util.*;

class Solution279 {
    public int numSquares(int n) {
        
    	return 0;
    }
}

public class leet279 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution279().numSquares(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}