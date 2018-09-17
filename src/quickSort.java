import java.io.IOException;

public class quickSort {

    public static void main(String[] args) throws IOException {
    		int a[] = {9,8,7,6,5,4,3,2,1};
    		quicksort(a,0,a.length-1);
    }

	private static void quicksort(int[] a, int low, int high) {
		if(low<high) {
			int p = partition(a,low,high);
			quicksort(a,low,p-1);
			quicksort(a,p+1,high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int len = a.length;
		int p = high;
		for(int i =high-1;i>=0;i--)
		{
			if(a[p]<a[i]) {
				int t = a[i];
				a[i]=a[p];
				a[p]=t;
				p = i;
			}
		}
		return p;
	}
}
