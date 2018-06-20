//Author : Issac Koshy Panicker
//06-20-2018

import java.io.*;
import java.util.*;

class Solution763 {
    public List<Integer> partitionLabels(String S) {
    	
    		int max =0;
    		int t =0;
    		int sum =0;
    		Map<Character, Integer> map = new HashMap<Character, Integer>();
    		for(int i =0;i<S.length();i++) {
    			map.put(S.charAt(i),i);
    		}

    		LinkedList<Integer> list = new LinkedList<Integer>();
    		max = map.get(S.charAt(0));
    		for(int i =1;i<S.length();i++) {
    			
	    			if(map.get(S.charAt(i))>max) {
	    				if(i<max) {
	    					max = map.get(S.charAt(i));
	    				}
	    				else {
	    					for(int k : list) {
	    						sum+=k;
	    					}
	    					
	    					if(t==0)
	    						list.add(i);
	    					else
	    						list.add(i - sum);
	    					max = map.get(S.charAt(i));
	    					t++;
	    				}
	    				
	    			}
    			sum =0;
    		}
//    		sum =0;
    		 for (int i: list) {
    		        sum += i;
    		    }
    		list.add(max+1 - sum);
    	
    		return list;
        
    }
}

public class leet763 {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.toString();
    }
    
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String S = stringToString(line);
            
            List<Integer> ret = new Solution763().partitionLabels(S);
            
            String out = integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}