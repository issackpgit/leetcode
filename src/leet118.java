//Author : Issac Koshy Panicker
//07-01-2018

import java.io.*;
import java.util.*;

class Solution118 {
    public List<List<Integer>> generate(int n) {
    	
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	List<Integer> temp = new ArrayList<Integer>();
    	
    	for(int i =1;i<=n;i++) {
    		List<Integer> list1 = new ArrayList<Integer>();
    		for(int j = 1; j <= i ; j++) {
    			if(j==1 || j == i) {
    				list1.add(1);
    			}
    			else
    			{
    				list1.add(temp.get(j-2)+temp.get(j-1));
    			}
    			
    		}
    		temp = list1;
    		list.add(list1);
    	}
    	
    	
    	return list;
        
    }
}

public class leet118{
	public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        
        List ret =new Solution118().generate(n);
	}
}

