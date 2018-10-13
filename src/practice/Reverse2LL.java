package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*  WARNING:
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
class Solution92 {
    ListNode tail = new ListNode(0);
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
    		
        if(head == null) return null;
        if(m==n) return head;
        int t =m;
        ListNode dummy  = new ListNode(0);
        dummy.next = head;
        
        ListNode ptr = dummy;
        while(m>1){
            ptr = ptr.next;
            m--;
        }
        
        ListNode prenext = ptr.next;
        
        ptr.next = revrec(ptr.next, n-t);
        
        prenext.next = tail;
        
        
        return dummy;
        
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode pre = dummy;
//        for(int i = 0;i<m-1;i++) pre = pre.next;
//        ListNode preNext = pre.next;
//        pre.next = revrec(pre.next,n-m);
//        preNext.next = tail;
//        return dummy.next;
    }
    
    public ListNode revrec(ListNode head, int key){
    	
        if(key==0){
            tail = head.next;
            return head;
        }
        
        ListNode ret = revrec(head.next, --key);
        head.next.next = head;
        head.next = null;
        return ret;
    }
    
    
}

public class Reverse2LL {
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
            int m = Integer.parseInt(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            ListNode ret = new Solution92().reverseBetween(head, m, n);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
} 


