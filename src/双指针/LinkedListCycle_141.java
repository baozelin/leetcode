package 双指针;
class ListNode {
    int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
/**
 * 2个lists, 一个head开始+每次下一个，另一个head.next开始+每次下两个， 
 * @author zelinbao
 *
 */
public class LinkedListCycle_141 {
	public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode l1 = head;
        ListNode l2 = head.next;
        
        while(l1 != null && l2 != null){
            
            if(l1 == l2 ) return true;
            l1 = l1.next;
            if(l2.next == null) break;
            l2 = l2.next.next;
            
        }
        return false;
    }
}
