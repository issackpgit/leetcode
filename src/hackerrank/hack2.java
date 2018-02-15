//Author : Issac Koshy Panicker
//02-15-2018

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hack2 {

	
	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		String[][] s= new String[m][n];
		for(int i =0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				s[i][j]=in.readLine();
			}
		}
		
		int[][] a =solveMinesweeper(s);
		
		for(int i =0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}
	static int[][] solveMinesweeper(String[][] puzzleArray) {

       
       int m = puzzleArray[0].length;
       int n = puzzleArray.length;
       int[][] array = new int[m][n];
       
       //Rule 1;
       for(int i =0;i<m;i++) {
	    	   for(int j = 0;j<n;j++) {
	    		   if(puzzleArray[i][j].equals("m")) {
	    			   for (int p=-1; p<=1; p++) {
	    			        for (int q=-1; q<=1; q++) {
	    			            if ((p!=0) || (q!=0)) {
	    			                if (i+p>=0 && j+q>=0 && i+p<puzzleArray[0].length && j+q<puzzleArray.length) {
	    			                		array[i+p][j+q]+=1;
	    			                }
	    			                }
	    			            }
	    			        }
	    		   }
	    	   }
       }
       
       // Rule 2
       for(int i =0;i<m;i++) {
	    	   for(int j = 0;j<n;j++) {
	    		   if(puzzleArray[i][j].equals("m")) {
	    			   if(i+1<n && !puzzleArray[i+1][j].equals("m")) {
	    				   array[i+1][j] = 2;
	    			   }
	    		   }
	    	   
	    	   }
    	   }
       
       // Rule 3
       for(int i =0;i<m;i++) {
    	   for(int j = 0;j<n;j++) {
    		   if(puzzleArray[i][j].equals("m")) {
    			   if(j+1<m && !puzzleArray[i][j+1].equals("m")) {
    				   array[i][j+1]=0;
    			   }
    		   }
    		   
    	   }
    	   
    	   }
       
       //Rule 4
       for(int i =0;i<m;i++) {
    	   for(int j = 0;j<n;j++) {
    	    if(i%2==1) 
    	    		if(puzzleArray[i][j].equals("m")) {
    	    			for(int p = 0;p<n;p++) {
    	    				array[i][p]*=3;
    	    			}
    	    			break;
    	    		}
    	   }
    	   continue;
    	   }
       
       // Rule 5
       
       int[][] val = new int[m][n];
       
       for(int i =0;i<m;i++) {
    	   for(int j = 0;j<n;j++) {
    		   if(puzzleArray[i][j].equals("m")) {
    			   for(int p = -1;p<=1;p+=2) {
    				   for(int q= -1;q<=1;q+=2) {
    					   if(i+p>=0 &&  j+q>=0 && i+p<puzzleArray[0].length && j+q<puzzleArray.length && val[i+p][j+q]!=1) {
    						   val[i+p][j+q]=1;
    						   array[i+p][j+q]*=2;
    					   }
    				   }
    			   }
    		   }
    	   }
    	   }
       
       //Rule 6
       
       for(int i =0;i<m;i++) {
    	   for(int j = 0;j<n;j++) {
    		   if(puzzleArray[i][j].equals("m")) {
    			   array[i][j]=-1;
    		   }
    	   }
    	   
    	   }
       
       
       
       
	return array;
       
        
        

    }
	
}
