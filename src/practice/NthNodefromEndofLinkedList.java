package practice;

public class NthNodefromEndofLinkedList {

	public static void main(String args[]) {
		NthNodefromEndofLinkedList n = new NthNodefromEndofLinkedList();
		
		ListNode node = new ListNode(0);
		ListNode ptr = node;
		int arr[] = {1,2,3,4,4,3,2,1};
		for(int i =0;i<arr.length;i++) {
			ptr.next = new ListNode(arr[i]);
			ptr = ptr.next;
		}
		
		ListNode head = node.next;
		int no =5;
		
		n.findNthNode(head,no);
	}

	private void findNthNode(ListNode head,int n) {

		ListNode fast = head;
		ListNode slow = head;
		ListNode prev = null; 
		
		for(int i = 0 ;i <n-1;i++) {
			fast = fast.next;
		}
		
		while(fast.next!=null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next;
		}
		
		prev.next = slow.next;
		
//		System.out.println(slow.val);
		
		ListNode ptr = head;
		while(ptr!=null) {
			System.out.print(ptr.val+"->");
			ptr=ptr.next;
		}
	}
	
}
