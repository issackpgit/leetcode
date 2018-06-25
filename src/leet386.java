//Author : Issac Koshy Panicker
//06-25-2018

import java.io.*;
import java.util.*;

class Solution386 {
    public List<Integer> lexicalOrder(int n) {
        
    	return null;
    }
}

public class leet386 {
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            List<Integer> ret = new Solution386().lexicalOrder(n);
            
            String out = integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}