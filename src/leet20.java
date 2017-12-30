import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution20 {
    public boolean isValid(String s) {
    	
    Map<Character, Character> map = new HashMap<Character, Character>();   
    map.put('(',')');
    map.put('{','}');        
    map.put('[',']');
    
    Stack<Character> stack = new Stack<Character>();
    
    char[] arr = s.toCharArray();
    char c ; 
    int count =0;
    
    if(arr.length%2 !=0) return false;
    
    for(int i = 0; i < arr.length; i++) {
    
    	if(i==0 && map.get(arr[i])==null) return false;
    		
    	if(map.get(arr[i])!=null) {
        	stack.push(arr[i]);
    	}
    	else if(!stack.empty())
    	{
    	   c = stack.pop();
       if(map.get(c)==arr[i]) {
    	   count++;
       }
    	}
    	else return false;
    }
    if(count == arr.length/2)
    	return true;
    else return false;
    }
}

public class leet20 {
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            
            boolean ret = new Solution20().isValid(s);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}