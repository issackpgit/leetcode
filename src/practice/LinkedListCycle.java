package practice;

import java.awt.List;

public class LinkedListCycle {
	public static void main(String args[]) {
		LinkedListCycle l = new LinkedListCycle();
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node5;
		
		
		ListNode head = node1;
		
		
//		ListNode ptr1 = head;
//		while(ptr1!=null) {
//			System.out.println(ptr1.val+"->");
//			ptr1 = ptr1.next;
//		}
		
		l.findCycleHead(head);
	}
	
	private void findCycleHead(ListNode head) {
		ListNode fast = head.next;
		ListNode slow = head;
		ListNode start = head;
		boolean flag = true;
		
		
		while(fast!=slow)
		{
			if(fast==null && slow!= null && fast.next==null)
				{
				flag = false;
				}
			fast = fast.next.next;
			slow = slow.next;
			
		}
		
		if(flag) {
		slow = slow.next;
			while(head!=slow) {
				head = head.next;
				slow = slow.next;
			}
			
			System.out.println(slow.val); 
		}
	}
}
