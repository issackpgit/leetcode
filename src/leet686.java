//Author: Issac Koshy Panicker
//24-01-2018

import java.io.*;

class Solution686 {
    public int repeatedStringMatch(String A, String B) {
     
    	StringBuffer sb = new StringBuffer(A);
    	int q=1;
    	for(;sb.length()<B.length();q++) sb.append(A);
   
    	if(sb.indexOf(B)>=0) return q;
    	if(sb.append(A).indexOf(B)>=0) return q+1;
        
        return -1;
    	
    }
}

public class leet686 {
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
            String A = stringToString(line);
            line = in.readLine();
            String B = stringToString(line);
            
            int ret = new Solution686().repeatedStringMatch(A, B);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}