package practice;

public class QuickSort {
	public int[] a = {9,8,7,6,5,4,3,2,1};
	
	public static void main(String args[]) {
		
		
		QuickSort q = new QuickSort();
		int start = 0;
		int end = q.a.length;
		
		q.sort(q.a,start,end-1);
		
		
		for(int i =0;i<q.a.length;i++)
			System.out.println(q.a[i]);
	}

	private void sort(int[] a, int start, int end) {
		if(start<end) {
			int p = partition(a,start,end);
			sort(a,start,p-1);
			sort(a,p+1,end);
		}
	}

	private int partition(int[] a, int start, int end) {
			
		int pivot = a[end];
		int pIndex = start;
		
		for(int i =pIndex;i<end;i++) {
			if(a[i]<=pivot) {
				swap(a,i,pIndex);
				pIndex++;
			}
		}
		
		swap(a,pIndex,end);
		
	return pIndex;
	}

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
