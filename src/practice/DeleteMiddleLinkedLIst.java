package practice;

public class DeleteMiddleLinkedLIst {
	
	public static void main(String args[]) {
		DeleteMiddleLinkedLIst d = new DeleteMiddleLinkedLIst();
		ListNode node = new ListNode(0);
		ListNode ptr = node;
		for(int i =0;i<5;i++) {
			ptr.next = new ListNode(i);
			ptr = ptr.next;
		}
		
		ListNode head = node.next;
		
		d.deleteMiddle(head);
	}

	private void deleteMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		ListNode prev = null;
		ListNode next = null;
		
		ListNode ptr = head;
		
		while(fast!=null && fast.next!=null) {
			prev = slow;
			slow = slow.next;
			fast =fast.next.next;
		}
		prev.next = slow.next;
		
		ListNode ptr1 = head;
		while(ptr1!=null) {
			System.out.println(ptr1.val);
			ptr1 = ptr1.next;
		}
		
	}
	
}
