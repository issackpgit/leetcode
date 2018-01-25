//Author: Issac Koshy Panicker
//24-01-2018

import java.io.*;

class Solution520 {
    public boolean detectCapitalUse(String word) {
        
    	if(word.toUpperCase().equals(word)) return true;
    	if(word.toLowerCase().equals(word)) return true;
    	
    	if(Character.toUpperCase(word.charAt(0))==word.charAt(0)&& word.substring(1, word.length()).toLowerCase().equals(word.substring(1, word.length()))) return true;
    	
    	
    	return false;
    }
}

public class leet520 {
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
            String word = stringToString(line);
            
            boolean ret = new Solution520().detectCapitalUse(word);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}