package tree;

public class RemoveDuplicatesfromSortedList_83 {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        
        ListNode pre = head;
        ListNode curr = head.next;
        
        while(curr != null){
            if(curr.val != pre.val){
                pre = curr;
                curr = curr.next;
                continue;
            }
            
            while(curr.next != null && pre.val == curr.next.val){
                curr = curr.next;
            }
            pre.next = curr.next;
            curr = curr.next;
        }
        return head;
    }
	
	
	public class ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
}
