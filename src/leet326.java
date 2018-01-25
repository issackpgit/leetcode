import java.io.*;

class Solution326 {
    public boolean isPowerOfThree(int num) {
    	
    	 return Integer.toString(num, 3).matches("^10*$");
    	              
//        return Math.log10(num)/Math.log10(3)%1==0 ;
       
    }
}

public class leet326 {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            boolean ret = new Solution326().isPowerOfThree(n);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}