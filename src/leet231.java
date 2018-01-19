import java.io.*;

class Solution231 {
    public boolean isPowerOfTwo(int n) {
        
    	
   System.out.println(Math.log(n)/Math.log(2));
   double d = Math.log(n)/Math.log(2);
   
   if(d==Math.ceil(d)) 
    	return true;
   else return false;
    }
}

public class leet231 {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            boolean ret = new Solution231().isPowerOfTwo(n);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}