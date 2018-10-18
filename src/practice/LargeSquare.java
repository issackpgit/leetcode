package practice;

public class LargeSquare {
	public static void main(String args[]) {
		int[][] m = {{1,0,1,0,0},
					 {1,0,1,1,1},
					 {1,1,1,1,1},
					 {1,0,0,1,0}};

		LargeSquare l = new LargeSquare();

		int n = l.findSquare(m);
		System.out.println(n);
	}

	public int findSquare(int[][] m){
		int[][] t = new int[m.length][m[0].length];
		int max = 0;

		for(int i =0;i<m.length;i++){
			t[i][0]=m[i][0];
			if(t[i][0]==1)
				max=1;
		}

		for(int i =0;i<m[0].length;i++){
			t[0][i]=m[0][i];
			if(t[0][i]==1)
				max=1;
		}
		for(int i =1;i<m.length;i++){
			for(int j =1;j<m[0].length;j++){
				if(m[i][j] ==1){
					t[i][j] = Math.min(t[i-1][j-1],Math.min(t[i-1][j],t[i][j-1]))+1;
					max = Math.max(max, t[i][j]);
			}	
			}		
		}
		return max;
}
}
