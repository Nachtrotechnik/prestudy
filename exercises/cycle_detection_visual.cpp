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

// Visual demonstration of Floyd's algorithm step by step
void demonstrateFloydsAlgorithm(SinglyLinkedListNode* head) {
    cout << "=== Step-by-Step Floyd's Algorithm Demonstration ===\n\n";
    
    if (head == nullptr) {
        cout << "Empty list - no cycle possible\n";
        return;
    }
    
    // Initialize pointers
    SinglyLinkedListNode* tortoise = head;
    SinglyLinkedListNode* hare = head->next;
    
    cout << "Initial positions:\n";
    cout << "Tortoise (slow) at: " << tortoise->data << endl;
    cout << "Hare (fast) at: " << (hare ? hare->data : -1) << endl;
    cout << endl;
    
    int step = 1;
    
    // Move pointers step by step
    while (tortoise != hare && hare != nullptr && hare->next != nullptr) {
        cout << "Step " << step << ":\n";
        
        // Move tortoise 1 step
        tortoise = tortoise->next;
        cout << "  Tortoise moves 1 step: " << tortoise->data << endl;
        
        // Move hare 2 steps
        hare = hare->next->next;
        cout << "  Hare moves 2 steps: " << (hare ? hare->data : -1) << endl;
        
        cout << "  Positions: Tortoise=" << tortoise->data 
             << ", Hare=" << (hare ? hare->data : -1) << endl;
        cout << endl;
        
        step++;
        
        // Safety check to avoid infinite loop in demonstration
        if (step > 20) {
            cout << "Stopping demonstration to avoid infinite loop...\n";
            break;
        }
    }
    
    if (tortoise == hare) {
        cout << "🎯 CYCLE DETECTED!\n";
        cout << "Tortoise and Hare met at node with value: " << tortoise->data << endl;
        cout << "This proves there's a cycle in the linked list.\n";
    } else {
        cout << "✅ NO CYCLE DETECTED\n";
        cout << "Hare reached the end of the list.\n";
    }
    
    cout << endl;
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

int main() {
    cout << "=== Floyd's Algorithm Visual Demonstration ===\n\n";
    
    // Demonstrate with cycle
    cout << "🔴 DEMONSTRATION 1: Linked List WITH Cycle\n";
    cout << "List structure: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 2 (cycle)\n\n";
    
    SinglyLinkedListNode* cycleList = createLinkedListWithCycle();
    demonstrateFloydsAlgorithm(cycleList);
    
    // Demonstrate without cycle
    cout << "🟢 DEMONSTRATION 2: Linked List WITHOUT Cycle\n";
    cout << "List structure: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> nullptr\n\n";
    
    SinglyLinkedListNode* noCycleList = createLinkedListWithoutCycle();
    demonstrateFloydsAlgorithm(noCycleList);
    
    cout << "=== Demonstration Complete! ===\n";
    return 0;
}
