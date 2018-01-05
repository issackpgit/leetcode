//Author : Issac Koshy Panicker
//04-01-2018

import java.io.*;
import java.util.*;

class Solution500 {
    public String[] findWords(String[] words) {
        
    	 	Map<Character, Integer> map1 = new HashMap<Character, Integer>();
    	 	Map<Character, Integer> map2 = new HashMap<Character, Integer>();
    	 	Map<Character, Integer> map3 = new HashMap<Character, Integer>();
       	 
    	 	map1.put('Q',1);
    	 	map1.put('q',1);
    	 	map1.put('W',1);
    	 	map1.put('w',1);
    	 	map1.put('E',1);
    	 	map1.put('e',1);
    	 	map1.put('R',1);
    	 	map1.put('r',1);
    	 	map1.put('T',1);
    	 	map1.put('t',1);
    	 	map1.put('Y',1);
    	 	map1.put('y',1);
    	 	map1.put('U',1);
    	 	map1.put('u',1);
    	 	map1.put('I',1);
    	 	map1.put('i',1);
    	 	map1.put('O',1);
    	 	map1.put('o',1);
    	 	map1.put('P',1);
    	 	map1.put('p',1);
    	 	
    	 	map2.put('A',1);
    	 	map2.put('a',1);
    	 	map2.put('S',1);
    	 	map2.put('s',1);
    	 	map2.put('D',1);
    	 	map2.put('d',1);
    	 	map2.put('F',1);
    	 	map2.put('f',1);
    	 	map2.put('G',1);
    	 	map2.put('g',1);
    	 	map2.put('H',1);
    	 	map2.put('h',1);
    	 	map2.put('J',1);
    	 	map2.put('j',1);
    	 	map2.put('K',1);
    	 	map2.put('k',1);
    	 	map2.put('L',1);
    	 	map2.put('l',1);
    	 	
    	 	map3.put('Z',1);
    	 	map3.put('z',1);
    	 	map3.put('X',1);
    	 	map3.put('x',1);
    	 	map3.put('C',1);
    	 	map3.put('c',1);
    	 	map3.put('V',1);
    	 	map3.put('v',1);
    	 	map3.put('B',1);
    	 	map3.put('b',1);
    	 	map3.put('N',1);
    	 	map3.put('n',1);
    	 	map3.put('M',1);
    	 	map3.put('m',1);
    	 	
    	 	ArrayList list = new ArrayList();

    	 	int p =0,q=0,r=0;
    	 	for(String item : words) {
    	 		for(int i = 0;i< item.length();i++) {
    	 			if(map1.containsKey(item.charAt(i))) {
    	 				p++;
    	 			}
    	 			if(map2.containsKey(item.charAt(i))) {
    	 				q++;
    	 			}
    	 			if(map3.containsKey(item.charAt(i))) {
    	 				r++;
    	 			}
    	 		if(p==item.length()||q==item.length()||r==item.length()) {
    	 			list.add(item);
    	 			
    	 		}
    	 			
    	 		}
    	 		p=0;q=0;r=0;
    	 	}
    	 
    	 	String[] out = new String[ list.size() ];

    	 	for( int j = 0; j < out.length; j++ )

    	 	out[j] = list.get(j).toString();
    	
    	return out;
    }
}

public class leet500{
	public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        String[] inp = new String[n];
       
        for(int i =0;i<n ;i++) {
        	inp[i] = in.readLine();
        }
		
        String [] out = new Solution500().findWords(inp);
        
        for(int i =0;i<out.length ;i++) {
        		System.out.println(out[i]);        
        		}
		
	}
	
}
