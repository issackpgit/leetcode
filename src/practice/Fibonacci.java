package practice;

public class Fibonacci {
	public static void main(String args[]) {
		int n =12;
		int a = 0,b = 1,c = 0;
		int arr[] = new int[n];
		arr[0]=0;
		arr[1]=1;
		for(int i =2;i<n;i++) {
			arr[i] = arr[i-1]+arr[i-2];
			c = a+b;
			a=b;
			b=c;
		}
		
		System.out.println(c);
		System.out.println(arr[n-1]);
	}
}
