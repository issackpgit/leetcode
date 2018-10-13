package practice;

public class MergeSort {
	
	public int a[] = {9,8,7,6,5,4,3,2,1};
	public static void main(String args[]) {
		MergeSort m = new MergeSort();
		int start = 0;
		int end = m.a.length-1;
		m.sort(m.a,start,end);
		
		for(int i =0;i<m.a.length;i++)
			System.out.println(m.a[i]);
	}
	
	private void sort(int[] a, int start, int end) {
		
		int mid = (start+end)/2;
		
		if(start<end) {
			sort(a,start,mid);
			sort(a,mid+1,end);
			merge(a,start,mid,end);
		}		
	}

	private void merge(int[] a, int start, int mid, int end) {
		int nL = mid-start+1;
		int nR = end-mid;
		
		int i =0;
		int j = 0;
		int k =start;
		
		int[] L = new int[nL];
		int[] R = new int[nR];
		
		for(int p =0;p<nL;p++) {
			L[p]=a[p+start];
		}
		for(int p = 0;p<nR;p++) {
			R[p] = a[p+mid+1];
		}
		
		while(i<nL && j<nR) {
			if(L[i]<=R[j]) {
				a[k]=L[i];
				i++;
			}else {
				a[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<nL) {
			a[k] = L[i];
			k++;i++;
		}
		while(j<nR) {
			a[k] = R[j];
			k++;j++;
		}
		
	}
}
