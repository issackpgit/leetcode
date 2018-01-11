//Author : Issac Koshy Panicker
//11-01-2018

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Solutionexam {
    public int solution(int[] a) {
    	    
         Map<Integer, Integer> cur = new TreeMap<Integer, Integer>();
          
         for(int i =0 ; i<a.length;i++) {
        	 cur.put(a[i], cur.getOrDefault(a[i], 0)+1);
         }
         int distinctcount = cur.size();

         cur=new TreeMap<Integer,Integer>();
         int begin = 0, end = -1; 
         int best = -1; 
         int ansbegin = 0, ansend = 0; 
         int cnt = 0; 
         final int inpsize = a.length;
         while(true)
         {
             if( cnt < distinctcount )
             {
                 ++end;
                 if (end == inpsize) {
                     break;
                 }
                 if( cur.get(a[end]) == null ) {
                     ++cnt;
                     cur.put(a[end], 1);
                 } 
                 else
                 {
                     cur.put(a[end],cur.get(a[end])+1);
                 }
                 continue;
             }
             
             while (cur.get(a[begin]) != null && cur.get(a[begin]) > 1) // we have another such element later in the subsequence
             {
                 cur.put(a[begin],cur.get(a[begin])-1);
                 ++begin;
             }
            
             if( best == -1 || end - begin < best )
             {
                 best = end - begin;
                 ansbegin = begin;
                 ansend = end;
             }
            
             if (cur.get(a[begin]) != null) {
                 cur.put(a[begin],cur.get(a[begin])-1);
             }
             ++begin;
             --cnt;
         }
   
     
         return ansend-ansbegin+1;
         
//    	 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//    	
//    	 for(int i =0;i<a.length;i++) {
//    		 map.put(a[i], i);
//    	 }
//    	 int N =a.length;
//    	 int u = map.size();
//    	 boolean[] flag = new boolean[N];
//    	 
//    	 int bestBegin = 0, bestLength = 0;
//    	 int begin = 0, end = 0, currLength = 0;
//    	 
//    	 for (; begin < N; begin++) {
//    	        while (end < N) {
//    	            if (flag[a[end]] == false) {
//    	                currLength+=1;
//    	                flag[a[end]] = true;
//    	                end+=1;
//    	            }
//    	            else {
//    	                break; // end-loop
//    	            }
//    	        }
//    	        if (currLength > bestLength) {
//    	            bestLength = currLength;
//    	            bestBegin = begin;
//    	        }
//    	        if (bestLength >= u) {
//    	            break; // begin-loop
//    	        }
//    	        flag[a[begin]] = false; // reset
//    	        currLength-=1;
//    	    }
//    	return bestLength;
    	
//        int strokes=0;
//        int level =0;
//    	  for (int height : A) {
//    		  if (height > level)
//    	        {
//    	            strokes += height - level;
//    	            level = height;
//    	        }
//    	  else if (height < level)
//          {
//              level = height;
//          }
//    		  if (strokes > 1000000000)
//    	            return -1;
//    	  }
//    	  return strokes;    
    	
    	
    	
//        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        
//        for(int i =0;i<A.length;i++){
//            map.put(A[i], i);
//        }
//        int i=1;
//        while (map.containsKey(i)) {
//            i++;
//        }
//        
//        return i;
    }
}

public class exam{
	 public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       
	        int n =Integer.parseInt(in.readLine());
	        int[] a =new int[n];
	        for(int i =0;i<n;i++) {
	        	a[i]=Integer.parseInt(in.readLine());
	        }
	        int b= new Solutionexam().solution(a);
	        
	        System.out.println(b);
	        }
	    }