//{ Driver Code Starts
// Initial template for C++

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
        cout << node->data % 10;
        node = node->next;
    }
    cout << "\n";
}


// } Driver Code Ends


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
  
    Node* reverseLL(Node* head){
        Node* prev = NULL;
        Node* curr = head;
        
        while(curr != NULL){
            Node* newNode = curr->next;
            curr->next = prev;
            prev = curr;
            curr = newNode;
        }
        return prev;
    }
    
    Node* addOne(Node* head) {
        // Your Code here
        
        head = reverseLL(head);
        
        int carry = 1;
        Node* temp = head;
        Node* prev = NULL;
        
        while(temp != NULL){
            int totalsum = temp->data+carry;
            int digit = totalsum % 10;
            carry = totalsum/10;
            
            prev = temp;
            temp->data = digit;
            temp = temp->next;
            
            if(carry == 0){
               break;
            }
        }
            
            if(carry != 0){
                prev->next = new Node(carry);
                }
                
                return reverseLL(head);
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
        while (ss >> number) {
            arr.push_back(number);
        }

        if (arr.empty()) {
            cout << -1 << endl;
            continue;
        }

        int data = arr[0];
        struct Node* head = new Node(data);
        struct Node* tail = head;
        for (int i = 1; i < arr.size(); ++i) {
            data = arr[i];
            tail->next = new Node(data);
            tail = tail->next;
        }
        Solution ob;
        head = ob.addOne(head);
        printList(head);
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends