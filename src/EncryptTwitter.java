import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EncryptTwitter {
	
	private static String key;
	
    public static String decrypt(String encrypted_message) {

    		findKey("-Atvt hrqgse, Cnikg");
    		
    		String out = decryptMsg(encrypted_message);
    		return out;

	}

	private static String decryptMsg(String input) {
		int k = 0;
		String d = "";
		for(int i = 0; i < input.length(); i++) {
			if(k == key.length()) {
				k = 0;
			}
			if (input.charAt(i) >= 65 && input.charAt(i) <= 122) {
				int r = key.charAt(k) - 48;
				int ch = input.charAt(i) - r;
				if((input.charAt(i) >=65 && input.charAt(i) <= 90) && ch < 65) {
					ch = ch + 26;
				}else if((input.charAt(i) >=97 && input.charAt(i) <= 122) &&ch < 97) {
					ch = ch + 26;
				}
				char c = (char)ch;
				d = d + c;
				k++;
			}else {
				d = d + input.charAt(i);
			}
		}
		return d;
	}

	private static void findKey(String str) {
	
	    	String[] splitStr = str.split("\\s*(,|-|\\s)\\s*");
	    	String[] string = {"Your","friend","Alice"};

	    	String output = "";
	    	int j = 1;
	    	while(j<=3){
	    	for(int i =0;i<splitStr[j].length();i++) {
	    		int n =(int)splitStr[j].charAt(i)-(int)string[j-1].charAt(i);
	    		if(n<0) {
	    			n=26+n;
	    		}
	    		output+=n;
	    	}
	    	j++;
	    	}

	    	int total = 107;
	    	int m = total%7;
	    	int start = output.length()-m-7;
	    	int end = output.length()-m;
	    	
	    	key = output.substring(start, end);
	}
	

		public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = "/Users/issackoshypanicker/Desktop/Output.txt";
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        String res;
	        String _encrypted_message;
	        try {
	            _encrypted_message = in.nextLine();
	        } catch (Exception e) {
	            _encrypted_message = null;
	        }
	        
	        res = decrypt(_encrypted_message);
	        System.out.println(res);
	        bw.write(res);
	        bw.newLine();
	        in.close();
	        bw.close();
	    }
	}


    