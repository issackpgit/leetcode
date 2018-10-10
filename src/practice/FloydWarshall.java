package practice;

public class FloydWarshall {
	public static void main(String args[]) {
		FloydWarshall f = new FloydWarshall();
		
		int arr[][] = new int[4][4];
		
		arr[0][0] = 0;
		arr[0][1] = 3;
		arr[0][2] = 10000;
		arr[0][3] = 7;
		
		arr[1][0] = 8;
		arr[1][1] = 0;
		arr[1][2] = 2;
		arr[1][3] = 10000;
	
		arr[2][0] = 5;
		arr[2][1] = 10000;
		arr[2][2] = 0;
		arr[2][3] = 1;
		
		arr[3][0] = 2;
		arr[3][1] = 10000;
		arr[3][2] = 10000;
		arr[3][3] = 0;
		
		f.findAllPairShortest(arr);
		
//		System.out.println(A);
	}

	private void findAllPairShortest(int[][] A) {
		for(int k =0;k<4;k++) {
			for(int i =0;i<4;i++) {
				for(int j=0;j<4;j++) {
					if(A[i][k]+ A[k][j] < A[i][j])
					A[i][j] = A[i][k]+ A[k][j] ;
				}
			}
		}
	}
}
