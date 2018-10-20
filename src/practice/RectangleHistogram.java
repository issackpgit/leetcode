package practice;

public class RectangleHistogram {
	public static void main(String args[]) {
		RectangleHistogram r = new RectangleHistogram();
		int a[] = {1,1};
		int n = r.findHist(a);
		System.out.println(n);
	}

	private int findHist(int[] a) {
		Stack<Integer> s = new Stack<Integer>();
		
		int i =0,area = 0, max = -1;
		
		int n = a.length;
		while(i<n) {
			
			if(s.isEmpty() || a[s.peek()]<=a[i]) {
				s.push(i);
			}
			else
				{
				while(!s.isEmpty() && a[s.peek()]>a[i]) {
					int top = s.pop();
					if(s.isEmpty()) {
						area = a[top] * i;
					}
					else {
						area = a[top] * (i-s.peek()-1);
					}
					max = Math.max(max, area);
				}
				s.push(i);
			}
			
			i++;
			
		}			
			while(!s.isEmpty()) {
				int top = s.pop();
				if(s.isEmpty()) {
					area = a[top] * i;
				}
				else {
					area = a[top] * (i-s.peek()-1);
				}
				max = Math.max(max, area);
			}

		
		return max;
	}
}
