
/*
  Node is defined as
    struct node
    {
        int data;
        struct Node* next;

        Node(int x){
            data = x;
            next = NULL;
        }

    }*head;
*/

class Solution {
  public:
    Node* reverseKGroup(Node* head, int k) {
    if (!head || k == 1) return head; // Edge case: empty list or k=1 (no change)

    // Count total nodes
    Node* temp = head;
    int count = 0;
    while (temp) {
        count++;
        temp = temp->next;
    }

    // Reverse k nodes
    Node* prev = NULL;
    Node* curr = head;
    Node* nextNode = NULL;
    int pos = 0;

    while (pos < k && curr) {
        nextNode = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nextNode;
        pos++;
    }

    // If there are more nodes left, recurse for the next group
    if (curr) {
        head->next = reverseKGroup(curr, k);
    }

    return prev;  // New head after reversal
}

};


