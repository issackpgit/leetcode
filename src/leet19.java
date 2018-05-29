//Author : Issac Koshy Panicker
//05-28-2018

import java.io.*;
import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	
    		ListNode list = new ListNode(0);
    		ListNode ptr = list;
    		ListNode temp = head;
    		ListNode main = head;
    		
    		while(temp!=null) {
    			if(n!=0) {
	    			temp = temp.next;
	    			n--;
    			}
    			else {
    				break;
    			}
    		}
    		ListNode t = temp;
    		if(temp!=null) {
	    		while(temp!=null && main!=null) {
	    				ptr.next = new ListNode(main.val);
	    				temp = temp.next;
	    				main = main.next;
	    				ptr = ptr.next;
	    				if(temp==null&&main!=null) {
	    					main = main.next;
	    					temp = main;
	    				}
	    		}
    		}
    		else {
    			return main.next;
    		}

    	
    	return list.next;
    	
//    	ListNode list = new ListNode(0);
//    	ListNode temp = head;
//    	ListNode ptr = list;
//    	int c =0;
//    	while(head!=null) {
//    		c++;
//    		head =head.next;
//    	}    	
//    	int t = c - n;
//    	if(t==0 && c==1)
//    		return null;
//    	while(temp!=null) {
//    		if(t==0) {
//    			ptr.next= temp.next;
//    			if(temp.next!=null)
//    				temp = temp.next;
//    			else 
//    				break;
//    		}
//    		else {
//    			
//	    		ptr.next = new ListNode(temp.val);
//	    		temp=temp.next;
//	    		ptr = ptr.next;
//    		}
//    		t--;
//    	}
//    	return list.next;
    }
}

public class leet19 {
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
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            ListNode ret = new Solution19().removeNthFromEnd(head, n);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}