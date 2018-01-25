//Author: Issac Koshy Panicker
//25-01-2018

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution389 {
    public char findTheDifference(String s, String t) {
    	
    int cd = t.charAt(t.length()-1);
    
    for(int i =0;i<s.length();i++) {
    	cd-=(int)s.charAt(i);
    	cd+=(int)t.charAt(i);
    }
    return (char)cd;

//    int c = 0,d=0;
//    for(int i =0;i<s.length();i++) {
//    	c+=(int)s.charAt(i);
//    }
//    for(int i =0;i<t.length();i++) {
//    	d+=(int)t.charAt(i);
//    }
//    	
//    return  (char) (d-c);
    }
}

public class leet389{
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
            
            char ret = new Solution389().findTheDifference(A, B);
           
            System.out.print(ret);
        }
    }
}