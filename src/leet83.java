//Author : Issac Koshy Panicker
//01/01/2018

import java.io.*;

class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
    	
//    	if(head == null) return null;
//    	if(head.next == null) return head;
//    	
//    	ListNode temp = new ListNode(head.val);
//    	ListNode ptr = temp;
//    	
//    	int tempv = head.val;
//    	head = head.next;
//    	
//    	while(head!=null) {
//    	if(head.next!=null && (head.val == head.next.val) && (tempv!=head.val)) {
//        	ptr.next = new ListNode(head.val);
//    		head = head.next;
//        	ptr = ptr.next;
//    	}
//    	else {
//    		if(tempv!=head.val) {
//    		ptr.next = new ListNode(head.val);
//        	ptr = ptr.next;
//    		}
//    	}
//    	head = head.next;
//    	tempv = ptr.val;
//    	}
//        
//    	return temp;
    	
    	if(head == null || head.next == null) return head;
    	
    	ListNode ptr = head;
    	
    	while(ptr!=null) {
    	if(ptr.next!=null && (ptr.val == ptr.next.val)) {
        	ptr.next = ptr.next.next;
    	}
    	else {
        	ptr = ptr.next;
    		}
    	}
        
    	return head;
    
    }
}

public class leet83 {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode head = stringToListNode(line);
            
            ListNode ret = new Solution83().deleteDuplicates(head);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}