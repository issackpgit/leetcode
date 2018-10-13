package practice;

public class RevLinkedListrecursion {
	public static void main(String args[]) {
		RevLinkedListrecursion r = new RevLinkedListrecursion();
		
		ListNode node = new ListNode(0);
		ListNode ptr = node;
		int arr[] = {1,2,3,4};
		for(int i =0;i<arr.length;i++) {
			ptr.next = new ListNode(arr[i]);
			ptr = ptr.next;
		}
		
		ListNode head = node.next;
		
		ListNode n = r.reverse(head);

	}

	private ListNode reverse(ListNode head) {
		if(head.next == null) {
			return head;
		}
		
		ListNode ret = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return ret;
	}
}
