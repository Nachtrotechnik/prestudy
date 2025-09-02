#include <iostream>
#include <string>

using namespace std;

// Node structure for singly linked list
struct SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode* next;
    
    SinglyLinkedListNode(int node_data) {
        this->data = node_data;
        this->next = nullptr;
    }
};

// Function to detect cycle in linked list using Floyd's algorithm
bool hasCycle(SinglyLinkedListNode* head) {
    // Edge case: empty list or single node
    if (head == nullptr || head->next == nullptr) {
        return false;
    }
    
    // Initialize two pointers: tortoise (slow) and hare (fast)
    SinglyLinkedListNode* tortoise = head;
    SinglyLinkedListNode* hare = head->next;
    
    // Move tortoise 1 step, hare 2 steps
    // If they meet, there's a cycle
    while (tortoise != hare) {
        // If hare reaches end, no cycle
        if (hare == nullptr || hare->next == nullptr) {
            return false;
        }
        
        tortoise = tortoise->next;        // Move 1 step
        hare = hare->next->next;          // Move 2 steps
    }
    
    // If we reach here, tortoise and hare met - cycle detected!
    return true;
}

// Function to create a linked list with a cycle for testing
SinglyLinkedListNode* createLinkedListWithCycle() {
    // Create nodes: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 2 (cycle back to 2)
    SinglyLinkedListNode* head = new SinglyLinkedListNode(0);
    SinglyLinkedListNode* node1 = new SinglyLinkedListNode(1);
    SinglyLinkedListNode* node2 = new SinglyLinkedListNode(2);
    SinglyLinkedListNode* node3 = new SinglyLinkedListNode(3);
    SinglyLinkedListNode* node4 = new SinglyLinkedListNode(4);
    SinglyLinkedListNode* node5 = new SinglyLinkedListNode(5);
    SinglyLinkedListNode* node6 = new SinglyLinkedListNode(6);
    
    // Build the list
    head->next = node1;
    node1->next = node2;
    node2->next = node3;
    node3->next = node4;
    node4->next = node5;
    node5->next = node6;
    node6->next = node2;  // Create cycle: 6 -> 2
    
    return head;
}

// Function to create a linked list without cycle for testing
SinglyLinkedListNode* createLinkedListWithoutCycle() {
    // Create nodes: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> nullptr
    SinglyLinkedListNode* head = new SinglyLinkedListNode(0);
    SinglyLinkedListNode* node1 = new SinglyLinkedListNode(1);
    SinglyLinkedListNode* node2 = new SinglyLinkedListNode(2);
    SinglyLinkedListNode* node3 = new SinglyLinkedListNode(3);
    SinglyLinkedListNode* node4 = new SinglyLinkedListNode(4);
    SinglyLinkedListNode* node5 = new SinglyLinkedListNode(5);
    SinglyLinkedListNode* node6 = new SinglyLinkedListNode(6);
    
    // Build the list
    head->next = node1;
    node1->next = node2;
    node2->next = node3;
    node3->next = node4;
    node4->next = node5;
    node5->next = node6;
    node6->next = nullptr;  // No cycle
    
    return head;
}

// Function to print linked list (limited to avoid infinite loop with cycles)
// This function prints the linked list, but to avoid infinite loops in case of a cycle,
// it only prints up to 'maxNodes' nodes. If the list is longer than 'maxNodes', it assumes
// a cycle may be present and stops printing, displaying a warning message.
//
// Cycle detection here is not explicit; instead, the function simply limits the number of nodes printed.
// If a cycle exists, the traversal would otherwise never end, so this artificial limit prevents that.
//
// The 'maxNodes' parameter is defined as a function argument with a default value of 10.
// You can change this value when calling the function to print more or fewer nodes.

void printLinkedList(SinglyLinkedListNode* head, int maxNodes = 10) {
    SinglyLinkedListNode* current = head;
    int count = 0;

    cout << "Linked List: ";
    while (current != nullptr && count < maxNodes) {
        cout << current->data;
        if (current->next != nullptr) {
            cout << " -> ";
        }
        current = current->next;
        count++;
    }

    if (count >= maxNodes) {
        cout << "... (cycle detected or list too long, stopping to avoid infinite loop)";
    }
    cout << endl;
}

// Test function
void testCycleDetection() {
    cout << "=== Testing Cycle Detection Algorithm ===\n\n";
    
    // Test 1: List with cycle
    cout << "Test 1: Linked List WITH Cycle\n";
    SinglyLinkedListNode* cycleList = createLinkedListWithCycle();
    printLinkedList(cycleList);
    
    // 'bool' stands for 'boolean', representing a true/false value in C++
    bool hasCycleResult = hasCycle(cycleList);
    cout << "Cycle detected: " << (hasCycleResult ? "YES" : "NO") << endl;
    cout << "Expected: YES\n\n";

    
    
    // Test 2: List without cycle
    cout << "Test 2: Linked List WITHOUT Cycle\n";
    SinglyLinkedListNode* noCycleList = createLinkedListWithoutCycle();
    printLinkedList(noCycleList);
    
    bool noCycleResult = hasCycle(noCycleList);
    cout << "Cycle detected: " << (noCycleResult ? "YES" : "NO") << endl;
    cout << "Expected: NO\n\n";
    
    // Test 3: Edge cases
    cout << "Test 3: Edge Cases\n";
    cout << "Empty list: " << (hasCycle(nullptr) ? "YES" : "NO") << " (Expected: NO)\n";
    
    SinglyLinkedListNode* singleNode = new SinglyLinkedListNode(42);
    cout << "Single node: " << (hasCycle(singleNode) ? "YES" : "NO") << " (Expected: NO)\n";
    
    cout << "\n=== All Tests Complete! ===\n";
}

int main() {
    testCycleDetection();
    return 0;
}
