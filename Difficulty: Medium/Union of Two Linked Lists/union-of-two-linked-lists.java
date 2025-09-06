/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        Set<Integer> set = new TreeSet<>();
        
        Node curr = head1;
        while(curr != null){
            set.add(curr.data);
            curr = curr.next;
        }
        
        curr = head2;
        while(curr != null){
            set.add(curr.data);
            curr = curr.next;
        }
        
        Node dummy = new Node(0);
        Node tail = dummy;
        for(int val : set){
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return dummy.next;
    }
}