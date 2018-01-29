
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

class Solution443 {
    public int compress(char[] chars) {
     
        int count = 0, index = 0;
        
        for(int i =0;i<chars.length;i++) {
        		count++;
        		if(i == chars.length-1 || chars[i] != chars[i + 1] ) {
        			chars[index] = chars[i];
        			index++;
        			if(count!=1) {
        				String s = Integer.toString(count);
        				for(int j = 0;j<s.length();j++) 
        					{
        					chars[index] = s.charAt(j);
        					index++;
        					}
        			}
        		}
        }
      
		
    	return index;
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
	    
	        for(int i =0;i<b;i++)
	        	System.out.println(c[b]);
	        
	 }
}

