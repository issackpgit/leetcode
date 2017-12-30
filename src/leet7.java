import java.io.*;

class Solution7 {
    public int reverse(int x) 
    {
    int rev = 0;
    int i;
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
    			return 0;
    		rev =newrev;
    	}
    	
   
    	
    	if(flag==0)
    	 return rev;
    	else 
    		return -rev;
    }   
}

public class leet7 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution7().reverse(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}