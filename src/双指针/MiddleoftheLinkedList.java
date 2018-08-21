package 双指针;

public class MiddleoftheLinkedList {
	
	
	public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        // write your code here
        ListNode slow = head, fast = head.next;
        while(fast != null && fast. next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
	
	
	//
	
	public ListNode middleNode2(ListNode head) {
	     if(head == null) return null;
	        // write your code here
	        ListNode slow = head, fast = head;
	        while(fast != null && fast. next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }
	
}
