package practice;

public class LongestCommonSubSeq {
	public static void main(String args[]) {
		
		LongestCommonSubSeq l = new LongestCommonSubSeq();
		
		 String str1 = "ABCDGHLQR";
	     String str2 = "AEDPHR";		
	     
	     int n = l.findLcs(str1.toCharArray(),str2.toCharArray());
	     System.out.println(n);
	}
	
	private int findLcs(char[] s1, char[] s2) {
		int A[][] = new int[s1.length+1][s2.length+1];
		int max = 0;
		
		for(int i =1;i<A.length;i++) {
			for(int j =1;j<A[i].length;j++) {
				if(s1[i-1]==s2[j-1]) {
					A[i][j] = A[i-1][j-1]+1;
				}
				else {
					A[i][j] = Math.max(A[i-1][j], A[i][j-1]);
				}
				
				max = Math.max(max, A[i][j]);
			}
		}
		
		return max;
		
	}
}
