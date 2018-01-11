//Author : Issac Koshy Panicker
//10-01-2018

import java.io.*;
import java.util.*;

class Solution205 {
    public boolean isIsomorphic(String s, String t) {
    	
    	Map<Character, Character> map = new HashMap<Character, Character>();
        
    	for(int i =0;i<s.length();i++) {
    		if(map.containsKey(s.charAt(i))) {
    			if(map.get(s.charAt(i))==t.charAt(i)) {
    				continue;
    			}
    			else return false;
    		}
    		for(char j : map.keySet()) {
    			if(map.get(j)==t.charAt(i)) return false;
    		}
    		map.put(s.charAt(i), t.charAt(i));
    		
    	}
    	
    	return true;
    }
}

public class leet205 {
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
            
            boolean ret = new Solution205().isIsomorphic(s, t);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}