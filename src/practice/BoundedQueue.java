package practice;

public class BoundedQueue {
	int capacity;
	int array[];
	int start, end, count;
	
	public BoundedQueue(int c) {
		capacity = c;
		array = new int[c];
		start = 0;
		end = 0;
		count =0;
	}
	
	public void enQueue(int x) throws Exception {
		if(end == capacity && start!=0) {
			end =0;
		}
		if(end == capacity && start==0) {
			System.out.println("Error for "+x);
			return;
		}
		
		if(count == capacity) {
			System.out.println("Error for "+x);
			return;
		}
		else {
			array[end] = x;
			end++;
			count++;
		}
	}
	
	public int deQ() {
		
		if(start==0 && end ==0) {
			System.out.println("Q empty");
			return -1;
		}
		int n = array[start];
		array[start] = -1;
		start++;
		if(start==capacity)
			{
			start=0;
			if(end==capacity) {
				end = 0;
			}
			}
		count--;
		
		return n;
		
	}
	public void print() {
		for(int i =0;i< capacity;i++) {
			System.out.print(array[i]+"-->");
		}
	}
	
	public static void main(String args[]) throws Exception {
		BoundedQueue b = new BoundedQueue(5);
		
		b.enQueue(1);
		b.enQueue(2);
		b.enQueue(3);
		b.enQueue(4);
		b.enQueue(5);
		b.enQueue(6);
		b.deQ();
		b.deQ();
		b.deQ();
		b.deQ();
		b.deQ();
		b.enQueue(7);
		b.enQueue(7);
		b.enQueue(7);
		b.enQueue(7);
		b.enQueue(7);
		b.enQueue(7);
		b.deQ();
		b.deQ();
		b.deQ();
		b.deQ();
		b.deQ();
		b.deQ();
		

		
		b.print();
	}
}
