import java.io.*;

class Solution344 {
    public String reverseString(String s) {

    	char[] c = s.toCharArray();

    	int left = 0;
    	int right = s.length()-1;
    	
    while(left<right) {
	    	char temp = c[left];
	    	c[left] = c[right];
	    	c[right] = temp;
	    	left++;
	    	right--;
    }
    return new String(c);
    	
//    	return new StringBuffer(s).reverse().toString();

//    	String str="";
//    	
//    	for(int i = s.length()-1;i>=0;i--) {
//    		str+=s.charAt(i);
//    	}
//    	return str;
    }
}

public class leet344 {
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
            
            String ret = new Solution344().reverseString(s);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}