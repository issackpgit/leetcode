//Author : Issac Koshy Panicker
//06-28-2018

import java.io.*;
import java.util.*;

class Solution718 {
    public int findLength(int[] A, int[] B) {
       
    	return 0;
    }
}

public class leet718 {
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
            int[] A = stringToIntegerArray(line);
            line = in.readLine();
            int[] B = stringToIntegerArray(line);
            
            int ret = new Solution718().findLength(A, B);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}