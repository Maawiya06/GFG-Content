
/*

  Node is defined as
  struct Node {
    int data;
    struct Node *next;
    Node(int x) {
        data = x;
        next = NULL;
    }
};

*/
class Solution {
  public:
    // Function to sort a linked list of 0s, 1s and 2s.
    Node* segregate(Node* head) {

        // Add code here
        if(!head && !head->next) return head;
        
        Node* zerohead = new Node(-1);
        Node* onehead = new Node(-1);
        Node* twohead = new Node(-1);
        
        Node* zero = zerohead;
        Node* one = onehead;
        Node* two = twohead;
        
        Node* temp = head;
        
        while(temp){
            if(temp->data == 0){
                zero -> next = temp;
                zero = zero -> next;
            }
            else if (temp -> data == 1){
                one -> next = temp;
                one = one -> next;
            }
            else{
                two -> next = temp;
                two = two -> next;
            }
            
            temp = temp -> next;
        }
        
        // merge the three list
        zero -> next = onehead -> next ? onehead -> next : twohead-> next;
        one -> next = twohead -> next;
        two -> next = NULL;
        
        head = zerohead -> next;
        
        delete zerohead;
        delete onehead;
        delete twohead;
        
        return head;
    }
};


