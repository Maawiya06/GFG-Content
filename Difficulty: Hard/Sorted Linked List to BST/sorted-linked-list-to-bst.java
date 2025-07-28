// User function Template for Java

/*Linked List Node
class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d;
        next = null;
    }
}

//Tree Node
class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }

}*/

class Solution {
    public TNode sortedListToBST(LNode head) {
        // code here
        if(head == null) return null;
        if(head.next == null) return new TNode (head.data);
        
        LNode prev = null;
        LNode slow = head;
        LNode fast = head;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(prev != null){
            prev.next = null;
        }
        
        TNode root = new TNode(slow.data);
        if(head != slow){
            root.left = sortedListToBST(head);
        }
        root.right = sortedListToBST(slow.next);
        
        return root;
    }
}