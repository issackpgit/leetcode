package practice;

public class Queue<T> {
	T data;
	Queue<T> next;
	
	public Queue(T data) {
		this.data = data;
	}
	
	Queue<T> first;
	Queue<T> last;
	
	public void add(T item) {
		Queue<T> t = new Queue<T>(item);
		if(last!=null) {
			last.next = t;
		}
		last = t;
		if(first == null) {
			first = last;
		}
	}
	
	public T remove() {
		if(first== null) return null;
		T data = first.data;
		first = first.next;
		if(first==null)
			last=null;
		return data;
	}
}
