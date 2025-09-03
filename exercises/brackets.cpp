#include <stack>
#include <map>
#include <string>
#include <iostream>

using namespace std;

bool brackets(string str) {
    
    map<char, char> bracketPairs;
    bracketPairs[')']='(';
    bracketPairs['}']='{';
    bracketPairs[']']='[';
    stack<char> bracketStack;

    for (char brackets : str){
        if (bracketPairs.find(brackets) != bracketPairs.end()) {
            if (bracketStack.empty()){
            return false;
            }
            if (bracketPairs[brackets] == bracketStack.top()){
            bracketStack.pop();
            } else {
            return false;
            }
            continue;
        }
        if (brackets == '(') {
            bracketStack.push(brackets);
        }
        if (brackets == '[') {
            bracketStack.push(brackets);
        }
        if (brackets == '{') {
            bracketStack.push(brackets);
        }
    }
    if (bracketStack.empty()){
        return true;
    }
    if (!bracketStack.empty()){
        return false;
    }
}

// Test function
int main() {
    // Test cases
    cout << "Testing balanced brackets:" << endl;
    cout << "() -> " << (brackets("()") ? "true" : "false") << endl;
    cout << "()[]{} -> " << (brackets("()[]{}") ? "true" : "false") << endl;
    cout << "([{}]) -> " << (brackets("([{}])") ? "true" : "false") << endl;
    cout << "( -> " << (brackets("(") ? "true" : "false") << endl;
    cout << ") -> " << (brackets(")") ? "true" : "false") << endl;
    cout << "([)] -> " << (brackets("([)]") ? "true" : "false") << endl;
    cout << "((())) -> " << (brackets("((()))") ? "true" : "false") << endl;
    
    return 0;
}
