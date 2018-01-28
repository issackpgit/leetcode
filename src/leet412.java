//Author : Issac Koshy Panicker
//27-01-2018

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution412 {
    public List<String> fizzBuzz(int n) {
    	
    	List<String> list = new ArrayList<>();
    	
    	for(int i =1; i <=n;i++) {
    		if(i%3==0 && i%5==0) {
    			list.add("FizzBuzz");
    			continue;
    		}
    		if(i%3==0) {
    			list.add("Fizz");
    			continue;
    		}
    		if(i%5==0) {
    			list.add("Buzz");
    			continue;
    		}
    		list.add(Integer.toString(i));
    	}
    	
		return list;
        
    }
}

public class leet412{
	 public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int n =Integer.parseInt(in.readLine());
	        List<String> list = new Solution412().fizzBuzz(n);
	        for(String item :list) {
	        	System.out.println(" "+item+" ");
	        }
	 }
}