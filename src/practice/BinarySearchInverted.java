package practice;

public class BinarySearchInverted {
	public static void main(String args[]) {
		BinarySearchInverted b = new BinarySearchInverted();
		
		int[] a = {50,5,20,30,40};
		
		int left = 0;
		int right = a.length -1;
		int n = b.search(a,left, right,5);
		System.out.println(n);
	}

	private int search(int[] a, int left, int right, int key) {
		int mid = (left+right)/2;
		
		if(a[mid]==key) {
			return mid;
		}
		
		if(right<left)
			return -1;
		
		if(a[left]<=a[mid]) {
			if(key>=a[left] && key<a[mid]) {
				return search(a,left,mid-1,key);
			}
			else
				return search(a,mid+1,right,key);
		}
		if(a[left]>a[mid]) {
			if(key<=a[left] && key<a[mid])
				return search(a,left,mid-1,key);
			else
				return search(a,mid+1,right,key);
		}
//		
		return -1;
	}
}
