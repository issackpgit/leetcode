//Author : Issac Koshy Panicker
//27-01-2018

import java.io.*;
import java.util.*;

class Solution409 {
    public int longestPalindrome(String s) {
        
    	
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	
    	for(int i =0;i<s.length();i++) {
    		map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
    	}
//    	if(map.size()==1) return s.length();
    	int count =0,flag = 0;
    	for(char c : map.keySet()) {
    		count+=map.get(c)/2;
    		
    		if(map.get(c)%2==1)flag =1;
    	}
    	count*=2;
    if(flag ==1) count++;
    	
    	return count;
    	
    }
}

public class leet409 {
    public static String stringToString(String input) {
        assert input.length() >= 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '\\') {
                char nextChar = input.charAt(i+1);
                switch (nextChar) {
                    case '\"': sb.append('\"'); break;
                    case '/' : sb.append('/'); break;
                    case '\\': sb.append('\\'); break;
                    case 'b' : sb.append('\b'); break;
                    case 'f' : sb.append('\f'); break;
                    case 'r' : sb.append('\r'); break;
                    case 'n' : sb.append('\n'); break;
                    case 't' : sb.append('\t'); break;
                    default: break;
                }
                i++;
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            
            int ret = new Solution409().longestPalindrome(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
