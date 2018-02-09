import java.io.*;

class Solution441 {
    public int arrangeCoins(int n) {
        
    	
    	return 0;
    }
}

public class leet441 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution441().arrangeCoins(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}