//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

/* Linked list Node */
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};

vector<int> take() {
    vector<int> arr;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int number;
    while (ss >> number) {
        arr.push_back(number);
    }
    return arr;
}

Node* inputList(int size, vector<int> v) {
    if (size == 0)
        return NULL;

    int val = v[0];

    Node* head = new Node(val);
    Node* tail = head;

    for (int i = 0; i < size - 1; i++) {
        val = v[i + 1];
        tail->next = new Node(val);
        tail = tail->next;
    }

    return head;
}


// } Driver Code Ends


// Linked list Node
/*
class Node {
public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};
*/

class Solution {
  public:
    Node* intersectPoint(Node* head1, Node* head2) {
        // Step 1: Get lengths of both lists
        int len1 = 0, len2 = 0;
        Node* a = head1;
        Node* b = head2;

        while (a) {
            len1++;
            a = a->next;
        }
        while (b) {
            len2++;
            b = b->next;
        }

        a = head1;
        b = head2;
        int diff = abs(len1 - len2);

        if (len1 > len2) {
            while (diff--) {
                a = a->next;
            }
        } else {
            while (diff--) {
                b = b->next;
            }
        }

        
        while (a && b) {
            if (a == b) return a;
            a = a->next;
            b = b->next;
        }

        return NULL;  
    }
};






//{ Driver Code Starts.

/* Driver program to test above function*/
int main() {
    int T, n1, n2, n3;

    cin >> T;
    cin.ignore();
    while (T--) {

        vector<int> v1 = take();
        vector<int> v2 = take();
        vector<int> v3 = take();
        int n1 = v1.size(), n2 = v2.size(), n3 = v3.size();

        Node* head1 = NULL;
        Node* head2 = NULL;
        Node* common = NULL;

        head1 = inputList(n1, v1);
        head2 = inputList(n2, v2);
        common = inputList(n3, v3);

        Node* temp = head1;
        while (temp != NULL && temp->next != NULL)
            temp = temp->next;
        if (temp != NULL)
            temp->next = common;

        temp = head2;
        while (temp != NULL && temp->next != NULL)
            temp = temp->next;
        if (temp != NULL)
            temp->next = common;

        Solution ob;
        Node* intersectNode = ob.intersectPoint(head1, head2);
        cout << intersectNode->data << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends