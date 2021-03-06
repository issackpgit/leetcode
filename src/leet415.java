//Author : Issac Koshy Panicker
//27-01-2018

import java.io.*;

class Solution415 {
    public String addStrings(String num1, String num2) {
        
    	int diff = Math.abs(num1.length()-num2.length());
		String ab="";
		for(int i =0;i<diff;i++) {
			ab+="0";
		}
    	if(num1.length()>num2.length()) {
    		num2=ab+num2;
    	}
    	else {
    		num1 = ab+num1;
    	}
    	 StringBuilder sb = new StringBuilder();
         int carry = 0;
        
         for(int i =num1.length()-1, j = num2.length()-1; i>=0 || j>=0 || carry ==1; i--,j--) {
        	 	if(i<0 && j<0) {
        	 		sb.append(carry);
        	 		break;
        	 	}
        	 	int a = Character.getNumericValue(num1.charAt(i));
        	 	int b = Character.getNumericValue(num2.charAt(i));
        	 	sb.append((a+b+carry)%10);
        	 	carry = (a+b+carry)/10;
        	 	
         }
        return sb.reverse().toString();
    }
}

public class leet415 {
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
            String num1 = stringToString(line);
            line = in.readLine();
            String num2 = stringToString(line);
            
            String ret = new Solution415().addStrings(num1, num2);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}