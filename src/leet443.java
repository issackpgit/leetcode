import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

class Solution443 {
    public int compress(char[] chars) {
        
    	return 0;
    }
}
public class leet443{
	 public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int n =Integer.parseInt(in.readLine());
	        char[] c = new char[n];
	        for(int i =0;i<n;i++){
	        	c[i] = in.readLine().charAt(0);
	        }
	        int b = new Solution443().compress(c);
	    
	        	System.out.println(n);
	        
	 }
}

