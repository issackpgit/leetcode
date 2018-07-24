//Author : Issac Koshy Panicker
//07-24-2018

import java.io.*;
import java.util.*;

class Solution875 {
    public int minEatingSpeed(int[] piles, int H) {
        
    	return 0;
    }
}

public class leet875 {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] piles = stringToIntegerArray(line);
            line = in.readLine();
            int H = Integer.parseInt(line);
            
            int ret = new Solution875().minEatingSpeed(piles, H);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}