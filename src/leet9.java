import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution9 {
    public boolean isPalindrome(int x) {
        
         int rev = 0;
    int i;
        int temp1 =x;
    int flag =0;
    
    if(x<0) {flag =1;
    x = x*-1;
    }
    
    int temp=0;
    int newrev = 0;
    	for(;x!=0;x=x/10) {
    		i = x%10;
    		newrev = rev*10+i;
    		temp = (newrev - i)/10;
    		if(rev!=temp)
    			return false;
    		rev =newrev;
    	}
    	
    	if(flag==1)
    	 return false;
        
if(temp1 == rev)
    return true;
else 
    return false;
       
    }
}

public class leet9 {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            boolean ret = new Solution9().isPalindrome(x);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}