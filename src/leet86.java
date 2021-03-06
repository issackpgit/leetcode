//Author : Issac Koshy Panicker
//06-20-2018

import java.io.*;
import java.util.*;

class Solution86 {
    public ListNode partition(ListNode head, int x) {
        
    		ListNode temp1 = new ListNode(0);
    		ListNode temp2 = new ListNode(0);
    		ListNode ptr1 = temp1;
    		ListNode ptr2 = temp2;
    		
    		ListNode ptr = head;
    		
    		while(ptr!=null) {
    			if(ptr.val<x) {
    				ptr1.next = new ListNode(ptr.val);
    				ptr = ptr.next;
    				ptr1 = ptr1.next;
    			}
    			else {
    				ptr2.next = new ListNode(ptr.val);
    				ptr = ptr.next;
    				ptr2 = ptr2.next;
    		
    			}
    		}
    		temp2=temp2.next;
    		ptr2 = temp2;
    		while(ptr2!=null) {
    			ptr1.next = new ListNode(ptr2.val);
    			ptr1 = ptr1.next;
    			ptr2 = ptr2.next;
    		}
    		
    	return temp1.next;
    }
}

public class leet86 {
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
            int x = Integer.parseInt(line);
            
            ListNode ret = new Solution86().partition(head, x);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}