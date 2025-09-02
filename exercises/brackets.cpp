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
    // This is a range-based for loop: it iterates directly over each element in 'str'
    // For example, for (char c : str) will assign each character of the string 'str' to 'c' in each iteration.
    // In contrast, a classic for loop with i++ would look like:
    // for (size_t i = 0; i < str.length(); i++) {
    //     char c = str[i];
    //     // ... use c ...
    // }
    // The difference: 'for (char c : str)' is more concise and directly gives you each character,
    // while 'for (size_t i = 0; i < str.length(); i++)' uses an index variable 'i' and requires you to access elements by index.
    for (char char brackets : str);
    if 
}
