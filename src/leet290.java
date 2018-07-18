//Author : Issac Koshy Panicker
//07-18-2018

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution290 {
    public boolean wordPattern(String pattern, String str) {
    	String[] arr= str.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();
        if(arr.length!= pattern.length())
            return false;
        for(int i=0; i<arr.length; i++){
        		char c = pattern.charAt(i);
        		if(map.containsKey(c)) {
        			if(map.get(c).equals(arr[i])) {
        				continue;
        			}else {
        				return false;
        			}
        		}
        		else {
        			if(map.containsValue(arr[i]))
        				return false;
        			map.put(c, arr[i]);
        		}
        }
        return true;
    }
}

public class leet290 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String line,line1;
	        line = in.readLine();
	        line1 = in.readLine();
	        
	        boolean b = new Solution290().wordPattern(line,line1);
	        
	        System.out.println(b);
	       
}
}
