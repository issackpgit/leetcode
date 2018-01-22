//Author : Issac Koshy Panicker
//21-01-2018

import java.io.*;
import java.util.*;

class Solution234 {
    public boolean isPalindrome(ListNode head) {
    	
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	ListNode ptr = head;
    	
    	while(ptr!=null) {
    		stack.push(ptr.val);
    		ptr=ptr.next;
    	}
      	
    	while(!stack.isEmpty()) {
    		int val = stack.pop();
    		if(val!=head.val) return false;
    		head= head.next;
    	}

    	return true;
    	
    }
}

public class leet234 {
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
            
            boolean ret = new Solution234().isPalindrome(head);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}