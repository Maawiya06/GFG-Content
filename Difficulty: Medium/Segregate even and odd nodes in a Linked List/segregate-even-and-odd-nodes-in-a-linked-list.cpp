
// User function template for C++

/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }
};
*/
class Solution {
  public:
    Node* divide(Node* head) {
    if (!head || !head->next) return head;

    Node* evenHead = nullptr;
    Node* evenTail = nullptr;
    Node* oddHead = nullptr;
    Node* oddTail = nullptr;
    Node* curr = head;

    while (curr) {
        Node* nextNode = curr->next;  
        curr->next = nullptr; 

        if (curr->data % 2 == 0) {  // Even node
            if (!evenHead) {
                evenHead = evenTail = curr;
            } else {
                evenTail->next = curr;
                evenTail = curr;
            }
        } else {  // Odd node
            if (!oddHead) {
                oddHead = oddTail = curr;
            } else {
                oddTail->next = curr;
                oddTail = curr;
            }
        }
        curr = nextNode; 
    }

    // If no even numbers, return odd list directly
    if (!evenHead) return oddHead;

    // Attach odd list at the end of even list
    evenTail->next = oddHead;

    return evenHead;
}

};

