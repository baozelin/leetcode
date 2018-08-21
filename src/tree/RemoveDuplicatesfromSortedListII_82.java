package tree;



public class RemoveDuplicatesfromSortedListII_82 {
	public class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head == null || head.next == null) return head;
	        
	        //通过比较pre.next 和curr
	        ListNode help = new ListNode(0);
	        help.next = head;
	        ListNode pre = help;
	        ListNode cur = head;
	        while(cur!=null)
	        {
	      
	            while(cur.next!= null && pre.next.val == cur.next.val){
	                cur = cur.next;
	            }
	           
	           if(pre.next == cur){
	               pre = pre.next;
	           }else{
	               pre.next = cur.next;
	           }
	            
	        cur = cur.next;
	            
	        }
	           
	        return help.next;   
	    }
}
