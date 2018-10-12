package practice;

public class QuickSort {
	public int[] a = {2,4,3,1,6,5,8};
	
	public static void main(String args[]) {
		
		
		QuickSort q = new QuickSort();
		int start = 0;
		int end = q.a.length;
		
		q.sort(q.a,start,end);
		
		System.out.println(q.a);
	}

	private void sort(int[] a, int start, int end) {
		if(start<end) {
			int p = partition(a,start,end);
			sort(a,start,p-1);
			sort(a,p+1,end-1);
		}
	}

	private int partition(int[] a, int start, int end) {
			
		int pivot = a[start];
		
		int i =start;
		int j = end;
		
		
		while(i<j) {
			do {
				i++;
			}
			while(a[i]<pivot);
			
			do {
				j--;
			}
			while(a[j]>pivot);
			
			swap(a,i,j);
		}
		
		swap(a,start,j);
		return j;
	}

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
