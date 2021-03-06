//Author : Issac Koshy Panicker
//23-01-2018

import java.io.*;

class Solution171 {
    public int titleToNumber(String s) {
    	 int a =0;
    	   for(int i =0;i<s.length();i++) {
    	    	 a = a*26 + (int)s.charAt(i)-65+1;
    	    	}
    	    return a;
        
    }
}

public class leet171 {
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
            
            int ret = new Solution171().titleToNumber(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}