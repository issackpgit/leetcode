package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solutionrll {
    public void reorderList(ListNode head) {
        if(head == null || head.next==null) return ;
        
        ListNode ptr = head;
        ListNode fast = head, small = head;
        ListNode prev = null;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = small;
            small = small.next;
        }
        ListNode rev = reverse(small);
        prev.next = rev;
        ListNode ptr1 = rev;
        ListNode n1=null,n2=null;
    
        while(ptr!=prev){
             prev.next = ptr1.next;
             ptr1.next = ptr.next;
             ptr.next = ptr1;
             ptr = ptr1.next;
             ptr1 = prev.next;
                  
//            prev.next=ptr1.next;
//                ptr1.next=ptr.next;
//                ptr.next=ptr1;
//                ptr=ptr1.next;
//                ptr1=prev.next;
//            
            
            
        }
        
    }
    
    public ListNode reverse(ListNode node){
        if(node.next == null) 
            return node;
        
        ListNode ret = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return ret;
    }
}

public class ReorderLinkedList {
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
            
            new Solutionrll().reorderList(head);
            String out = listNodeToString(head);
            
            System.out.print(out);
        }
    }
}