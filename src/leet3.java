//Author : Issac Koshy Panicker
//05-23-2018

import java.io.*;
import java.util.*;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
    
    	if(s.length()==1) {
    		return 1;
    	}
    if(s.length()==0) {
    		return 0;
    	}
    
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	int c = 0,i=0;
    	int temp =0;
    	for(i =0;i<s.length();i++) {
    		if(!map.containsKey(s.charAt(i))) {
    			map.put(s.charAt(i), c);
    			c++;
    		}
    		else {
    			if(c>temp)
    				temp =c;
    			System.out.println(s.substring(0, i));
    			int q = s.substring(0, i).lastIndexOf(s.charAt(i));
    			
    			map.clear();
    			c = 0;
    			i = q+1;
    			map.put(s.charAt(i), c);
    			c++;
    			
    		}
    	}
    	
    	
//    	if(temp == 0) return c;
    	
    	if(c>=temp)
    		return c;
    	else 
    		return temp;
//    	if(i == s.length()) {
//    		return c-1;
//    	}

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