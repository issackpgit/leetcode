package practice;

public class LinkedListPaliandrome {

	public static void main(String args[]) {
		LinkedListPaliandrome l = new LinkedListPaliandrome();
		
		ListNode node = new ListNode(0);
		ListNode ptr = node;
		int arr[] = {1,2,3,4,3,2,1};
		for(int i =0;i<arr.length;i++) {
			ptr.next = new ListNode(arr[i]);
			ptr = ptr.next;
		}
		
		ListNode head = node.next;
		
		l.isPaliandrome(head);
	}

	private void isPaliandrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode prevOfMid = null;
		ListNode middle = null;
		
		while(fast!=null && fast.next!=null) {
			prevOfMid = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast!=null)
		{
			middle = slow;
			slow = slow.next;
		}
		
		ListNode rev = reverse(slow);
		
		if(compare(head,rev)){
			System.out.println("Paliandrome");
		}
			else {
				System.out.println("Not Paliandrome");
			}
		
	}

	private boolean compare(ListNode head, ListNode rev) {

		ListNode p = head;
		ListNode q = rev;
		
		while(q!=null ) {
			if(p.val != q.val) {
				return false;
			}
			p = p.next;
			q = q.next;
		}
		
		return true;
	}

	private ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode ptr = head;
		ListNode next = null;
		
		while(ptr!=null) {
			next = ptr.next;
			ptr.next = prev;
			prev = ptr;
			ptr = next;
		}
		return prev;
		
	}
	
}
