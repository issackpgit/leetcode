package practice;

public class MinEditDistance {
	public static void main(String args[]) {
		
		MinEditDistance l = new MinEditDistance();
		
		 String str1 = "abcdef";
	     String str2 = "azced";		
	     
	     int n = l.findMin(str1.toCharArray(),str2.toCharArray());
	     System.out.println(n);
	}
	
	private int findMin(char[] s1, char[] s2) {
		int A[][] = new int[s1.length+1][s2.length+1];
		
		for(int i =1;i<A.length;i++) {
			for(int j =1;j<A[i].length;j++) {
				if(s1[i-1]==s2[j-1]) {
					A[i][j] = A[i-1][j-1];
				}
				else {
					A[i][j] = Math.min(A[i-1][j], Math.min(A[i-1][j-1], A[i][j-1]))+1;
				}
			}
		}
		
		return A[s1.length][s2.length];
		
	}
}

