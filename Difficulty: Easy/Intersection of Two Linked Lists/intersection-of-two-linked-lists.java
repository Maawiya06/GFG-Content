/* structure of list Node:

class Node
{
    int data;
    Node next;

    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution {
    // Function to find the intersection of two linked lists
    public Node findIntersection(Node head1, Node head2) {
        // Use HashSet because we only need to check existence
        Set<Integer> set = new HashSet<>();
        
        Node curr = head2;
        while (curr != null) {
            set.add(curr.data);
            curr = curr.next;
        }
        
        Node dummy = new Node(0);  
        Node tail = dummy;
        
        curr = head1;
        while (curr != null) {
            if (set.contains(curr.data)) {
                tail.next = new Node(curr.data); 
                tail = tail.next;
            }
            curr = curr.next;
        }
        
        return dummy.next; 
    }
}
