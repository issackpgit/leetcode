//Author: Issac Koshy Panicker
//24-01-2018

import java.io.*;

class Solution345 {
    public String reverseVowels(String s) {
        
    	
    	char[] c = s.toCharArray();
    	String v = "aeiouAEIOU";
    	
    	int left = 0;
    	int right = s.length()-1;
    	
    	while(left<right) {
    		if(v.indexOf(c[left])<0) {
    			left++;
    		}
    		if(v.indexOf(c[right])<0) {
    			right--;
    		}
    		if(v.indexOf(c[left])>=0&&v.indexOf(c[right])>=0) {
    			char temp = c[left];
    			c[left] = c[right];
    			c[right] = temp;
    			left++;
    			right--;
    		}
    	}
    	
    	return new String(c);
    }
}

public class leet345 {
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
            
            String ret = new Solution345().reverseVowels(s);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}