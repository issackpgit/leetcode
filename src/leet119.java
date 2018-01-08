//Author : Issac Koshy Panicker
//07-01-2018

import java.io.*;
import java.util.*;

class Solution119 {
    public List<Integer> getRow(int n) {
    	
    List<Integer> temp = new ArrayList<Integer>();

    for(int i =1;i<=n+1;i++) {
    		List<Integer> list = new ArrayList<Integer>();
    		for(int j = 1; j <= i ; j++) {
    			if(j==1 || j == i) {
    				list.add(1);
    			}
    			else
    			{
    				list.add(temp.get(j-2)+temp.get(j-1));
    			}	
    		}
    		temp = list;
    	}
    	
    return temp;
        
    }
}

public class leet119 {
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
            int rowIndex = Integer.parseInt(line);
            
            List<Integer> ret = new Solution119().getRow(rowIndex);
            
            String out = integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}