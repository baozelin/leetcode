package tree;

class MyLinkedList {
    
    private class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
    
    private ListNode head;
    int size;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
       head = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index > size) return -1;
        
        ListNode tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode tmp = new ListNode(val);
        tmp.next = head;
        head = tmp;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	if(size == 0) {
    		addAtHead(val);
    		return;
    	}
    	else {
    	
        ListNode tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new ListNode(val);
        size++;
    	}
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        ListNode tmp = head;
        for(int i = 0; i < index - 1; i++){
            tmp = tmp.next;
        }
        
        ListNode newNode = new ListNode(val);
        newNode.next = tmp.next;
        tmp.next = newNode;
        size++;
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	
    	 ListNode tmp = head;
         for(int i = 0; i < index-1; i++){
             tmp = tmp.next;
         }
         
         tmp.next = tmp.next.next;
        size--;
    }
    
    public static void main(String[]arg) {
    	MyLinkedList m = new MyLinkedList();
    	m.addAtTail(1);
    	m.addAtHead(0);
    	m.addAtTail(2);
    	//System.out.println(m.size);
    	//System.out.println(m.get(0));
    	//System.out.println(m.get(1));
    	//System.out.println(m.get(2));
    	//m.addAtIndex(1, 3);
    	//m.addAtIndex(1, 5);
    	m.deleteAtIndex(1);
    	System.out.println(m.get(0));
    	System.out.println(m.get(1));
    	//System.out.println(m.get(2));
    	
    	
    }
    
}




/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */