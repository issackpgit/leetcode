//Author : Issac Koshy Panicker
//02-15-2018

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hack4 {
	
public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(in.readLine());
		int m = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		int[][] s= new int[m][n];
		for(int i =0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				s[i][j]=Integer.parseInt(in.readLine());
			}
		}
		System.out.println(maxFlorists(p, s));
}

static int maxFlorists(int pathLength, int[][] floristIntervals) {

	int s =0;
	
	int[] array = new int[pathLength+1];
	int m = floristIntervals[0].length;
	int n = floristIntervals.length;
	int i;
	for(i =0;i<n;i++) {
			int start = floristIntervals[i][0];
			int end = floristIntervals[i][1];
			
//			int diff = pathLength - end;
			if(end >pathLength) end = pathLength;
			for(int j = start;j<=end;j++) {
				array[j]+=1;
				if(array[j]==3) return i+1;
			}
		
	}
		return i;
}
}
