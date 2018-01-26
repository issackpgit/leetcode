//Author: Issac Koshy Panicker
//25-01-2018

import java.io.*;

class Solution367 {
    public boolean isPerfectSquare(int num) {
        
    	 int i = 1;
         while (num > 0) {
             num -= i;
             i += 2;
         }
         return num == 0;
    }
}

public class leet367 {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            boolean ret = new Solution367().isPerfectSquare(num);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}