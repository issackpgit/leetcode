//Author : Issac Koshy Panicker
//05-23-2018

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	ListNode l3 = new ListNode(0);
    	ListNode ptr = l3;
    	int temp =0;
    	while(l1!=null || l2!=null) {
    		
    		int a,b;
    		if(l1==null) {
    			a = 0;
    		}else {
    			a = l1.val;
    		}
    		if(l2==null) {
    			b = 0;
    		}else {
    			b = l2.val;
    		}
    		
    		ptr.next = new ListNode(((a+b) + temp) % 10);
    		temp = (a+b+temp) /10;
    		ptr = ptr.next;
    		if(l1!=null)
    		l1 = l1.next;
    		if(l2!=null)
    		l2 = l2.next;
    	}
    	if(temp != 0) {
    		ptr.next = new ListNode(temp);
    	}
    	return l3.next;
      
    }
}

public class leet2 {
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
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);
            
            ListNode ret = new Solution2().addTwoNumbers(l1, l2);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}