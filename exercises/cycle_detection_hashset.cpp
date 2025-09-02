#include <iostream>
#include <unordered_set>
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

// Alternative approach: Using Hash Set to track visited nodes
bool hasCycleHashSet(SinglyLinkedListNode* head) {
    // Edge case: empty list or single node
    if (head == nullptr || head->next == nullptr) {
        return false;
    }
    
    // Hash set to store visited node addresses
    unordered_set<SinglyLinkedListNode*> visitedNodes;
    
    SinglyLinkedListNode* current = head;
    
    // Traverse the list
    while (current != nullptr) {
        // If we've seen this node before, there's a cycle
        if (visitedNodes.find(current) != visitedNodes.end()) {
            return true;
        }
        
        // Add current node to visited set
        visitedNodes.insert(current);
        
        // Move to next node
        current = current->next;
    }
    
    // If we reach here, no cycle was found
    return false;
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

// Test and compare both approaches
void testAndCompareApproaches() {
    cout << "=== Comparing Cycle Detection Approaches ===\n\n";
    
    // Test 1: List with cycle
    cout << "🔴 Test 1: Linked List WITH Cycle\n";
    cout << "List structure: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 2 (cycle)\n";
    
    SinglyLinkedListNode* cycleList = createLinkedListWithCycle();
    printLinkedList(cycleList);
    
    bool hashSetResult = hasCycleHashSet(cycleList);
    cout << "Hash Set Approach: " << (hashSetResult ? "CYCLE DETECTED" : "NO CYCLE") << endl;
    cout << "Expected: CYCLE DETECTED\n\n";
    
    // Test 2: List without cycle
    cout << "🟢 Test 2: Linked List WITHOUT Cycle\n";
    cout << "List structure: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> nullptr\n";
    
    SinglyLinkedListNode* noCycleList = createLinkedListWithoutCycle();
    printLinkedList(noCycleList);
    
    bool noCycleHashSetResult = hasCycleHashSet(noCycleList);
    cout << "Hash Set Approach: " << (noCycleHashSetResult ? "CYCLE DETECTED" : "NO CYCLE") << endl;
    cout << "Expected: NO CYCLE\n\n";
    
    // Test 3: Edge cases
    cout << "⚡ Test 3: Edge Cases\n";
    cout << "Empty list: " << (hasCycleHashSet(nullptr) ? "CYCLE" : "NO CYCLE") << " (Expected: NO CYCLE)\n";
    
    SinglyLinkedListNode* singleNode = new SinglyLinkedListNode(42);
    cout << "Single node: " << (hasCycleHashSet(singleNode) ? "CYCLE" : "NO CYCLE") << " (Expected: NO CYCLE)\n";
    
    cout << endl;
}

// Analysis of both approaches
void analyzeApproaches() {
    cout << "=== Algorithm Analysis ===\n\n";
    
    cout << "🔴 Floyd's Algorithm (Tortoise & Hare):\n";
    cout << "  ✅ Time Complexity: O(n)\n";
    cout << "  ✅ Space Complexity: O(1) - only 2 pointers\n";
    cout << "  ✅ No extra memory needed\n";
    cout << "  ❌ More complex to understand\n";
    cout << "  ❌ Cannot find cycle length easily\n\n";
    
    cout << "🟢 Hash Set Approach:\n";
    cout << "  ✅ Time Complexity: O(n)\n";
    cout << "  ❌ Space Complexity: O(n) - stores all nodes\n";
    cout << "  ✅ Very intuitive and easy to understand\n";
    cout << "  ✅ Can easily find cycle length and entry point\n";
    cout << "  ❌ Uses extra memory\n\n";
    
    cout << "🎯 When to Use Each:\n";
    cout << "  • Use Floyd's when: Memory is limited, only need to detect cycle\n";
    cout << "  • Use Hash Set when: Memory available, need cycle details, want simplicity\n";
    cout << endl;
}

int main() {
    cout << "=== Hash Set Approach to Cycle Detection ===\n\n";
    
    // Test the hash set approach
    testAndCompareApproaches();
    
    // Analyze both approaches
    analyzeApproaches();
    
    cout << "=== Analysis Complete! ===\n";
    return 0;
}
