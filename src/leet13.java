import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Solution13 {
    public int romanToInt(String s) {
    	
    	int val =0;
    	
    	Map<Character,Integer> map=new HashMap<Character,Integer>();  
    	  map.put('I',1);
    	  map.put('V',5);
    	  map.put('X',10);
    	  map.put('L',50);
    	  map.put('C',100);
    	  map.put('M',1000);
    	  map.put('D',500);
    	    
    	
    	
    	for (int i = s.length() - 1; i >= 0; i--) {
    		char c = s.charAt(i);
    		    	
    	if(i!=0) {
    		
    		if(map.get(c)>map.get(s.charAt(i-1)))
        		val = val + map.get(c) - (2 * map.get(s.charAt(i-1)));
    		else 
        		val = val + map.get(c);
    	}
    	else
    		val = val + map.get(c);
 
    		
    	}
    	return val;
    	
    }
}

public class leet13 {
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
            
            int ret = new Solution13().romanToInt(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}