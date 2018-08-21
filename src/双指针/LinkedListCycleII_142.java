package 双指针;

public class LinkedListCycleII_142 {
	
	 public ListNode detectCycle(ListNode head) {
	        if(head == null || head.next == null) return null;
	         // write your code here
	        ListNode slow = head, fast = head.next;
	        //先一个走2，一个走1
	        while(fast != null && fast.next != null){
	            if(fast == slow) break;
	            slow = slow.next;
	            fast = fast.next.next;
	            
	        }
	        
	        if(fast != slow) return null;
	        
	        //相遇后，一个从头，2个都每次走一，再相遇就是起点
	        while(head != slow.next){
	            head = head.next;
	            slow = slow.next;
	        }
	        return head;
	    }
	 
	
}
