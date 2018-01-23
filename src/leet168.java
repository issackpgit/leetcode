//Author : Issac Koshy Panicker
//23-01-2018

import java.io.*;

class Solution168 {
    public String convertToTitle(int n) {
       
    	 StringBuilder result = new StringBuilder();

         while(n>0){
             n--;
             result.append((char)('A' + n % 26));
             n /= 26;
         }

         return result.reverse().toString();
    }
}

public class leet168 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            String ret = new Solution168().convertToTitle(n);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}