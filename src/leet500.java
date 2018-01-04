import java.io.*;
import java.util.*;

class Solution500 {
    public String[] findWords(String[] words) {
        
    	
    	
    	return null;
    }
}

public class leet500{
	public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        String[] inp = new String[n];
       
        for(int i =0;i<n ;i++) {
        	inp[i] = in.readLine();
        }
		
        String [] out = new Solution500().findWords(inp);
        
        for(int i =0;i<out.length ;i++) {
        		System.out.println(out[i]);        
        		}
		
	}
	
}
