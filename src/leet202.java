import java.io.*;

class Solution202 {
    public boolean isHappy(int n) {
     
    	
    	return false;
    }
}

public class leet202 {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            boolean ret = new Solution202().isHappy(n);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}