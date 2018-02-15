//Author : Issac Koshy Panicker
//02-15-2018

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hack3 {
	/*
	 * Complete the function below.
	 */
	
public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(in.readLine());
		
		String[] s= new String[m];
		for(int i =0;i<m;i++) {
			
				s[i]=in.readLine();
			
		}
		
		String[] a = strengthenPasswords(s);
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}

	    static String[] strengthenPasswords(String[] passwords) {
	    	
				for(int i =0;i<passwords.length;i++) {
				if(passwords[i].toLowerCase().indexOf('s')!=-1) {
	    			for (int index1 = passwords[i].toLowerCase().indexOf('s');index1 >= 0;index1 = passwords[i].toLowerCase().indexOf('s', index1 + 1))
	    				{
	    				passwords[i] = passwords[i].substring(0,index1)+'5'+passwords[i].substring(index1+1);	    				
	    				}
	    			
	    			
	    		}
				
				Character.isDigit(passwords[i].charAt(passwords[i].length()/2));
				
			if(passwords[i].length()!=1 && passwords[i].length()%2!=0 && Character.isDigit(passwords[i].charAt(passwords[i].length()/2))) {
				
				int c = Character.getNumericValue(passwords[i].charAt(passwords[i].length()/2)) *2;
				
				passwords[i] = passwords[i].substring(0,passwords[i].length()/2)+Integer.toString(c)+passwords[i].substring(passwords[i].length()/2+1);
				
			}
			
			if(passwords[i].length()%2==0) {
				char temp = passwords[i].charAt(0);
				char last = passwords[i].charAt(passwords[i].length()-1);
				
				
				if(Character.isLowerCase(temp)){
					temp=Character.toUpperCase(temp);
				}
				else
					temp = Character.toLowerCase(temp);
				if(Character.isLowerCase(last)){
					last=Character.toUpperCase(last);
				}
				else
					last = Character.toLowerCase(last);
				
				passwords[i] = passwords[i].substring(0,0)+last+passwords[i].substring(1);
				passwords[i] = passwords[i].substring(0,passwords[i].length()-1)+temp+passwords[i].substring(passwords[i].length());
				
			}
			
			if(passwords[i].toLowerCase().indexOf("nextcapital")!=-1){
				int index = passwords[i].toLowerCase().indexOf("nextcapital");
				String temp =passwords[i].substring(index,index+4);
				passwords[i]=passwords[i].replaceAll(temp, new StringBuilder(temp).reverse().toString());
//				passwords[i] =  passwords[i].substring(0,index)+new StringBuilder(temp).reverse().toString()+passwords[i].substring(index+1);
				
				
			}
			
	    	}
	    	
	    	
	    	
			return passwords;

	    	

	    }


}
