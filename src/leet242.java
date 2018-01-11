//Author : Issac Koshy Panicker
//10-01-2018

import java.io.*;
import java.util.*;

class Solution242 {
    public boolean isAnagram(String s, String t) {
    		Map<Character, Integer> map = new HashMap<Character,Integer>();
    		
    		if(s.length()!=t.length()) return false;
    	
    		for(int i =0;i<s.length();i++) {
    			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
    		}
    		
    		for(int i =0;i<t.length();i++) {
    			if(map.containsKey(t.charAt(i))) {
    				map.put(t.charAt(i), map.get(t.charAt(i))-1);
    			}
    		}
    		
    		for(char i : map.keySet()) {
    			if(map.get(i)>0) return false;
    		}
    	
    	
    	return true;
    }
}

public class leet242 {
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            line = in.readLine();
            String t = stringToString(line);
            
            boolean ret = new Solution242().isAnagram(s, t);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}