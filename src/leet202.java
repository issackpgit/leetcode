import java.io.*;
import java.util.*;

class Solution202 {
    public boolean isHappy(int n) {
   
//    	    int slow, fast;
//    	    slow = fast = n;
//    	    do {
//    	        slow = digitSquareSum(slow);
//    	        fast = digitSquareSum(fast);
//    	        fast = digitSquareSum(fast);
//    	    } while(slow != fast);
//    	    
//    	    if (slow == 1) return true;
//    	    else return false;
    	
    	Set<Integer> set = new HashSet<Integer>();
   	
    	int temp = 0,s=0; 
    	while(set.add(n)) {
	    	while(n!=0) {
	    		int a = n%10;
	    		s+= a*a;
	    		n = n/10;
	    		temp =s;
	    	}
	    	if(s == 1) {
	    		return true;
	    	}
	    	else {
	    		n = temp;
	    		s=0;
	    	}
	  		
    	}
    	
    	return false;
    }
//    public int digitSquareSum(int n) {
//	    int sum = 0, tmp;
//	    while (n>0) {
//	        tmp = n % 10;
//	        sum += tmp * tmp;
//	        n /= 10;
//	    }
//	    return sum;
//	}
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