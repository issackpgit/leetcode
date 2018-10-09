package practice;

public class Stack<T> {
	T data;
	Stack<T> next;
	Stack<T> top;
	
	public Stack(T data) {
		this.data = data;
	}
	public Stack() {
		this.data = null;
	}
	
	public void push(T item) {
		Stack<T> t = new Stack<T>(item);
		t.next = top;
		top = t;
	}
	
	public T pop() {
		if(top == null) return null;
		T d = top.data;
		top = top.next;
		return d;
	}
	
	public T peek() {
		if(top ==null) return null;
		return top.data;
	}
	
	public boolean isEmpty() {
		if(top ==null) return true;
		else return false;
	}
}
