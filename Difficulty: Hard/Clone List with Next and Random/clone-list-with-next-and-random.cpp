
/* Link list Node
struct Node {
    int data;
    Node *next;
    Node *random;

    Node(int x) {
        data = x;
        next = NULL;
        random = NULL;
    }
};*/

class Solution {
  public:
    Node *cloneLinkedList(Node *head) {
    if (!head) return nullptr;

    Node* it = head;
    
    // Step 1: Clone each node and insert after the original node
    while (it) {
        Node* clonedNode = new Node(it->data);
        clonedNode->next = it->next;
        it->next = clonedNode;
        it = clonedNode->next;
    }

    // Step 2: Copy the random pointer
    it = head;
    while (it) {
        Node* clonedNode = it->next;
        clonedNode->random = it->random ? it->random->next : nullptr;
        it = clonedNode->next;
    }

    // Step 3: Separate cloned list from original list
    it = head;
    Node* clonedHead = head->next;
    while (it) {
        Node* clonedNode = it->next;
        it->next = clonedNode->next;
        if (clonedNode->next) {
            clonedNode->next = clonedNode->next->next;
        }
        it = it->next;
    }

    return clonedHead;
}

};

