//Author: Issac Koshy Panicker
//25-01-2018

import java.io.*;

class Solution371 {
    public int getSum(int a, int b) {
       
      return b==0? a : getSum(a^b, (a&b)<<1);  
    }
}

public class leet371 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int a = Integer.parseInt(line);
            line = in.readLine();
            int b = Integer.parseInt(line);
            
            int ret = new Solution371().getSum(a, b);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}