//Author : Issac Koshy Panicker
//23-01-2018

import java.io.*;
import java.util.*;

class Solution141 {
    public boolean hasCycle(ListNode head) {
    	
    	  if (head == null || head.next == null) {
    	        return false;
    	    }
    	  
    	    	ListNode slow = head;
    	    	ListNode fast = head.next;
    	    	
    	    	while(slow!=fast) {
    	    		if(fast ==null || fast.next==null) {
    	    			return false;
    	    		}else
    	    			{
    	    			slow = slow.next;
    	    			fast = fast.next.next;
    	    			}
    	    	}
    	
    	    	return true;
    	    	
//    	Set<ListNode> set = new HashSet<ListNode>();
//    	
//    	while(head!=null) {
//    		if(set.contains(head)) {
//    			return true;
//    		}
//    		else set.add(head);
//    		head = head.next;
//    	}
//    	return false;
    	
    }
}

public class leet141 {
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode head = stringToListNode(line);
            
            boolean ret = new Solution141().hasCycle(head);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}