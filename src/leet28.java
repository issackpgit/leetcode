import java.io.*;

class Solution28 {
    public int strStr(String haystack, String needle) {
    	
    	 
        if((needle.length() == 0 && haystack.length() == 0) || (needle.length()== 0)) return 0;
    	if((haystack.length()==0) || (needle.length()>haystack.length())) return -1;
        
    	int count = 0, k = 0, temp =-1;
    	
    	for(int i =0;i<haystack.length();i++) {
    			if(haystack.charAt(i) != needle.charAt(0)) {
    				continue;
    			}
    			else {
    				count =0;
    				k = i; 
    				temp = i;
    				
    				for(int j = 0 ; j<needle.length();j++)
    				{
    					if((k<haystack.length()) && (haystack.charAt(k) == needle.charAt(j)))
    						{count++;k++;}	
    				}
    			if((count == needle.length()) || (k == haystack.length())) break;
    			}
    	}
        
    	if(count == needle.length()) {
    		return temp;
    	} else return -1;
     	
    }
}

public class leet28 {
    public static String stringToString(String input) {
        assert input.length() >= 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '\\') {
                char nextChar = input.charAt(i+1);
                switch (nextChar) {
                    case '\"': sb.append('\"'); break;
                    case '/' : sb.append('/'); break;
                    case '\\': sb.append('\\'); break;
                    case 'b' : sb.append('\b'); break;
                    case 'f' : sb.append('\f'); break;
                    case 'r' : sb.append('\r'); break;
                    case 'n' : sb.append('\n'); break;
                    case 't' : sb.append('\t'); break;
                    default: break;
                }
                i++;
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String haystack = stringToString(line);
            line = in.readLine();
            String needle = stringToString(line);
            
            int ret = new Solution28().strStr(haystack, needle);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}