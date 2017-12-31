import java.io.*;

class Solution67 {
    public String addBinary(String a, String b) {
    	
    	int al = a.length();
    	int bl = b.length();
    	int carry = 0; 
    	String c = "";
    	int diff = 0;
    	
    	if(bl<al) {
    		diff = al-bl;
    		String temp = new StringBuffer(b).reverse().toString();
    		while(diff!=0) {
    			temp+=0;
    			diff--;
    		}
    		b = new StringBuffer(temp).reverse().toString();
    		bl = al;
    	}
    	if(bl>al) {
    		diff = bl-al;
    		String temp = new StringBuffer(a).reverse().toString();
    		while(diff!=0) {
    			temp+=0;
    			diff--;
    		}
    		a = new StringBuffer(temp).reverse().toString();
    		al=bl;
    	}
    	
    	for(int i = al-1, j = bl-1; i >= 0 ; i--,j--) {
    		
    		if((a.charAt(i) == '0') && (b.charAt(j)=='1') && carry == 0) {
    			c+='1';
    			carry = 0;
    			continue;
    		} 
    		
    		if((a.charAt(i) == '0') && (b.charAt(j)=='1') && carry == 1) {
    			c+='0';
    			carry =1;
    			continue;
    		}
    		
    		if((a.charAt(i) == '1') && (b.charAt(j)=='0') && carry == 0) {
    			c+='1';
    			carry = 0;
    			continue;
    		}
    		if((a.charAt(i) == '1') && (b.charAt(j)=='0') && carry == 1) {
    			c+='0';
    			carry =1;
    			continue;
    		}
    			
    		if((a.charAt(i) == '1') && (b.charAt(j)=='1') && carry == 0) {
    			c+='0';
    			carry =1;
    			continue;
    		}
    		if((a.charAt(i) == '1') && (b.charAt(j)=='1') && carry == 1) {
    			c+='1';
    			carry =1;
    			continue;
    		}
    		
    		if((a.charAt(i) == '0') && (b.charAt(j)=='0') && carry == 0) {
    			c+='0';
    			carry =0;
    			continue;
    		}
    		if((a.charAt(i) == '0') && (b.charAt(j)=='0') && carry == 1) {
    			c+='1';
    			carry =0;
    			continue;
    		}
    		
    	}
    	
    	if(carry ==1) c+=1;
        
    	return new StringBuffer(c).reverse().toString();
    	
    }
}

public class leet67 {
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
            String a = stringToString(line);
            line = in.readLine();
            String b = stringToString(line);
            
            String ret = new Solution67().addBinary(a, b);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}