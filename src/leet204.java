//Author : Issac Koshy Panicker
//10-01-2018

import java.io.*;

class Solution204 {
    public int countPrimes(int n) {
    	
    	boolean[] a =new boolean[n];
    	int count =0;
    	for(int i=2;i<n;i++){
    		if(!a[i]) {
    			count++;
    			for(int j = 2;i*j<n;j++) {
    				a[i*j]=true;
    			}
    		}
    	}
    	
         return count;
         
//int[] a= new int[n-2];
//
//for(int i = 2,j=0;i<n;i++,j++)
//    	a[j]=i;
//
//boolean[] b = new boolean[a.length];
//
//for(int i =0;i<a.length;i++) {
//	
//if(!b[i]) {
//for(int j =i+1;j<a.length;j++) {
//	if(a[j]%a[i]==0) {
//		b[j]=true;
//	}
//}
//} 	
//  }    	
// int c = 0;
//for(int i =0;i<b.length;i++) {
//	if(!b[i]) c++;
//}
//    	
//    	
//return c;    	
         
         
//        if(n==0) return 0;
//
//        int c =0;
//        n--;
//    	while(n>1) {
//    		int temp = n,flag=0;
//    	for(int i = 2;i<=temp/2;i++) {
//    		if(temp%i ==0) {
//    			flag=1;
//    			break;	
//    		}
//    	}
//    	if(flag == 0) {
//    		c++;  		
//    	}
//    	
//    		n--;
//    	}
//    	return c;
    }
}

public class leet204 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution204().countPrimes(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}