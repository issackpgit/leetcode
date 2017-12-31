import java.io.*;

class Solution58 {
    public int lengthOfLastWord(String s) {
    	
// Solution 1 
//    	  String[] arr = s.split(" ");    
//    	  if(arr.length == 0) return 0;
//      return arr[arr.length-1].length();
    	 	
//Solution 2 
    	
    		int n= 0;
     	for(int i = s.length()-1 ;i>=0;i--) {
     	
         if(s.charAt(i)==' ') {
        	 	if(n!=0) 
        	 		return n;
         }
        	 else n++;
     	}
     	
    	return n;
    }
}

public class leet58 {
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
            String s = stringToString(line);
            
            int ret = new Solution58().lengthOfLastWord(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}