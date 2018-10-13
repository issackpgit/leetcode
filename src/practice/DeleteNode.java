package practice;

public class DeleteNode {

	public static void main(String args[]) {
		
		DeleteNode d = new DeleteNode();
		ListNode node = new ListNode(0);
		ListNode ptr = node;
		int arr[] = {1,2,3,4};
		for(int i =0;i<arr.length;i++) {
			ptr.next = new ListNode(arr[i]);
			ptr = ptr.next;
		}
		
		ListNode head = node.next;
		
		d.delete(head,4);
}

	private ListNode delete(ListNode head,int key) {
		if(head ==null) {
			return null;
		}
		if(head.val == key) {
			return head.next;
		}
		ListNode ret = delete(head.next, key);
		head.next = ret;
		return head;
	}
}
