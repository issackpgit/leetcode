package hackerrank;

public class hack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int l=96;
		int r = 97;
		int[] a =new int[r-l/2];
		int j=0;
		for(int i=l;i<=r;i++) {
			if(i%2==1) {
				a[j]=i;
				j++;
			}
		}
	for(int i =0;i<a.length;i++)
		System.out.println(a[i]);
		
	}

}
