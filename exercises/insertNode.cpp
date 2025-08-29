#include <iostream>
#include <string>

using namespace std;

class SinglyLinkedListNode {
    public:
        int data;
        SinglyLinkedListNode *next;

        SinglyLinkedListNode(int node_data) {
            this->data = node_data;
            this->next = nullptr;
        }
};

class SinglyLinkedList {
    public:
        SinglyLinkedListNode *head;
        SinglyLinkedListNode *tail;

        SinglyLinkedList() {
            this->head = nullptr;
            this->tail = nullptr;
        }

        void insert_node(int node_data) {
            SinglyLinkedListNode* node = new SinglyLinkedListNode(node_data);

            if (!this->head) {
                this->head = node;
            } else {
                this->tail->next = node;
            }

            this->tail = node;
        }
};

void print_singly_linked_list(SinglyLinkedListNode* node, string sep) {
    while (node) {
        cout << node->data;

        node = node->next;

        if (node) {
            cout << sep;
        }
    }
    cout << endl;
}

void free_singly_linked_list(SinglyLinkedListNode* node) {
    while (node) {
        SinglyLinkedListNode* temp = node;
        node = node->next;

        delete temp;
    }
}

/*
 * Complete the 'insertNodeAtPosition' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
 * The function accepts following parameters:
 *  1. INTEGER_SINGLY_LINKED_LIST llist
 *  2. INTEGER data
 *  3. INTEGER position
 */

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */

SinglyLinkedListNode* insertNodeAtPosition(SinglyLinkedListNode* llist, int data, int position) {
    SinglyLinkedListNode* currentNode = llist;
    SinglyLinkedListNode* previousNode = nullptr;
    SinglyLinkedListNode* newNode = new SinglyLinkedListNode(data);

    if (llist == nullptr) return nullptr;
    if (position < 0) return llist;
    if (position == 0) {
        newNode->next = llist;
        return newNode;
    }

    for (int currentPos = 0; currentPos < position; currentPos++) {
        previousNode = currentNode;
        currentNode = currentNode->next;
    }
    
    previousNode->next = newNode;
    newNode->next = currentNode;
    

    return llist;
}

// Test function to demonstrate the linked list insertion
void testInsertNodeAtPosition() {
    cout << "=== Testing Linked List Insertion ===\n\n";
    
    // Test Case 1: Insert at Position 0 (Beginning)
    cout << "Test Case 1: Insert 5 at Position 0\n";
    SinglyLinkedList* list1 = new SinglyLinkedList();
    list1->insert_node(1);
    list1->insert_node(2);
    list1->insert_node(3);
    
    cout << "Original list: ";
    print_singly_linked_list(list1->head, " -> ");
    
    SinglyLinkedListNode* result1 = insertNodeAtPosition(list1->head, 5, 0);
    cout << "After inserting 5 at position 0: ";
    print_singly_linked_list(result1, " -> ");
    
    // Test Case 2: Insert at Position 2 (Middle)
    cout << "\nTest Case 2: Insert 5 at Position 2\n";
    SinglyLinkedList* list2 = new SinglyLinkedList();
    list2->insert_node(1);
    list2->insert_node(2);
    list2->insert_node(3);
    list2->insert_node(4);
    
    cout << "Original list: ";
    print_singly_linked_list(list2->head, " -> ");
    
    SinglyLinkedListNode* result2 = insertNodeAtPosition(list2->head, 5, 2);
    cout << "After inserting 5 at position 2: ";
    print_singly_linked_list(result2, " -> ");
    
    // Test Case 3: Insert at End
    cout << "\nTest Case 3: Insert 5 at End\n";
    SinglyLinkedList* list3 = new SinglyLinkedList();
    list3->insert_node(1);
    list3->insert_node(2);
    list3->insert_node(3);
    
    cout << "Original list: ";
    print_singly_linked_list(list3->head, " -> ");
    
    SinglyLinkedListNode* result3 = insertNodeAtPosition(list3->head, 5, 3);
    cout << "After inserting 5 at position 3: ";
    print_singly_linked_list(result3, " -> ");
    
    // Clean up
    free_singly_linked_list(result1);
    free_singly_linked_list(result2);
    free_singly_linked_list(result3);
    
    cout << "\n=== All Tests Complete! ===" << endl;
}

int main()
{
    // Run the test function
    testInsertNodeAtPosition();
    
    return 0;
}
