package practice;

public class QusingStack {

	Stack<Integer> s1 = new Stack<Integer>() ;
	Stack<Integer> s2 = new Stack<Integer>() ;

	public static void main(String args[]) {
		QusingStack q = new QusingStack();
		q.enQ(1);
		q.enQ(2);
		q.enQ(3);
		System.out.println(q.dQ());
		q.enQ(4);
		System.out.println(q.dQ());
		System.out.println(q.dQ());
		System.out.println(q.dQ());
		q.enQ(5);
	}
	
	public void enQ(int item) {
		s1.push(item);
	}
	
	public int dQ() {
		if(s2.isEmpty()) {
			while(s1.peek()!=null) {
				int n = s1.pop();
				s2.push(n);
			}
		}
		int n = s2.pop();
		return n;
	}
}
