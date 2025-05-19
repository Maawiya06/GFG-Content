//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    struct Node* next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};

void printList(Node* node) {
    while (node != NULL) {
        cout << node->data << " ";
        node = node->next;
    }
    cout << "\n";
}


// } Driver Code Ends


/*

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
    int getLength(Node* head) {
        int len = 0;
        Node* temp = head;
        while (temp) {
            len++;
            temp = temp->next;
        }
        return len;
    }

    Node* rotate(Node* head, int k) {
        // Edge cases
        if (head == NULL || head->next == NULL || k == 0) return head;

        int len = getLength(head);
        k = k % len;  // Reduce unnecessary full rotations

        if (k == 0) return head;  // No change needed

        // Find the new tail (kth node from the start)
        Node* temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp->next;
        }

        // New head will be the next node after kth node
        Node* newHead = temp->next;
        temp->next = NULL;  // Break the list

        // Find the last node of the remaining list
        Node* lastNode = newHead;
        while (lastNode->next != NULL) {
            lastNode = lastNode->next;
        }

        // Connect last node to original head
        lastNode->next = head;

        return newHead;
    }
};






//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    cin.ignore();

    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;

        // Read numbers from the input line
        while (ss >> number) {
            arr.push_back(number);
        }

        Node* head = nullptr;

        // Check if the array is empty
        if (!arr.empty()) {
            head = new Node(arr[0]);
            Node* tail = head;
            for (size_t i = 1; i < arr.size(); ++i) {
                tail->next = new Node(arr[i]);
                tail = tail->next;
            }
        }
        int k;
        cin >> k;
        cin.ignore();

        Solution ob;
        head = ob.rotate(head, k);
        printList(head);
        cout << "~\n";
    }
    return 1;
}

// } Driver Code Ends