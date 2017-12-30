import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution14 {
    public String longestCommonPrefix(String[] strs) {
    	
   int n = strs.length;
   if(strs == null || strs.length == 0)    return "";
   
   int min =strs[0].length();
   int index=0;
   int flag =0;
   String s="";
   
   for(int j=1;j<n;j++)
    	if(min>strs[j].length()) {
    		min = strs[j].length();
    		index = j;
    }
    
    int k =0;
    
	for(; k < strs[index].length(); k++) {
		flag = 0;
		for(int i = 0;i<n;i++) {
			if(strs[index].charAt(k)==strs[i].charAt(k)) {
			   	flag += 1;
			}
		}
		
		if(s.equals("")&& k==strs[index].length()-1 && min!=1)
	 		return ""; 
		
		if(flag == n ) {
		   s+=strs[index].charAt(k);
		}
	 	
   }
    	return s; 
    }
}

public class leet14 {

	public static void main(String[] args) throws IOException{
		
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("Enter the no of elements in an array:");
        int n = Integer.parseInt(in.readLine());
        String[] inp = new String[n];
        
        for (int i = 0; i < n; i++) {
            inp[i] = in.readLine();
        }

        String out = new Solution14().longestCommonPrefix(inp);
        
        System.out.println(out);
		
	}
	
	
}
