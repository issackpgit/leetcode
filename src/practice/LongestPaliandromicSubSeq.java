package practice;

public class LongestPaliandromicSubSeq {
	public static void main(String[] args) {
		String a = "acbba";
		
		LongestPaliandromicSubSeq l = new LongestPaliandromicSubSeq();
		
		int n = l.findAns(a);
		System.out.println(n);
	}

	private int findAns(String a) {
		
		int[][] dp = new int[a.length()][a.length()];
		
		for(int i = 0;i<a.length();i++) {
			dp[i][i]=1;
		}
		int j =0;
		for(int l=2;l<=a.length();l++) {
			for(int i =0;i<a.length()-l+1;i++) {
				j=i+l-1;
				if(a.charAt(i)==a.charAt(j)) {
					dp[i][j] = 2+dp[i+1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
				}
			}
		}
		return dp[0][a.length()-1];
	}
}
