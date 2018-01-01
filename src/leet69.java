import java.io.*;

class Solution69 {
    public int mySqrt(int x) {
        return 0;
    }
}

public class leet69 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution69().mySqrt(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}